package com.example.cinemax.service;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieBannerResponseDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpComingCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpMovieBannerResponseDTO;
import javassist.NotFoundException;

public interface MovieService {
    String addMovie(AddMovieRequestDTO addMovieRequestDTO);

    NowMovieCardResponseDTO getCardInfo(int id) throws NotFoundException;

    UpComingCardResponseDTO getUpCardInfo(int id) throws NotFoundException;

    NowMovieBannerResponseDTO getNowBannerInfo(int id) throws NotFoundException;

    UpMovieBannerResponseDTO getUpBannerInfo(int id) throws NotFoundException;

    boolean deleteCustomer(int id) throws NotFoundException;
}
