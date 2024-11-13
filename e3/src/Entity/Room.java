package Entity;

public class Room {
    private String id;
    private RoomType roomType;
    private double PricePerHour;


    public Room() {;}

    public Room(String id, RoomType roomType, double pricePerHour ) {
        this.id = id;
        this.roomType = roomType;
        PricePerHour = pricePerHour;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPricePerHour() {
        return PricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        PricePerHour = pricePerHour;
    }


    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", roomType=" + roomType +
                ", PricePerHour=" + PricePerHour +

                '}';
    }
}
