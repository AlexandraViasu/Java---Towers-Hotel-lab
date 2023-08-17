import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }
    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }
    public Bedroom findBedroom(int roomNumber) {
        Bedroom foundRoom = null;
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getNumber() == roomNumber) {
                foundRoom = bedroom;
            }
        }
        return foundRoom;
    }
    public ConferenceRoom findConferenceRoom(String roomName) {
        ConferenceRoom foundRoom = null;
        for (ConferenceRoom conferenceRoom: this.conferenceRooms) {
            if (conferenceRoom.getName() == roomName) {
                foundRoom = conferenceRoom;
            }
        }
        return foundRoom;
    }

}
