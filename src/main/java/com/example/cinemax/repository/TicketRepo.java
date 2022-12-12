package com.example.cinemax.repository;


import com.example.cinemax.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    List <Ticket> findBybookingId(long bookingId);
}
