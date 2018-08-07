import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall icecreamstall;

    @Before
    public void before(){
        icecreamstall = new IceCreamStall("Camp Crystal Cream", "Jason", "F-22");
    }

    @Test
    public void hasName(){
        assertEquals("Camp Crystal Cream", icecreamstall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Jason", icecreamstall.getOwnerName());
    }

    @Test
    public void hasSpot() {
        assertEquals("F-22", icecreamstall.getParkingSpot());
    }
}
