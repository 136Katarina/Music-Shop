import items.Tuner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TunerTest {
    Tuner tuner;

    @Before
    public void before(){
        tuner = new Tuner("plastic");
    }

    @Test
    public void canGetMaterial(){
        assertEquals("plastic", tuner.getMaterial());
    }

}
