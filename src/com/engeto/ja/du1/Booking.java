package com.engeto.ja.du1;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private Room noOfRoom;
    private LocalDate from;
    private LocalDate to;
    private boolean workingBookings;

    public Booking(List<Guest> guests, Room noOfRoom, LocalDate from, LocalDate to, boolean workingBooking) {
        this.guests = guests;
        this.noOfRoom = noOfRoom;
        this.from = from;
        this.to = to;
        this.workingBookings = workingBooking;

    }

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", noOfRoom=" + noOfRoom +
                ", from=" + from +
                ", to=" + to +
                ", workingBooking=" + workingBookings +
                '}';
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public Room getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(Room noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public boolean isWorkingBooking() {
        return workingBookings;
    }

    public void setWorkingBooking(boolean workingBooking) {
        this.workingBookings = workingBooking;
    }


    public boolean isWorkingBookings() {
        return workingBookings;
    }
}



