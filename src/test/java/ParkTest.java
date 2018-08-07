import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Lincoln Park");
    }

    @Test
    public void getName(){
        assertEquals("Lincoln Park", park.getName());
    }
}
