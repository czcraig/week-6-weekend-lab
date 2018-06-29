package Hotel;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    protected int capacity;
    protected ArrayList<Guest>guest;

    public Room(int capacity, ArrayList<Guest>guest){
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }





}
