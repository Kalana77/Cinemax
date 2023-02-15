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
    long theater_Id;

    String theater_name;

    long seat_Id;

    String location;

    public Theater(long theater_Id, String theater_name, long seat_Id, String location) {
        this.theater_Id = theater_Id;
        this.theater_name = theater_name;
        this.seat_Id = seat_Id;
        this.location = location;
    }

    public Theater(long seat_id, String theater_name, long theater_id) {
        this.theater_name = theater_name;
        this.seat_Id = seat_Id;
        this.location = location;
    }
}
