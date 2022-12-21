package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.*;
import com.example.cinemax.entity.Customer;
import com.example.cinemax.entity.Movie;
import com.example.cinemax.entity.Ticket;
import com.example.cinemax.repository.MovieRepo;
import com.example.cinemax.repository.TicketRepo;
import com.example.cinemax.service.MovieService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceIMPL implements MovieService {

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public String addMovie(AddMovieRequestDTO addMovieRequestDTO) {
        Movie movie = new Movie(
                addMovieRequestDTO.getFilmName(),
                addMovieRequestDTO.getCategory(),
                addMovieRequestDTO.getFilmStatus(),
                addMovieRequestDTO.getDescription(),
                addMovieRequestDTO.getPosterLink(),
                addMovieRequestDTO.getTrailerLink(),
                addMovieRequestDTO.getDuration(),
                addMovieRequestDTO.getTime(),
                addMovieRequestDTO.getDate(),
                true
        );
        if (movieRepo.findByfilmName(movie.getFilmName()).isEmpty()){
            movieRepo.save(movie);
            return movie.getFilmName() + "successfully added";
        }
        return null;
    }


    @Override
    public NowMovieCardResponseDTO getCardInfo(int id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus() == "NowShowing") {
            NowMovieCardResponseDTO nowMovieCardResponseDTO = modelMapper.map(movie.get(),NowMovieCardResponseDTO.class);
            return nowMovieCardResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }
       // return null;
    }

    @Override
    public UpComingCardResponseDTO getUpCardInfo(int id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus() == "UpComing") {
            UpComingCardResponseDTO upComingCardResponseDTO = modelMapper.map(movie.get(),UpComingCardResponseDTO.class);
            return upComingCardResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }

      //  return null;
    }

    @Override
    public NowMovieBannerResponseDTO getNowBannerInfo(int id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus() == "NowShowing") {
            NowMovieBannerResponseDTO nowMovieBannerResponseDTO = modelMapper.map(movie.get(),NowMovieBannerResponseDTO.class);
            return nowMovieBannerResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }

       // return null;
    }

    @Override
    public UpMovieBannerResponseDTO getUpBannerInfo(int id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus() == "UpComing") {
            UpMovieBannerResponseDTO upMovieBannerResponseDTO = modelMapper.map(movie.get(),UpMovieBannerResponseDTO.class);
            return upMovieBannerResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }
       // return null;
    }

    @Override
    public boolean deleteCustomer(int id) throws NotFoundException {
        if (movieRepo.existsById(id)){
            movieRepo.deleteById(id);
        }else {
            throw new NotFoundException("not found movie");
        }
        return false;
    }
}
