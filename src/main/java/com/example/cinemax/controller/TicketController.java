package com.example.cinemax.controller;


import com.example.cinemax.dto.requestDTO.AddTicketRequestDTO;
import com.example.cinemax.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Ticket")
public class TicketController {

    @Autowired
    public TicketService ticketService;

    @PostMapping("/addTicket")
    public String addTicket(@RequestBody AddTicketRequestDTO addTicketRequestDTO) {
        String id = ticketService.addTicket(addTicketRequestDTO);
        return id;

    }

}
