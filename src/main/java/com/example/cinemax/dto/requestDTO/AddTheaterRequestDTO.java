package com.example.cinemax.dto.requestDTO;

public class AddTheaterRequestDTO {
    String theater_name;

    long seat_Id;

    String location;


    public AddTheaterRequestDTO(String theater_name, long seat_Id, String location) {
        this.theater_name = theater_name;
        this.seat_Id = seat_Id;
        this.location = location;
    }


    public String getTheater_name() {
        return theater_name;
    }

    public void setTheater_name(String theater_name) {
        this.theater_name = theater_name;
    }

    public long getSeat_Id() {
        return seat_Id;
    }

    public void setSeat_Id(long seat_Id) {
        this.seat_Id = seat_Id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
