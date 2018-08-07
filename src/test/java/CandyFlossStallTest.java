import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyflossstall;

    @Before
    public void before(){
        candyflossstall = new CandyFlossStall("Dream Floss", "Freddy",
                "B-52", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Dream Floss", candyflossstall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Freddy", candyflossstall.getOwnerName());
    }

    @Test
    public void hasSpot() {
        assertEquals("B-52", candyflossstall.getParkingSpot());
    }

    @Test
    public void hasRating() { assertEquals(4, candyflossstall.getRating());}
}
