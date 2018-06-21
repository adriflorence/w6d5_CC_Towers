import java.util.ArrayList;

public class Room {

    private ArrayList<Guest> guests;
    private int capacity;
    private boolean free;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.free = free;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFree() {
        if(getNumberOfGuests() == 0) {
            return true;
        } return false;
    }

    public int getNumberOfGuests(){
        return guests.size(); // guest = null
    }

    public void checkIn(Guest guest) {
        if (free && getNumberOfGuests() < capacity){
            guests.add(guest);
        }
    }
}
