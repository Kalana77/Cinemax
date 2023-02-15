package com.example.cinemax.service;

import com.example.cinemax.dto.SeatDTO;
import javassist.NotFoundException;

public interface SeatService {


    int addSeat(SeatDTO seatDTO);

    boolean deleteSeat(int id) throws NotFoundException;
}
