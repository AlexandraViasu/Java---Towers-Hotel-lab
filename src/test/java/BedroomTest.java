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
    public void hasNumber() {
        assertEquals(1, bedroom.getNumber());
    }

}