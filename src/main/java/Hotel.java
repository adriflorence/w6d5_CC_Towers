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

    public void checkInToBedroom(Guest guest, BedRoom guestBedroom, int numberOfNightsToStay) {
        for (Room room : rooms) {
            if ((room == guestBedroom) && (guestBedroom.getAvailableNights() >= numberOfNightsToStay)){
                room.checkIn(guest);
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
            }

        }
        return guestList;
    }

    public ArrayList<Room> getFreeRoomList(){
        ArrayList<Room> freeRoomList = new ArrayList<Room>();
        for (Room roomToCheck : rooms) {
            if( roomToCheck.getNumberOfGuests() == 0) {
                freeRoomList.add(roomToCheck);
            }
        }
        return freeRoomList;
    }

    public ArrayList<Room> getAllBedrooms(){
        ArrayList<Room> bedroomList = new ArrayList<Room>();
        for (Room roomToCheck : rooms) {
            if( roomToCheck instanceof BedRoom) {
                bedroomList.add(roomToCheck);
            }
        }
        return bedroomList;
    }

    public ArrayList<Room> getFreeBedroomList(){
        ArrayList<Room> freeBedroomList = new ArrayList<Room>();
        for (Room roomToCheck : getAllBedrooms()) {
            if( roomToCheck.getNumberOfGuests() == 0) {
                freeBedroomList.add(roomToCheck);
            }
        }
        return freeBedroomList;
    }

}
