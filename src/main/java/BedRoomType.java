public enum BedRoomType {

    SINGLE(1, "Single"),
    DOUBLE(2, "Double");

    private final int value;
    private final String name;

    BedRoomType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getCapacity() {
        return value;
    }

    public String getName() {
        return name;
    }
}
