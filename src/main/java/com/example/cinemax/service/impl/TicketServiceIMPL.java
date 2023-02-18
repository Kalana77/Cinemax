package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddTicketRequestDTO;
import com.example.cinemax.entity.Ticket;
import com.example.cinemax.repository.TicketRepo;
import com.example.cinemax.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceIMPL implements TicketService {

    @Autowired
    public ModelMapper modelMapper;

    @Autowired
    public TicketRepo ticketRepo;

    @Override
    public String addTicket(AddTicketRequestDTO addTicketRequestDTO) {
        Ticket ticket = new Ticket(
                addTicketRequestDTO.getBookingId(),
                addTicketRequestDTO.getMovieId(),
                addTicketRequestDTO.getTheaterId(),
                addTicketRequestDTO.getSeatNo(),
                addTicketRequestDTO.getPrice(),
                addTicketRequestDTO.getTicketQyt(),
                addTicketRequestDTO.getShowTime(),
                addTicketRequestDTO.getShowDate(),
                true
        );
        if(ticketRepo.findBybookingId(ticket.getBookingId()).isEmpty()){
            ticketRepo.save(ticket);
            return ticket.getTicketId() + "saved";
        }else {
            System.out.println("booking already exist");
            return "booking already exist";
        }

      //  return 0;
    }
}
