package com.example.cinemax.controller;

import com.example.cinemax.dto.requestDTO.CustomerSaveRequestDTO;
import com.example.cinemax.service.CustomerService;
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
        int id = customerService.appCustomer(customerSaveRequestDTO);
        return id;
    }


}
