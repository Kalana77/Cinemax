package com.example.cinemax.repository;

import com.example.cinemax.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer> {

    List<Booking> findAllByticketId(long ticketId);
}
