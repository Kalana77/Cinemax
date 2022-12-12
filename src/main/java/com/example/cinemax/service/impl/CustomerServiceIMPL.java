package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.CustomerSaveRequestDTO;
import com.example.cinemax.dto.responseDTO.UserBookingResponseDTO;
import com.example.cinemax.entity.Customer;
import com.example.cinemax.repository.UserRepo;
import com.example.cinemax.service.CustomerService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceIMPL implements CustomerService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public int addCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
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

    @Override
    public UserBookingResponseDTO getUserForBooking(int id) throws NotFoundException {
        Optional<Customer> customer = userRepo.findById(id);
        if (customer.isPresent() && customer.get().isActiveStatus() == true){
            UserBookingResponseDTO userBookingResponseDTO = modelMapper.map(customer.get(),UserBookingResponseDTO.class);
            return userBookingResponseDTO;
        }else {
            throw new NotFoundException("Not Found Customer");
        }
       // return null;
    }
}
