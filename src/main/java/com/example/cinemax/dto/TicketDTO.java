package com.example.cinemax.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class TicketDTO {

    private long ticketId;

    private long bookingId;

    private long movieId;

    private long theaterId;

    private int seatNo;

    private int price;

    private int ticketQyt;

    private Time showTime;

    private Date showDate;

    private boolean activeStatus;
}
