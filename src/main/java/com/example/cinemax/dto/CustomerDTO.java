package com.example.cinemax.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerDTO {

   private long customerId;

   private String customerName;

   private String email;

   private String password;

    private int mobileNumber;

    private boolean activeStatus;


}
