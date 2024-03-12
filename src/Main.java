import com.engeto.ja.du1.*;
import com.engeto.ja.du1.com.engeto.ja.du1.BookingManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class Main {

    public static <typeOfVacation> void main(String[] args) {

        Guest guest = new Guest("Adéla Malíková", LocalDate.of(1993, 1, 13));
        Guest guest1 = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));
        Guest guest2 = new Guest("Karel Dvořák" , LocalDate.of(1990, 5, 15));
        Guest guest3 = new Guest("Karel Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest4 = new Guest("Karolina Tmavá", LocalDate.of(1980, 5, 15));

        Room room = new Room(1, "jednolůžkový pokoj, ", true, true, BigDecimal.valueOf(1000));
        Room room1 = new Room(3, "trojlůžkový pokoj,", false, true, BigDecimal.valueOf(2400));
        Room room2 = new Room(2, "jednolůžkový pokoj,", true, true, BigDecimal.valueOf(1000));

        Booking booking = new Booking(List.of(guest), room, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), true);
        Booking booking1 = new Booking(List.of(guest, guest1), room1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
        Booking booking2 = new Booking(List.of(guest2), room1, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), true);
        Booking booking3 = new Booking(List.of(guest3), room2, LocalDate.of(2023, 7, 2), LocalDate.of(2023, 7, 18), false);
        Booking booking4 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 2), false);
        Booking booking5 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 3), LocalDate.of(2023, 8, 4), false);
        Booking booking6 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 5), LocalDate.of(2023, 8, 6), false);
        Booking booking7 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 7), LocalDate.of(2023, 8, 8), false);
        Booking booking8 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 9), LocalDate.of(2023, 8, 10), false);
        Booking booking9 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 11), LocalDate.of(2023, 8, 12), false);
        Booking booking10 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 13), LocalDate.of(2023, 8, 14), false);
        Booking booking11 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 15), LocalDate.of(2023, 8, 16), false);
        Booking booking12 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 17), LocalDate.of(2023, 8, 18), false);
        Booking booking13 = new Booking(List.of(guest4), room2, LocalDate.of(2023, 8, 19), LocalDate.of(2023, 8, 20), false);
        Booking booking14 = new Booking(List.of(guest4), room1, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), false);

        System.out.println(guest.getNameAndSurname() + "(" + guest.getBirthDate() + ")" + " - " + false);
        System.out.println("Pokoj číslo: " + room.getNoOfRoom() + ", " + room.getBeds() + " " + "Pokoj má balkón: " + room.isBalcony() + ", " + "Pokoj má výhled na moře: " + room.isSeaViews() + ", " + room.getPriceForNight() + "Kč/noc.");
        System.out.println(booking.getFrom() + " - " + booking.getTo());
        System.out.println();
        System.out.println(guest.getNameAndSurname() + "(" + guest.getBirthDate() + ")" + " a " + guest1.getNameAndSurname() + "(" + guest1.getBirthDate() + ")" + " - " + true);
        System.out.println("Pokoj číslo: " + room1.getNoOfRoom() + ", " + room1.getBeds() + ", " + "Pokoj má balkón: " + room1.isBalcony() + ", " + "Pokoj má výhled na moře: " + room1.isSeaViews() + ", " + room1.getPriceForNight() + "Kč/noc.");
        System.out.println(booking1.getFrom() + " - " + booking1.getTo());
        System.out.println();

        new ListOfBookings(List.of(booking));

        ListOfBookings listOfBookings = new ListOfBookings(List.of(booking));

        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking);
        bookingManager.addBooking(booking1);
        bookingManager.addBooking(booking2);
        bookingManager.addBooking(booking3);
        bookingManager.addBooking(booking4);
        bookingManager.addBooking(booking5);
        bookingManager.addBooking(booking6);
        bookingManager.addBooking(booking7);
        bookingManager.addBooking(booking8);
        bookingManager.addBooking(booking9);
        bookingManager.addBooking(booking10);
        bookingManager.addBooking(booking11);
        bookingManager.addBooking(booking12);
        bookingManager.addBooking(booking13);
        bookingManager.addBooking(booking14);
        bookingManager.getBookings();
        System.out.println();
        bookingManager.getNumberOfWorkingBookings();
        bookingManager.getAverageGuests();
        bookingManager.clearBookings();

          }

}