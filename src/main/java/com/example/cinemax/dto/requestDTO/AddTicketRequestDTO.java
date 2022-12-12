package com.example.cinemax.dto.requestDTO;

import java.sql.Date;
import java.sql.Time;

public class AddTicketRequestDTO {

  //  private long ticketId;

    private long bookingId;

    private long movieId;

    private long theaterId;

    private int seatNo;

    private int price;

    private int ticketQyt;

    private Time showTime;

    private Date showDate;

  //  private boolean activeStatus;


    public AddTicketRequestDTO() {
    }

    public AddTicketRequestDTO(long bookingId, long movieId, long theaterId, int seatNo, int price, int ticketQyt, Time showTime, Date showDate) {
        this.bookingId = bookingId;
        this.movieId = movieId;
        this.theaterId = theaterId;
        this.seatNo = seatNo;
        this.price = price;
        this.ticketQyt = ticketQyt;
        this.showTime = showTime;
        this.showDate = showDate;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public long getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(long theaterId) {
        this.theaterId = theaterId;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTicketQyt() {
        return ticketQyt;
    }

    public void setTicketQyt(int ticketQyt) {
        this.ticketQyt = ticketQyt;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }
}
