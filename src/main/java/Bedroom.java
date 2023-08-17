import java.util.ArrayList;

public class Bedroom extends Room{

    private int number;
    private RoomType type;
    public Bedroom(int number, RoomType roomType) {
        super(roomType.getCapacity());
        this.number = number;
        this.type = roomType;
    }

    public int getNumber() {
        return number;
    }

    public RoomType getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
