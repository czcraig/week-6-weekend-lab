import Hotel.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(50, 100, "room A");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetRate(){
        assertEquals(100, conferenceRoom.getRate());
    }

    @Test
    public void canGetName(){
        assertEquals("room A", conferenceRoom.getName());
    }

}


