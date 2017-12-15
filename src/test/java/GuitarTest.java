import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(5,"wood","white","medium",200, 100);
    }

    @Test
    public void canPlay(){
        assertEquals("I make: guitar sounds", guitar.play("guitar sounds"));
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100, guitar.calculateMarkup(),0.1);
    }

    @Test
    public void canGetNumber(){
        assertEquals(5, guitar.getNumberofStrings());
    }


}
