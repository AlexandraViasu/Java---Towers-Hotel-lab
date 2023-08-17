import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<String> bedroom;
    private ArrayList<String> conferenceRoom;

    public Hotel(ArrayList<String> bedroom, ArrayList<String> conferenceRoom) {
        this.bedroom = bedroom;
        this.conferenceRoom = conferenceRoom;

    }

    public ArrayList<String> getBedroom() {
        return bedroom;
    }

    public void setBedroom(ArrayList<String> bedroom) {
        this.bedroom = bedroom;
    }

    public ArrayList<String> getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ArrayList<String> conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public void checkinBedroom(String[] guest) {
        HashMap<String, String> bedroom = new HashMap<>();
        bedroom.put("Alex", "non-smoker");
    }
    public void checkoutBedroom(String[] guest) {
        HashMap<String, String> bedroom = new HashMap<>();
        bedroom.remove("Alex", "non-smoker");
    }

    public void checkinConferenceRoom(String[] guest) {
        HashMap<String, String> conferenceRoom = new HashMap<>();
        conferenceRoom.put("Alex", "non-smoker");

    }
    public void checkoutConferenceRoom(String[] guest) {
        HashMap<String, String> conferenceRoom = new HashMap<>();
        conferenceRoom.remove("Alex", "non-smoker");
    }


}
