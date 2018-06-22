import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;

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

    public ArrayList<Guest> getGuestList(Room room){
        ArrayList<Guest> guestList = new ArrayList<Guest>();
        for (Room guestRoom : rooms) {
            if (room == guestRoom) {
                if (guestRoom.getNumberOfGuests() != 0) {
                    guestList = guestRoom.getGuests();
                }
//              return "No guests in this room.";
            }

        }
        return guestList;
    }


}
