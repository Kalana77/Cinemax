package com.example.cinemax.dto.responseDTO;

import lombok.*;

import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class NowMovieBannerResponseDTO {

    private String filmName;

    private String category;

    private String description;

    private String posterLink;

    private String trailerLink;

    private int duration;

    private Time time;


}
