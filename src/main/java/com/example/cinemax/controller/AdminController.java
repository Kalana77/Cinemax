package com.example.cinemax.controller;

import com.example.cinemax.dto.AdminDTO;
import com.example.cinemax.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    public int addAdmin(@RequestBody AdminDTO adminDTO){
        int id = adminService.addAdmin(adminDTO);
        return id;

    }

}
