package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieBannerResponseDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpComingCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpMovieBannerResponseDTO;
import javassist.NotFoundException;

import java.util.List;

public interface MovieService {
    

    NowMovieCardResponseDTO getCardInfo(long id) throws NotFoundException;

    UpComingCardResponseDTO getUpCardInfo(long id) throws NotFoundException;

    NowMovieBannerResponseDTO getNowBannerInfo(long id) throws NotFoundException;

    UpMovieBannerResponseDTO getUpBannerInfo(long id) throws NotFoundException;

    boolean deleteCustomer(long id) throws NotFoundException;

    String addMovie(AddMovieRequestDTO addMovieRequestDTO);
}
