package com.engeto.ja.du1;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private List<Guest> guests;
    private Room noOfRoom;
    private LocalDate from;
    private LocalDate to;

    @Override
    public String toString() {
        return "Booking{" +
                "guests=" + guests +
                ", noOfRoom=" + noOfRoom +
                ", from=" + from +
                ", to=" + to +
                '}';
    }

    public Booking(List<Guest> guests, Room noOfRoom, LocalDate from, LocalDate to) {
        this.guests = guests;
        this.noOfRoom = noOfRoom;
        this.from = from;
        this.to = to;
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
}

