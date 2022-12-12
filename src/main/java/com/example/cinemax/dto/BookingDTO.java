package com.example.cinemax.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class BookingDTO {
    private long bookingId;

    private long customerId;

    private long paymentId;

    private long ticketId;

    private Time bookingTime;

    private Date bookingData;

    private boolean activeStatus;
}
