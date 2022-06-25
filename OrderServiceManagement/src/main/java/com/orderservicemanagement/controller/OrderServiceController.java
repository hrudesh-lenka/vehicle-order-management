package com.orderservicemanagement.controller;

import com.orderservicemanagement.client.CustomerClient;
import com.orderservicemanagement.client.VehicleClient;
import com.orderservicemanagement.dao.OrderServiceDao;
import com.orderservicemanagement.dto.CustomerDto;
import com.orderservicemanagement.dto.OrderRequest;
import com.orderservicemanagement.dto.VehicleDto;
import com.orderservicemanagement.model.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orderservice")
public class OrderServiceController {
    @Autowired
    CustomerClient customerClient;

    @Autowired
    VehicleClient vehicleClient;

    @Autowired
    OrderServiceDao orderSericeDao;

    @GetMapping("/")
    public String home(){
        return "Order Service";
    }

    @PostMapping("/create")
    public OrderService createOrder(@RequestBody OrderRequest orderRequest){
        Optional<VehicleDto> vehicle = vehicleClient.getVehicleById(orderRequest.getVehicleId());
        Optional<CustomerDto> customer = customerClient.getCustomer(orderRequest.getCustomerId());
        if (vehicle.isPresent() && customer.isPresent()){
            OrderService orderPersist = new OrderService();
            orderPersist.setCustomerName(customer.get().getFirstName() +" "+ customer.get().getLastName());
            orderPersist.setEmail(customer.get().getEmail());
            orderPersist.setBrand(vehicle.get().getBrand());
            orderPersist.setPrice(vehicle.get().getPrice());
            orderPersist.setVehicleId(vehicle.get().getSerialNumber());
            orderPersist.setCustomerId(customer.get().getCustomerId());
            return orderSericeDao.save(orderPersist);
        }
        else{
            throw new IllegalArgumentException("User or vehicle not found");
        }
    }
}
