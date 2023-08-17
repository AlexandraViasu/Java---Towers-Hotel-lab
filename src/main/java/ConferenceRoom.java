public class ConferenceRoom extends Room{
    private String name;
    public ConferenceRoom(RoomType roomType) {
        super(roomType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
