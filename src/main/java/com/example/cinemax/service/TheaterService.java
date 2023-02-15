package com.example.cinemax.service;

import com.example.cinemax.dto.ThearterDTO;
import javassist.NotFoundException;

public interface TheaterService {
    int addTheater(ThearterDTO thearterDTO);

    boolean deleteTheater(int id) throws NotFoundException;
}
