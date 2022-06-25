package com.orderservicemanagement.repository;

import com.orderservicemanagement.model.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderServiceRepository extends JpaRepository<OrderService, Long> {
}
