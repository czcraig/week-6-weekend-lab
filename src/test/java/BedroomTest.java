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

   @Test
    public void checkOutGuest(){
       bedroom.checkInGuest(guest);
       bedroom.checkOutGuest();
       assertEquals(0, bedroom.numberOfGuests());

   }

   @Test
    public void getRoomNumber(){
       assertEquals(17, bedroom.getRoomNumber());
   }

   @Test
    public void getNightlyCost(){
       assertEquals(50, bedroom.getNightlyCost());
   }

   @Test
    public void getRoomType(){
       assertEquals(RoomType.SINGLEROOM, bedroom.getRoomType());
   }

   @Test
    public void getCapacity(){
       assertEquals(1, bedroom.getCapacity());
   }











}
