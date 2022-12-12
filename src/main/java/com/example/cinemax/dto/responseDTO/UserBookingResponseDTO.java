package com.example.cinemax.dto.responseDTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserBookingResponseDTO {
    private String customerName;

    private String email;

    private int mobileNumber;
}
