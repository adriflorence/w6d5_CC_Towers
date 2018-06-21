public enum BedRoomType {

    SINGLE(1, "Single"),
    DOUBLE(2, "Double");

    private final int capacity;
    private final String name;

    BedRoomType(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}
