import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
       radio = new Radio("Sony", "rad1");
    }

    @Test
    public void canTuneToStation(){
        assertEquals("Forth One", radio.getTune());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("rad1", radio.getModel());
    }
}
