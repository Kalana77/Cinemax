package com.example.cinemax.dto.responseDTO;

import lombok.*;

import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class NowMovieCardResponseDTO {

    private String filmName;

    private String posterLink;

    private int duration;

    private Time time;

}
