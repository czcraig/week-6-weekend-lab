package Hotel;
import Hotel.Room;

import java.util.ArrayList;

public class Bedroom extends Room {

    protected int roomNumber;
    protected int nightlyCost;
    protected RoomType capacity;
    protected RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType, int nightlyCost){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyCost = nightlyCost;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getNightlyCost(){
        return this.nightlyCost;
    }





}
