import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests(){
        return guests.size();
    }

    public void checkIn(Guest guest) {
        if (getNumberOfGuests() < capacity){
            guests.add(guest);
        }
    }

    public void checkOut(Guest guest) {
        for (Guest checkedInGuest : guests){
            if (checkedInGuest == guest) {
                checkedInGuest = guest;
            }
        }
        guests.remove(guest);
    }
}
