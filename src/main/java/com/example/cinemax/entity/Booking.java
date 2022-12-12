package com.example.cinemax.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "bookingId",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookingId;

    private long customerId;

    private long paymentId;

    private long ticketId;

    private Time bookingTime;

    private Date bookingData;

    private boolean activeStatus;

    public Booking(long bookingId, long customerId, long paymentId, long ticketId, Time bookingTime, Date bookingData, boolean activeStatus) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.paymentId = paymentId;
        this.ticketId = ticketId;
        this.bookingTime = bookingTime;
        this.bookingData = bookingData;
        this.activeStatus = activeStatus;
    }

    public Booking(long customerId, long paymentId, long ticketId, Time bookingTime, Date bookingData, boolean b) {
    }
}
