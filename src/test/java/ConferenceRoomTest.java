import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Room 1");

    }
    @Test
    public void canGetName() {
        assertEquals("Room 1", conferenceRoom.getName());

    }
    @Test
    public void canSetName() {
        conferenceRoom.setName("Business");
        assertEquals("Business", conferenceRoom.getName());
    }
}