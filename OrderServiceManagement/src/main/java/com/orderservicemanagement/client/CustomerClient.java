package com.orderservicemanagement.client;

import com.orderservicemanagement.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "customer-service")
public interface CustomerClient {
    @GetMapping("/api/v1/customer/{customerId}")
    Optional<CustomerDto> getCustomer(@PathVariable Long customerId);
}
