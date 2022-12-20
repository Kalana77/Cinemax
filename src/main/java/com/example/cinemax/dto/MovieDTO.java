package com.example.cinemax.dto;

import lombok.*;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class MovieDTO {

    private long filmId;

    private String filmName;

    private String category;

    private String filmStatus;

    private String description;

    private String posterLink;

    private String trailerLink;

    private int duration;

    private Time time;

    private Date date;

    private boolean activeStatus;

}
