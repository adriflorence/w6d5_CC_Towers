import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;

    @Before
    public void setUp() throws Exception {
        bedroom = new BedRoom(1, 1, BedRoomType.SINGLE, 30.50);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    // ..
    // pretend to test all getters
    // ..

}
