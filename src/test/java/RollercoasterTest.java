import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Final Destination");
    }

    @Test
    public void getName(){
        assertEquals("Final Destination", rollercoaster.getName());
    }
}