package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.CustomerSaveRequestDTO;
import com.example.cinemax.dto.responseDTO.UserBookingResponseDTO;
import javassist.NotFoundException;

public interface CustomerService {


    int addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    UserBookingResponseDTO getUserForBooking(int id) throws NotFoundException;
}
