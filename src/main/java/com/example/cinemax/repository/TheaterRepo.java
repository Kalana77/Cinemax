package com.example.cinemax.repository;


import com.example.cinemax.entity.Movie;
import com.example.cinemax.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface TheaterRepo extends JpaRepository<Theater, Integer>{
}
