package Hotel;

import java.util.ArrayList;

public class Hotel {

    protected ArrayList<Bedroom> bedrooms;
    protected ArrayList<ConferenceRoom> conferenceRooms;
    protected ArrayList<DinningRoom> DinningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.DinningRooms = new ArrayList<DinningRoom>();
    }

    public ArrayList<Bedroom> getBedrooms(){
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms(){
        return this.conferenceRooms;
    }

    public ArrayList<DinningRoom> getDinningRooms(){
        return this.DinningRooms;
    }


}
