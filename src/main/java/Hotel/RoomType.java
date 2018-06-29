package Hotel;

public enum RoomType {
    SINGLEROOM(1),
    DOUBLEROOM(2);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;}

    public int getCapacity() {
        return this.capacity;
    }
}
