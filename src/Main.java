import com.engeto.ja.du1.*;
import com.engeto.ja.du1.com.engeto.ja.du1.BookingManager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Guest guest = new Guest("Adéla Malíková", LocalDate.of(1993, 1, 13));
        Guest guest1 = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));


        Room room = new Room(1, "jednolůžkový pokoj, ", true, true, BigDecimal.valueOf(1000));
        Room room1 = new Room(3, "trojlůžkový pokoj,", false, true, BigDecimal.valueOf(2400));

        TypeOfVacation typeOfVacation = new TypeOfVacation("Rekreační pobyt.");

        Booking booking = new Booking(List.of(guest), room, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), typeOfVacation);
        Booking booking1 = new Booking(List.of(guest, guest1), room1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), typeOfVacation);

        typeOfVacation = new TypeOfVacation("Pracovní pobyt.");
        TypeOfVacation typeOfVacation1 = new TypeOfVacation("Rekreační pobyt.");

        System.out.println(guest.getNameAndSurname() + "(" + guest.getBirthDate() + ")" + " - " + typeOfVacation.getTypeOfVacation());
        System.out.println("Pokoj číslo: " + room.getNoOfRoom() + ", " + room.getBeds() + " " + "Pokoj má balkón: " + room.isBalcony() + ", " + "Pokoj má výhled na moře: " + room.isSeaViews() + ", " + room.getPriceForNight() + "Kč/noc.");
        System.out.println(booking.getFrom() + " - " + booking.getTo());
        System.out.println();
        System.out.println(guest.getNameAndSurname() + "(" + guest.getBirthDate() + ")" + " a " + guest1.getNameAndSurname() + "(" + guest1.getBirthDate() + ")" + " - " + typeOfVacation1.getTypeOfVacation());
        System.out.println("Pokoj číslo: " + room1.getNoOfRoom() + ", " + room1.getBeds() + ", " + "Pokoj má balkón: " + room1.isBalcony() + ", " + "Pokoj má výhled na moře: " + room1.isSeaViews() + ", " + room1.getPriceForNight() + "Kč/noc.");
        System.out.println(booking1.getFrom() + " - " + booking1.getTo());
        System.out.println();

        new ListOfBookings(List.of(booking));
        new ListOfBookings(List.of(booking1));
        ListOfBookings listOfBookings = new ListOfBookings(List.of(booking));
        ListOfBookings listOfBookings1 = new ListOfBookings(List.of(booking1));

        System.out.println(booking);
        System.out.println(booking1);
        System.out.println();

        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(booking);
        bookingManager.addBooking(booking1);
        bookingManager.getBookings();
        System.out.println();
        bookingManager.getNumberOfWorkingBookings();
        bookingManager.getAverageGuests();
        bookingManager.clearBookings();
        bookingManager.getBookings();

          }

}