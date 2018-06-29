package Hotel;
import Hotel.ConferenceRoom;

    public class ConferenceRoom extends Room{

        protected int rate;
        protected String name;

        public ConferenceRoom(int capacity, int rate, String name){
            super(capacity);
            this.rate = rate;
            this.name = name;
        }

        public int getRate(){
            return this.rate;
        }

        public String getName(){
            return this.name;
        }

    }










