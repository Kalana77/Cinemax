package com.example.cinemax.controller;

import com.example.cinemax.dto.AdminDTO;
import com.example.cinemax.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/saveAdmin")
    public String addAdmin(@RequestBody AdminDTO adminDTO){
        String id = adminService.addAdmin(adminDTO);
        return id;

    }

}
