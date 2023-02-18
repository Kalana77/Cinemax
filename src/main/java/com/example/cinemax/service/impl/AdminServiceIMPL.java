package com.example.cinemax.service.impl;

import com.example.cinemax.dto.AdminDTO;
import com.example.cinemax.entity.Admin;
import com.example.cinemax.repository.AdminRepo;
import com.example.cinemax.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceIMPL implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public String addAdmin(AdminDTO adminDTO) {

        Admin admin = new Admin(
                adminDTO.getAdmin_name(),
                adminDTO.getAdmin_mail()
        );
        adminRepo.save(admin);
        return admin.getAdmin_id() + "saved";
    }
}
