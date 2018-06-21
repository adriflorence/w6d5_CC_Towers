public class BedRoom extends Room {

    private int roomNumber;
    private BedRoomType type;
    private double nightlyRate;
    private int capacity;

    public BedRoom(int roomNumber, BedRoomType type, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.capacity = getCapacityFromEnum();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacityFromEnum(){
        return type.getCapacity();
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

}
