package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.CustomerSaveRequestDTO;
import com.example.cinemax.entity.Customer;
import com.example.cinemax.repository.UserRepo;
import com.example.cinemax.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public int appCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer = new Customer(
                customerSaveRequestDTO.getCustomerName(),
                customerSaveRequestDTO.getEmail(),
                customerSaveRequestDTO.getPassword(),
                customerSaveRequestDTO.getMobileNumber(),
                true
        );
        if (userRepo.findAllByEmail(customer.getEmail()).isEmpty()){
            userRepo.save(customer);
            return Integer.parseInt(customer.getCustomerId() + "saved");
        }else {
            System.out.println("customer email already exist");
            return Integer.parseInt("customer already exist");
        }


        //return 0;
    }
}
