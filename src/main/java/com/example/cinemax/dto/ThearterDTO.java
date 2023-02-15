package com.example.cinemax.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ThearterDTO {
    long theater_Id;

    String theater_name;

    long seat_Id;

    String location;
}
