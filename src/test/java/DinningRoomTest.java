import Hotel.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DinningRoomTest{

    DinningRoom dinningRoom;

    @Before
    public void before(){
        dinningRoom = new DinningRoom(40);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(40, dinningRoom.getCapacity());
    }
}

