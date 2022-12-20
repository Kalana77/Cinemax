package com.example.cinemax.dto.requestDTO;

import java.sql.Date;
import java.sql.Time;

public class AddMovieRequestDTO {

  //  private long filmId;

    private String filmName;

    private String category;

    private String filmStatus;

    private String description;

    private String posterLink;

    private String trailerLink;

    private int duration;

    private Time time;

    private Date date;

   // private boolean activeStatus;


    public AddMovieRequestDTO() {
    }

    public AddMovieRequestDTO(String filmName, String category, String filmStatus, String description, String posterLink, String trailerLink, int duration, Time time, Date date) {
        this.filmName = filmName;
        this.category = category;
        this.filmStatus = filmStatus;
        this.description = description;
        this.posterLink = posterLink;
        this.trailerLink = trailerLink;
        this.duration = duration;
        this.time = time;
        this.date = date;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosterLink() {
        return posterLink;
    }

    public void setPosterLink(String posterLink) {
        this.posterLink = posterLink;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AddMovieRequestDTO{" +
                "filmName='" + filmName + '\'' +
                ", category='" + category + '\'' +
                ", filmStatus='" + filmStatus + '\'' +
                ", description='" + description + '\'' +
                ", posterLink='" + posterLink + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", duration=" + duration +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
