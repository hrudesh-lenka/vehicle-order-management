package com.orderservicemanagement.client;

import com.orderservicemanagement.dto.VehicleDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name = "vehicle-service")
public interface VehicleClient {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/vehicle/{vehicleId}")
    Optional<VehicleDto> getVehicleById(@PathVariable Long vehicleId);
}
