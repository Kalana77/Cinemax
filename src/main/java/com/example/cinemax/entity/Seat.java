package com.example.cinemax.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long SeatId;

    int SeatNo;

    int TheateId;

    public Seat(int seatNo, int theaterId) {
        this.SeatNo = seatNo;
        this.TheateId = theaterId;
    }


}
