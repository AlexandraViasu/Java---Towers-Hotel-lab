import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Room 1");

    }
    public void canGetName() {
        assertEquals("Room 1", conferenceRoom.getName());

    }

    public void canSetName() {
        conferenceRoom.setName("Business");
        assertEquals("Business", conferenceRoom.getName());
    }
}