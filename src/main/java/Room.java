import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<String> guests;


    public Room(int capacity, ArrayList<String> guests) {
        this.capacity = capacity;
        this.guests = guests;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return guests.getCapacity();
    }
}
