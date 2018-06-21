import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void setUp() throws Exception {
        guest = new Guest();
        room = new Room(2);
    }

    @Test
    public void isFree(){
        assertEquals(0, room.getNumberOfGuests());
        assertEquals(true, room.isFree());
    }

    @Test
    public void canCheckInGuest(){
        room.checkIn(guest);
        assertEquals(1, room.getNumberOfGuests());
    }

//    @Test
//    public void cannotCheckInGuestBeyondCapacity(){
//        room.checkIn(guest);
//        room.checkIn(guest);
//        room.checkIn(guest);
//        assertEquals(2, room.getNumberOfGuests());
//    }

}
