package com.example.cinemax.service.impl;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UserBookingResponseDTO;
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

//    public UserBookingResponseDTO getUserForBooking(int id) throws NotFoundException {
//        Optional<Customer> customer = userRepo.findById(id);
//        if (customer.isPresent() && customer.get().isActiveStatus() == true){
//            UserBookingResponseDTO userBookingResponseDTO = modelMapper.map(customer.get(),UserBookingResponseDTO.class);
//            return userBookingResponseDTO;
//        }else {
//            throw new NotFoundException("Not Found Customer");
//        }
//        // return null;
//    }

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
}
