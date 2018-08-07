import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("If you can dodge a wrench, you can dodgem");
    }

    @Test
    public void getName(){
        assertEquals("If you can dodge a wrench, you can dodgem", dodgems.getName());
    }
}
