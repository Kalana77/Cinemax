package com.example.cinemax.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "movie")
public class Movie {


    @Id
    @Column(name = "filmId",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long filmId;

    private String filmName;

    private String category;

    private String filmStatus;

    private String description;

    private String posterLink;

    private String trailerLink;

    private String duration;

    private Time time;

    private Date date;

    private boolean activeStatus;


    public Movie(long filmId, String filmName, String category, String filmStatus, String description, String posterLink, String trailerLink, String duration, Time time, Date date, boolean activeStatus) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.category = category;
        this.filmStatus = filmStatus;
        this.description = description;
        this.posterLink = posterLink;
        this.trailerLink = trailerLink;
        this.duration = duration;
        this.time = time;
        this.date = date;
        this.activeStatus = activeStatus;
    }


    public Movie(String filmName, String category, String filmStatus, String description, String posterLink, String trailerLink, String duration, Time time, Date date, boolean b) {
        this.filmName = filmName;
        this.category = category;
        this.filmStatus = filmStatus;
        this.description = description;
        this.posterLink = posterLink;
        this.trailerLink = trailerLink;
        this.duration = duration;
        this.time = time;
        this.date = date;
        this.activeStatus = b;
    }
}
