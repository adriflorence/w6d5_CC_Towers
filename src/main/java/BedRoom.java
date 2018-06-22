public class BedRoom extends Room {

    private int roomNumber;
    private BedRoomType type;
    private double nightlyRate;
    private int availableNights;

    public BedRoom(int roomNumber, BedRoomType type, double nightlyRate, int availableNights) {
        super(type.getCapacity());
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.availableNights = availableNights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacityFromEnum(){
        return type.getCapacity();
    }

    public int getAvailableNights() {
        return availableNights;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

}
