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
@Table(name = "customer")
public class Ticket {

    @Id
    @Column(name = "ticketId",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
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



    public Ticket(long bookingId, long movieId, long theaterId, int seatNo, int price, int ticketQyt, Time showTime, Date showDate, boolean b) {
    }
}
