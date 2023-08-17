import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    Bedroom singleRoom;
    Bedroom doubleRoom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        hotel = new Hotel();
        singleRoom = new Bedroom(1, RoomType.SINGLE);
        doubleRoom = new Bedroom(2, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(2, "Conference Room 1");
        guest1 = new Guest("Alex");
        guest2 = new Guest("Chris");
        guest3 = new Guest("Rob");
        hotel.addBedroom(singleRoom);
        hotel.addBedroom(doubleRoom);
        hotel.addConferenceRoom(conferenceRoom);

    }

    @Test
    public void canFindABedroom() {
        Bedroom foundRoom = hotel.findBedroom(1);
        assertEquals(singleRoom, foundRoom);
    }

    @Test
    public void cantFindABedroom() {
        Bedroom nonExistentRoom = hotel.findBedroom(5);
        assertNull(nonExistentRoom);
    }

    @Test
    public void canFindAConferenceRoom() {
        ConferenceRoom foundConferenceRoom = hotel.findConferenceRoom("Conference Room 1");
        assertEquals(conferenceRoom, foundConferenceRoom);
    }

    @Test
    public void cantFindAConferenceRoom() {
        ConferenceRoom nonExistentConferenceRoom = hotel.findConferenceRoom("Fake Room");
        assertNull(nonExistentConferenceRoom);
    }

    @Test
    public void canCheckGuestsIntoBedroom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        hotel.checkInGuestsToBedroom(1, guests);
        assertEquals(1, singleRoom.guestListSize());

    }

    @Test
    public void cantCheckGuestsIntoBedroom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        hotel.checkInGuestsToBedroom(1, guests);
        assertEquals(1, singleRoom.guestListSize());
    }

    @Test
    public void canCheckGuestsOutOfBedroom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        hotel.checkInGuestsToBedroom(1, guests);
        hotel.checkOutGuestsFromBedroom(1);
        assertEquals(0, singleRoom.guestListSize());
    }

    @Test
    public void canCheckGuestsIntoConferenceRoom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        hotel.checkInGuestsToConferenceRoom("Conference Room 1", guests);
        assertEquals(1, conferenceRoom.guestListSize());

    }

    @Test
    public void cantCheckGuestsIntoConferenceRoom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
        hotel.checkInGuestsToConferenceRoom("Conference Room 1", guests);
        assertEquals(2, conferenceRoom.guestListSize());
    }

    @Test
    public void canCheckGuestsOutOfConferenceRoom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest1);
        hotel.checkInGuestsToConferenceRoom("Conference Room 1", guests);
        hotel.checkOutGuestsFromConferenceRoom("Conference Room 1");
        assertEquals(0, conferenceRoom.guestListSize());
    }



}
