package Entity;
import java.time.LocalDateTime;



public class Booking {
    private int id;
    private Room room;
    private Customer customer;
    private LocalDateTime checkInDatetime;
    private LocalDateTime checkOutDatetime;

    public Booking() {;}

    public Booking(int id, Room room, Customer customer, LocalDateTime checkInDatetime, LocalDateTime checkOutDatetime) {
        this.id = id;
        this.room = room;
        this.customer = customer;
        this.checkInDatetime = checkInDatetime;
        this.checkOutDatetime = checkOutDatetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getCheckInDatetime() {
        return checkInDatetime;
    }

    public void setCheckInDatetime(LocalDateTime checkInDatetime) {
        this.checkInDatetime = checkInDatetime;
    }

    public LocalDateTime getCheckOutDatetime() {
        return checkOutDatetime;
    }

    public void setCheckOutDatetime(LocalDateTime checkOutDatetime) {
        this.checkOutDatetime = checkOutDatetime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", room=" + room +
                ", customer=" + customer +
                ", checkInDatetime=" + checkInDatetime +
                ", checkOutDatetime=" + checkOutDatetime +
                '}';
    }
}
