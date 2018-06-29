package Hotel;

import Hotel.Bedroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class BedroomTest {


   Guest guest;
   ArrayList<Guest> guests;
    Bedroom bedroom;




   @Before
    public void before(){
       guest = new Guest("Steve");
       bedroom = new Bedroom(17, RoomType.SINGLEROOM, 50);
   }

   @Test
    public void roomStartsEmpty(){
       assertEquals(0, bedroom.numberOfGuests());
   }

   @Test
    public void guestCheckedIn(){
       bedroom.checkInGuest(guest);
       assertEquals(1, bedroom.numberOfGuests());
   }








}
