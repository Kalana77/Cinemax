package com.example.cinemax.repository;

import com.example.cinemax.entity.Admin;
import com.example.cinemax.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

  //  List<Booking> findAllByticketId(long ticketId);

   // List<Admin> findAllByAdminid(int Adminid);
}
