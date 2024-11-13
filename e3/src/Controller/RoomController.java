package Controller;
import java.util.ArrayList;

import Entity.Booking;
import Entity.Room;
import Entity.RoomType;
import Service.RoomService;
import java.util.List;
import java.util.Scanner;


public class RoomController {
    static List<Room> rooms = new ArrayList<>();
    static List<RoomType> roomTypes = RoomService.getRoom();
    static List<RoomType> roomServices = RoomService.getRoom();
    private static List<Booking> bookings;

    //bookRoom

    public static void bookRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice room type: ");
        roomTypes.stream().forEach(roomType ->
                System.out.println(roomType.getRoomTypeLabel())
        );
        System.out.print("Enter your choice: ");
        int roomTypeChoice = Integer.parseInt(scanner.nextLine());
        RoomType selectedRoomType = roomTypes.get(roomTypeChoice - 1);

        List<Room> RoomReadys = RoomService.getRoomTypes(selectedRoomType);
        if (RoomReadys.isEmpty()) {
            System.out.println("There are no rooms available for the selected room type.");
            return;
        }else {
            System.out.println("List of available rooms for room type " + selectedRoomType + ":");
            for (int i = 0; i < RoomReadys.size(); i++) {
                System.out.println((i + 1) + ". " + RoomReadys.get(i));
            }
        }



    }
}
