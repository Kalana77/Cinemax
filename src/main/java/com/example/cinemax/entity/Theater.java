package com.example.cinemax.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long theaterId;

    String theater_name;

    long seat_Id;

    String location;


    public Theater(long seat_id, String theater_name, String location) {

    }

    public Theater(String theater_name, long seat_id, String location) {
        this.seat_Id = seat_id;
        this.theater_name = theater_name;
        this.location = location;
    }
}
