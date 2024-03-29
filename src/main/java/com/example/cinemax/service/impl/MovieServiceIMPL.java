package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.*;
import com.example.cinemax.entity.Movie;
import com.example.cinemax.repository.MovieRepo;
import com.example.cinemax.service.MovieService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceIMPL implements MovieService {

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private ModelMapper modelMapper;




    @Override
    public NowMovieCardResponseDTO getCardInfo(long id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus().equalsIgnoreCase("NowShowing") ) {
            NowMovieCardResponseDTO nowMovieCardResponseDTO = modelMapper.map(movie.get(),NowMovieCardResponseDTO.class);
            return nowMovieCardResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }
       // return null;
    }

    @Override
    public UpComingCardResponseDTO getUpCardInfo(long id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus().equalsIgnoreCase("UpComing") ) {
            UpComingCardResponseDTO upComingCardResponseDTO = modelMapper.map(movie.get(),UpComingCardResponseDTO.class);
            return upComingCardResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }

      //  return null;
    }

    @Override
    public NowMovieBannerResponseDTO getNowBannerInfo(long id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus().equalsIgnoreCase("NowShowing")) {
            NowMovieBannerResponseDTO nowMovieBannerResponseDTO = modelMapper.map(movie.get(),NowMovieBannerResponseDTO.class);
            return nowMovieBannerResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }

       // return null;
    }

    @Override
    public UpMovieBannerResponseDTO getUpBannerInfo(long id) throws NotFoundException {
        Optional<Movie> movie = movieRepo.findById(id);
        if (movie.isPresent() && movie.get().isActiveStatus()==true && movie.get().getFilmStatus().equalsIgnoreCase("UpComing")) {
            UpMovieBannerResponseDTO upMovieBannerResponseDTO = modelMapper.map(movie.get(),UpMovieBannerResponseDTO.class);
            return upMovieBannerResponseDTO;
        }else {
            throw new NotFoundException("Not found Movie");
        }
       // return null;
    }

    @Override
    public boolean deleteCustomer(long id) throws NotFoundException {
        if (movieRepo.existsById(id)){
            movieRepo.deleteById(id);
        }else {
            throw new NotFoundException("not found movie");
        }
        return false;
    }

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
//        if (bookingRepo.findAllByticketId(booking.getTicketId()).isEmpty()) {
//            bookingRepo.save(booking);
//            return booking.getBookingId() + "saved";
//        }else {
//            System.out.println("Ticket already exist");
//            return "Booking already exist";
//        }

        if (movieRepo.findAllByFilmName(movie.getFilmName()).isEmpty()){
            movieRepo.save(movie);
            return movie.getFilmName() + " saved";
        }else {
            System.out.println("Movie already exist");
            return "Movie already exist";
        }
    }
}
