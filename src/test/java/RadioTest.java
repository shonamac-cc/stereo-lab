import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
       radio = new Radio();
    }

    @Test
    public void canTuneToStation(){
        assertEquals("Forth One", radio.getTune());
    }
}
