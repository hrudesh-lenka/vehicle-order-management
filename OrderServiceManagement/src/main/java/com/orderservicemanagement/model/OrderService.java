package com.orderservicemanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long customerId;

    private String customerName;

    private String email;

    private Long vehicleId;

    private String brand;

    private Float price;

//    public OrderService() {
//    }
//
//    public OrderService(Long orderId, Long customerId, String customerName, String email, Long vehicleId, String brand, Float price) {
//        this.orderId = orderId;
//        this.customerId = customerId;
//        this.customerName = customerName;
//        this.email = email;
//        this.vehicleId = vehicleId;
//        this.brand = brand;
//        this.price = price;
//    }
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public Long getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(Long customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Long getVehicleId() {
//        return vehicleId;
//    }
//
//    public void setVehicleId(Long vehicleId) {
//        this.vehicleId = vehicleId;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public Float getPrice() {
//        return price;
//    }
//
//    public void setPrice(Float price) {
//        this.price = price;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        OrderService that = (OrderService) o;
//        return Objects.equals(orderId, that.orderId) && Objects.equals(customerId, that.customerId) && Objects.equals(customerName, that.customerName) && Objects.equals(email, that.email) && Objects.equals(vehicleId, that.vehicleId) && Objects.equals(brand, that.brand) && Objects.equals(price, that.price);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(orderId, customerId, customerName, email, vehicleId, brand, price);
//    }
}
