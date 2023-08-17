import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        bedroom = new Bedroom(1, RoomType.FAMILY);
        guest1 = new Guest("Rob");
        guest2 = new Guest("Chris");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void canSetNumber() {
        bedroom.setNumber(2);
        assertEquals(2, bedroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(RoomType.FAMILY, bedroom.getType());
    }

    @Test
    public void checkIsVacantTrue() {
        assertEquals(true, bedroom.isVacant());
    }

    @Test
    public void checkIsVacantFalse() {
        bedroom.checkInGuest(guest1);
        assertEquals(false, bedroom.isVacant());
    }

    @Test
    public void guestListSizeStartsAt0() {
        assertEquals(0, bedroom.guestListSize());
    }

    @Test
    public void canCheckInGuest_underCapacity() {
        bedroom.checkInGuest(guest1);
        assertEquals(1, bedroom.guestListSize());
    }

    @Test
    public void canCheckInGuest_atCapacity() {
        bedroom.checkInGuest(guest1);
        bedroom.checkInGuest(guest2);
        assertEquals(2, bedroom.guestListSize());
    }

    @Test
    public void canCheckOutGuests() {
        bedroom.checkInGuest(guest1);
        bedroom.checkInGuest(guest2);
        bedroom.checkOutGuests();
        assertEquals(0, bedroom.guestListSize());
    }

}