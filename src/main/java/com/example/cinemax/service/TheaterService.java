package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.AddTheaterRequestDTO;
import javassist.NotFoundException;

public interface TheaterService {
    String addTheater(AddTheaterRequestDTO addTheaterRequestDTO);

    boolean deleteTheater(int id) throws NotFoundException;
}
