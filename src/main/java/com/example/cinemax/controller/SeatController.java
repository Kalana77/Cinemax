package com.example.cinemax.controller;

import com.example.cinemax.dto.SeatDTO;
import com.example.cinemax.service.SeatService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Seat")
public class SeatController {

    @Autowired
    private SeatService seatService;


    @PostMapping("/addSeat")
    public String addSeat(@RequestBody SeatDTO seatDTO){
        String seatId = seatService.addSeat(seatDTO);
        return seatId;
    }

    @DeleteMapping(
            path = {"/delete-seat/{id}"}
    )
    public String deleteSeat(@PathVariable(value = "id")int id) throws NotFoundException {
        boolean deleteSeat = seatService.deleteSeat(id);
        return "deleted";
    }



}
