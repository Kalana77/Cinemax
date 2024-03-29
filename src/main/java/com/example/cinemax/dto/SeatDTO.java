package com.example.cinemax.dto;

import lombok.*;


@NoArgsConstructor
@Setter
@Getter
public class SeatDTO {
//    long Seat_id;

    int seatNo;

    int theaterId;


    public SeatDTO(int seatno, int theaterid) {
        seatNo = seatno;
        theaterId = theaterid;
    }


    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }
}
