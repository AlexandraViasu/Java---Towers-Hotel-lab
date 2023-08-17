import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<String> collection;


    public Room(RoomType roomType) {

        this.roomType = roomType;

    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return roomType.getCapacity();
    }
}
