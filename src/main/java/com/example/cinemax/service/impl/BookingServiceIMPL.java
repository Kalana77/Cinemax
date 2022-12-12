package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddBookingRequestDTO;
import com.example.cinemax.entity.Booking;
import com.example.cinemax.repository.BookingRepo;
import com.example.cinemax.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookingServiceIMPL implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public int addBooking(AddBookingRequestDTO addBookingRequestDTO) {
        Booking booking = new Booking(
                addBookingRequestDTO.getCustomerId(),
                addBookingRequestDTO.getPaymentId(),
                addBookingRequestDTO.getTicketId(),
                addBookingRequestDTO.getBookingTime(),
                addBookingRequestDTO.getBookingData(),
                true
        );
        if (bookingRepo.findAllByticketId(booking.getTicketId()).isEmpty()) {
            bookingRepo.save(booking);
            return Integer.parseInt(booking.getCustomerId() + "saved");
        }else {
            System.out.println("Ticket already exist");
            return Integer.parseInt("Booking already exist");
        }


    }
}
