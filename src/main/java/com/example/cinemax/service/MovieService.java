package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
import javassist.NotFoundException;

public interface MovieService {
    String addMovie(AddMovieRequestDTO addMovieRequestDTO);

    NowMovieCardResponseDTO getCardInfo(int id) throws NotFoundException;
}
