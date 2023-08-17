public class Bedroom extends Room{
    private int number;
    public Bedroom(RoomType roomType) {
        super(roomType);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
