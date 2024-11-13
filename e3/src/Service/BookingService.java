package Service;

import Entity.Booking;
import Entity.Room;

import java.util.List;

public class BookingService {
    private final List<Booking> bookings;
    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
        }
    public List<Booking> getBookings() {
        return bookings;
    }
    public Booking findBooking(String customerName,String customerPhone,Room rooms){
        return bookings.stream()
                .filter(booking -> booking.getCustomer().getCusname().equalsIgnoreCase(customerName))
                .filter(booking -> booking.getCustomer().getCusPhone().equalsIgnoreCase(customerPhone))
                .filter(booking -> booking.getRoom().getId().equals(rooms.getId()))
                .findFirst()
                .orElse(null);
    }
}
