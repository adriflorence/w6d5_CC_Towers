public class BedRoom extends Room {

    private int roomNumber;
    private BedRoomType type;
    private double nightlyRate;

    public BedRoom(int roomNumber, BedRoomType type, double nightlyRate) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;

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
