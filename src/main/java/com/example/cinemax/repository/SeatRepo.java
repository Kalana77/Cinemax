package com.example.cinemax.repository;

import com.example.cinemax.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface SeatRepo extends JpaRepository<Seat,Integer> {
   // List<Seat> findAllBySeatNo (int seatNo);

    List<Seat> findAllByseatNo(int seatNo);
}
