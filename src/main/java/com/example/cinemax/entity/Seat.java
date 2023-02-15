package com.example.cinemax.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Seat_id;

    int Seat_no;

    int Theater_id;


    public Seat(long seat_id, int seat_no, int theater_id) {
        this.Seat_id = seat_id;
        this.Seat_no = seat_no;
        this.Theater_id = theater_id;
    }

    public Seat(int seat_no, int theater_id) {
        this.Seat_no = seat_no;
        this.Theater_id = theater_id;
    }
}
