package com.example.cinemax.repository;

import com.example.cinemax.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {


    List<Movie> findAllByFilmName(String filmName);
}
