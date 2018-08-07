import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("That one from Terminator 2");
    }

    @Test
    public void getName(){
        assertEquals("That one from Terminator 2", playground.getName());
    }
}
