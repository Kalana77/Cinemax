package com.example.cinemax.controller;


import com.example.cinemax.dto.ThearterDTO;
import com.example.cinemax.dto.requestDTO.AddTheaterRequestDTO;
import com.example.cinemax.service.TheaterService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Theater")
public class ThearterController {

    @Autowired
    public TheaterService theaterService;

    @PostMapping("/addTheater")
    public String addTheater(@RequestBody AddTheaterRequestDTO addTheaterRequestDTO){
        String id = theaterService.addTheater(addTheaterRequestDTO);
        return id;
    }

    @DeleteMapping(
            path = {"/delete-theater/{id}"}
    )
    public String deleteTheater(@PathVariable(value = "id")int id) throws NotFoundException {
        boolean deleteTheater = theaterService.deleteTheater(id);
        return "deleted";
    }
}
