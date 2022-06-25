package com.orderservicemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDto {
    private Long customerId;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private Integer phoneNumber;

    private String email;
}
