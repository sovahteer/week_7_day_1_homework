import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccostall;

    @Before
    public void before(){
        tobaccostall = new TobaccoStall("Smoked", "Michael", "A-10");
    }

    @Test
    public void hasName(){
        assertEquals("Smoked", tobaccostall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Michael", tobaccostall.getOwnerName());
    }

    @Test
    public void hasSpot() {
        assertEquals("A-10", tobaccostall.getParkingSpot());
    }

    @Test
    public void isAllowedTo(){

    }
}
