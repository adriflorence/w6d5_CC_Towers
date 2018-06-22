import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    Guest guest;
    BedRoom bedroom1, bedroom2;

    @Before
    public void setUp() throws Exception {
        guest = new Guest();
        bedroom1 = new BedRoom (1, BedRoomType.SINGLE, 30.50, 3);
        bedroom2 = new BedRoom (2, BedRoomType.DOUBLE, 50.50, 4);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(1, bedroom1.getRoomNumber());
    }

    // ... pretend to test all getters

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom1.getCapacityFromEnum());
        assertEquals(2, bedroom2.getCapacityFromEnum());
    }


    @Test
    public void canCheckInGuest(){
        bedroom1.checkIn(guest);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void cannotCheckInGuestBeyondCapacity(){
        bedroom2.checkIn(guest);
        bedroom2.checkIn(guest);
        bedroom2.checkIn(guest);
        assertEquals(2, bedroom2.getNumberOfGuests());
    }

}
