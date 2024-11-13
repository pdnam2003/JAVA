package Service;

import Entity.Booking;
import Entity.Room;
import Entity.RoomType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RoomService {
    private static List<Room> rooms;
    private final  List<Booking> booking;

    public RoomService(List<Room> rooms, List<Booking> booking) {
        this.rooms = rooms;
        this.booking = booking;
    }
    public static List<RoomType> getRoom() {
        return List.of(RoomType.values());
    }
    public static List<Room> getRoomTypes(RoomType roomType)  {
        return rooms.stream()
                .filter(room -> room.getRoomType() == roomType)
                .collect(Collectors.toList());
    }
    public List<Room> getRoomsByTypeinTime(RoomType roomType, LocalDateTime checkInDatetime, LocalDateTime checkOutDatetime) {
        return  rooms.stream()
                .filter(room -> room.getRoomType()==roomType)
                .filter(room -> RoomReady(room,checkInDatetime,checkOutDatetime))

                .collect(Collectors.toList());
    }

    private boolean RoomReady(Room room, LocalDateTime checkInDatetime, LocalDateTime checkOutDatetime) {
        return checkInDatetime.isBefore(checkOutDatetime);
    }



}
