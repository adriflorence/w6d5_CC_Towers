public class ConferenceRoom extends Room{

    private String roomName;
    private double dailyRate;

    public ConferenceRoom(int capacity, String roomName, int dailyRate) {
        super(capacity);
        this.roomName = roomName;
        this.dailyRate = dailyRate;
    }
}
