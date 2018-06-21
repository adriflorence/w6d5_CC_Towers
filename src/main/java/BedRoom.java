public class BedRoom extends Room {

    private int roomNumber;
    private BedRoomType type;
    private double nightlyRate;

    public BedRoom(int capacity, int roomNumber, BedRoomType type, double nightlyRate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public BedRoomType getType() {
        return type;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
