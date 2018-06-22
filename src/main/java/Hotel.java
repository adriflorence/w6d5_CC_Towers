import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void checkIn(Guest guest, Room guestRoom) {
        for (Room room : rooms) {
            if (room == guestRoom) {
                room.checkIn(guest);
            }
        }
    }

    public void checkOut(Guest guest, Room guestRoom) {
        for (Room room : rooms) {
            if (room == guestRoom) {
                room.checkOut(guest);
            }
        }
    }

}
