import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin("wooden", "brown","clasic", 400,250);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(150.0, violin.calculateMarkup(),0.1);
    }

    @Test
    public void canPlay(){
        assertEquals("I make: violin sounds", violin.play("violin sounds"));
    }
}
