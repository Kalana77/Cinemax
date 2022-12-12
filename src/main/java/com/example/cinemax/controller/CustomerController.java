package com.example.cinemax.controller;

import com.example.cinemax.dto.requestDTO.CustomerSaveRequestDTO;
import com.example.cinemax.dto.responseDTO.UserBookingResponseDTO;
import com.example.cinemax.repository.UserRepo;
import com.example.cinemax.service.CustomerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Customer")

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/addCustomer")
    public int saveUser(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        int id = customerService.addCustomer(customerSaveRequestDTO);
        return id;
    }

    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public UserBookingResponseDTO getUserBooking(@RequestParam(value = "id")int id) throws NotFoundException {
        UserBookingResponseDTO userBookingResponseDTO = customerService.getUserForBooking(id);
        return userBookingResponseDTO;
    }



}
