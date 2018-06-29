package Hotel;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    protected int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int numberOfGuests(){
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }


}
