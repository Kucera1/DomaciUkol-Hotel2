package com.engeto.ja.du1;

import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Booking> bookings;

    @Override
    public String toString() {
        return "ListOfBookings{" +
                "bookings=" + bookings +
                '}';
    }

    public ListOfBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
