package com.example.cinemax.dto.requestDTO;

import java.sql.Date;
import java.sql.Time;

public class AddBookingRequestDTO {

   // private long bookingId;

    private long customerId;

    private long paymentId;

    private long ticketId;

    private Time bookingTime;

    private Date bookingData;

   // private boolean activeStatus;


    public AddBookingRequestDTO() {
    }

    public AddBookingRequestDTO(long customerId, long paymentId, long ticketId, Time bookingTime, Date bookingData) {
        this.customerId = customerId;
        this.paymentId = paymentId;
        this.ticketId = ticketId;
        this.bookingTime = bookingTime;
        this.bookingData = bookingData;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Time getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Time bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Date getBookingData() {
        return bookingData;
    }

    public void setBookingData(Date bookingData) {
        this.bookingData = bookingData;
    }
}
