package com.example.cinemax.controller;

import com.example.cinemax.dto.requestDTO.AddMovieRequestDTO;
import com.example.cinemax.dto.responseDTO.NowMovieCardResponseDTO;
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
            path = "get-by-id",
            params = "id"
    )
    public NowMovieCardResponseDTO getCard(@RequestParam(value = "id")int id) throws NotFoundException {
        NowMovieCardResponseDTO nowMovieCardResponseDTO = movieService.getCardInfo(id);
        return nowMovieCardResponseDTO;
    }


}
