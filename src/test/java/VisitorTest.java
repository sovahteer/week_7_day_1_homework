import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Brian", 14, 162, 10);
    }

    @Test
    public void hasName(){
     assertEquals("Brian", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(162, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(10, visitor.getMoney());
    }
}
