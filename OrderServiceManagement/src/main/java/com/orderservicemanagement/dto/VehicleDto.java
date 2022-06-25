package com.orderservicemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleDto {
    private Long serialNumber;

    private String name;

    private String brand;

    private String cc;

    private Integer tankCapacity;

    private Integer mileage;

    private Float price;
}
