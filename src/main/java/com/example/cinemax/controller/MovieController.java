package com.example.cinemax.controller;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieBannerResponseDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpComingCardResponseDTO;
import com.example.cinemax.dto.responseDTO.UpMovieBannerResponseDTO;
import com.example.cinemax.service.MovieService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/Cinemax/Movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public String addMovie(AddMovieRequestDTO addMovieRequestDTO) {
        String name = movieService.addMovie(addMovieRequestDTO);
        return name;
    }

    @GetMapping(
            path = "get-by-id-now",
            params = "id"
    )
    public NowMovieCardResponseDTO getCard(@RequestParam(value = "id")int id) throws NotFoundException {
        NowMovieCardResponseDTO nowMovieCardResponseDTO = movieService.getCardInfo(id);
        return nowMovieCardResponseDTO;
    }

    @GetMapping(
            path = "get-by-id-now",
            params = "id"
    )
    public UpComingCardResponseDTO getUpCard(@RequestParam(value = "id")int id) throws NotFoundException {
        UpComingCardResponseDTO upComingCardResponseDTO = movieService.getUpCardInfo(id);
        return upComingCardResponseDTO;
    }

    @GetMapping(
            path = "get-by-id-now-banner",
            params = "id"
    )
    public NowMovieBannerResponseDTO getNowBanner(@RequestParam(value = "id")int id) throws NotFoundException {
        NowMovieBannerResponseDTO nowMovieBannerResponseDTO = movieService.getNowBannerInfo(id);
        return nowMovieBannerResponseDTO;
    }

    @GetMapping(
            path = "get-by-up-banner",
            params = "id"
    )
    public UpMovieBannerResponseDTO getUpBanner(@RequestParam(value = "id")int id) throws NotFoundException {
        UpMovieBannerResponseDTO upMovieBannerResponseDTO = movieService.getUpBannerInfo(id);
        return upMovieBannerResponseDTO;
    }
    @DeleteMapping(
            path = {"/delete-movie/{id}"}
    )
    public String deleteMovie(@PathVariable(value = "id")int id) {
        boolean deleteCustomer = movieService.deleteCustomer(id);
        return "deleted";
    }



}
