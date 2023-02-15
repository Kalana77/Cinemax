package com.example.cinemax.service.impl;

import com.example.cinemax.dto.AdminDTO;
import com.example.cinemax.entity.Admin;
import com.example.cinemax.repository.AdminRepo;
import com.example.cinemax.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceIMPL implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public int addAdmin(AdminDTO adminDTO) {

        Admin admin = new Admin(
                adminDTO.getAdmin_name(),
                adminDTO.getAdmin_mail()
        );
        adminRepo.save(admin);
        return Integer.parseInt(admin.getAdmin_id() + "saved");

    }
}