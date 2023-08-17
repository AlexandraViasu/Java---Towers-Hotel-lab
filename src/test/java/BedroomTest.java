import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.FAMILY, 1);

    }

    @Test
    public void canGetNumber() {
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void canSetNumber() {
        bedroom.setNumber(2);
        assertEquals(2, bedroom.getNumber());
    }
}