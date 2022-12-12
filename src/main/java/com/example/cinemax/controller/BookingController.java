package com.example.cinemax.controller;


import com.example.cinemax.dto.requestDTO.AddBookingRequestDTO;
import com.example.cinemax.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/addBooking")
    public int addBooking(@RequestBody AddBookingRequestDTO addBookingRequestDTO){
        int id = bookingService.addBooking(addBookingRequestDTO);
        return id;
    }
}
