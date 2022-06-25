package com.orderservicemanagement.dao;

import com.orderservicemanagement.model.OrderService;
import com.orderservicemanagement.repository.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServiceDao implements Dao<OrderService> {

    @Autowired
    OrderServiceRepository orderServiceRepository;

    @Override
    public List<OrderService> getAll() {
        return orderServiceRepository.findAll();
    }

    @Override
    public Optional<OrderService> get(long id) {
        return orderServiceRepository.findById(id);
    }

    @Override
    public OrderService save(OrderService orderService) {
        return orderServiceRepository.save(orderService);
    }

    @Override
    public OrderService update(OrderService orderService) {
        return null;
    }

    @Override
    public void delete(long id) {
        orderServiceRepository.deleteById(id);
    }
}
