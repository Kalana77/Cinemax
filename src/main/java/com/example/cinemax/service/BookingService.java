package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.AddBookingRequestDTO;
import org.springframework.stereotype.Service;


public interface BookingService {
    int addBooking(AddBookingRequestDTO addBookingRequestDTO);
}
