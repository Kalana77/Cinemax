package com.example.cinemax.service.impl;

import com.example.cinemax.dto.SeatDTO;
import com.example.cinemax.entity.Seat;
import com.example.cinemax.repository.SeatRepo;
import com.example.cinemax.service.SeatService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class SeatServiceIMPL implements SeatService {

    @Autowired
    public SeatRepo seatRepo;

    @Override
    public String addSeat(SeatDTO seatDTO) {

        Seat seat = new Seat(
                seatDTO.getSeatNo(),
                seatDTO.getTheaterId()
        );
        //(userRepo.findAllByEmail(customer.getEmail()).isEmpty()){

//        if (seatRepo.findAllByseatNo(seatDTO.getSeatNo()).isEmpty()) { //false krnna
            seatRepo.save(seat);
            return seat.getSeatId() + "saved";
//        } else {
//            System.out.println("booking already exist");
//            return "Seat does not exist";
//        }


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
    public boolean deleteSeat(int id) throws NotFoundException {
        if (seatRepo.existsById(id)){
            seatRepo.deleteById(id);
        }else {
            throw new NotFoundException("not found seat");
        }
        return false;
    }
}
