package com.example.cinemax.service.impl;

import com.example.cinemax.dto.ThearterDTO;
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
    public int addTheater(ThearterDTO thearterDTO) {

        Theater theater = new Theater(
                thearterDTO.getSeat_Id(),
                thearterDTO.getTheater_name(),
                thearterDTO.getTheater_Id()
        );
        if (theaterRepo.existsById((int) theater.getTheater_Id())){
            theaterRepo.save(theater);
            return Integer.parseInt(theater.getTheater_Id() + "Saved");
        }else {
            System.out.println("Theater already exist");
            return Integer.parseInt("booking already exist");
        }
    }



//    public boolean deleteCustomer(int id) throws NotFoundException {
//        if (movieRepo.existsById(id)){
//            movieRepo.deleteById(id);
//        }else {
//            throw new NotFoundException("not found movie");
//        }
//        return false;
//    }
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
