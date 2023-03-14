package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddTheaterRequestDTO;
import com.example.cinemax.entity.Theater;
import com.example.cinemax.repository.TheaterRepo;
import com.example.cinemax.service.TheaterService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterServiceIMPL implements TheaterService {

    @Autowired
    public TheaterRepo theaterRepo;

    @Override
    public String addTheater(AddTheaterRequestDTO addTheaterRequestDTO) {

        Theater theater = new Theater(
                addTheaterRequestDTO.getTheater_name(),
                addTheaterRequestDTO.getSeat_Id(),
                addTheaterRequestDTO.getLocation()
        );
        //(movieRepo.findAllByFilmName(movie.getFilmName()).isEmpty()){
        if (theaterRepo.findAllByTheaterId(theater.getTheaterId()).isEmpty()){
            theaterRepo.save(theater);
            return theater.getTheaterId() + "Saved";
        }else {
            System.out.println("Theater already exist");
            return "booking already exist";
        }
    }

    @Override
    public boolean deleteTheater(int id) throws NotFoundException {
        if (theaterRepo.existsById(id)){
            theaterRepo.deleteById(id);
        }else {
            throw new NotFoundException("not found theater");
        }
        return false;
    }


}
