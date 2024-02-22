package com.engeto.ja.du1.com.engeto.ja.du1;

import com.engeto.ja.du1.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public void getBookings() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
    public void clearBookings() {
        bookings.clear();
    }

    public void getNumberOfWorkingBookings() {
        int count = 0;
        for (Booking booking : bookings) {
            if (booking.getFrom().isBefore(booking.getTo())) {
                count++;
            }
        }
        System.out.println("Number of working bookings: " + count);
    }
    public void getAverageGuests () {
        int count = 0;
        for (Booking booking : bookings) {
            count += booking.getGuests().size();
        }
        System.out.println("Average number of guests: " + count / bookings.size());
    }


}
