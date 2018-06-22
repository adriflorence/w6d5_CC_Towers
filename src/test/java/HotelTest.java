import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    BedRoom bedroom1, bedroom2;
    DiningRoom diningroom;
    ConferenceRoom conferenceRoom1, conferenceRoom2;

    @Before
    public void setUp() throws Exception {
        guest = new Guest();
        bedroom1 = new BedRoom (1, BedRoomType.SINGLE, 30.50);
        bedroom2 = new BedRoom (2, BedRoomType.DOUBLE, 50.50);
        diningroom = new DiningRoom(50, "Restaurant");
        conferenceRoom1 = new ConferenceRoom(100, "Large Meeting Room", 300);
        conferenceRoom2 = new ConferenceRoom(20, "Small Meeting Room", 50);
//      "double brace initialization"   //
        ArrayList<Room> rooms = new ArrayList<Room>() {{
            add(bedroom1);
            add(bedroom2);
            add(diningroom);
            add(conferenceRoom1);
            add(conferenceRoom2);
        }};
        hotel = new Hotel(rooms);
    }

    @Test
    public void canCheckIn() {
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, bedroom1);
        hotel.checkIn(guest, bedroom1);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkIn(guest, diningroom);
        hotel.checkIn(guest, diningroom);
        assertEquals(3, conferenceRoom1.getNumberOfGuests());
        assertEquals(1, bedroom1.getNumberOfGuests()); // single room
        assertEquals(4, conferenceRoom2.getNumberOfGuests());
        assertEquals(2, diningroom.getNumberOfGuests());
    }

    @Test
    public void canCheckOut() {
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkOut(guest, conferenceRoom1);
        hotel.checkIn(guest, bedroom1);
        hotel.checkOut(guest, bedroom1);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkIn(guest, conferenceRoom2);
        hotel.checkOut(guest, conferenceRoom2);
        hotel.checkOut(guest, conferenceRoom2);
        hotel.checkIn(guest, diningroom);
        hotel.checkOut(guest, diningroom);

        assertEquals(1, conferenceRoom1.getNumberOfGuests());
        assertEquals(0, bedroom1.getNumberOfGuests());
        assertEquals(0, conferenceRoom2.getNumberOfGuests());
        assertEquals(0, diningroom.getNumberOfGuests());
    }

    @Test
    public void canGetGuestList() {
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, conferenceRoom1);
        ArrayList<Guest> expected = new ArrayList<Guest>() {{
            add(guest);
            add(guest);
        }};
        assertEquals(expected, hotel.getGuestList(conferenceRoom1));
    }

    @Test
    public void canGetFreeRooms() { // ALL ROOMS!
        hotel.checkIn(guest, conferenceRoom1);
        hotel.checkIn(guest, bedroom1);
//        bedroom2, diningroom, conferenceRoom2 should be free
        ArrayList<Room> expected = new ArrayList<Room>() {{
            add(bedroom2);
            add(diningroom);
            add(conferenceRoom2);
        }};
        assertEquals(expected, hotel.getFreeRoomList());
    }

    @Test
    public void canGetAllBedrooms() { // BEDROOMS ONLY!
        ArrayList<Room> expected = new ArrayList<Room>() {{
            add(bedroom1);
            add(bedroom2);
        }};
        assertEquals(expected, hotel.getAllBedrooms());
    }
}
