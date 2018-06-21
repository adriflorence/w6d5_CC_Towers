public class BedRoom extends Room {

    private int roomNumber;
    private BedRoomType type;
    private double nightlyRate;

    public BedRoom(int roomNumber, BedRoomType type, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }
}
