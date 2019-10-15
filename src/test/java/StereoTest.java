import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    private Radio radio;
    private RPlayer rPlayer;
    private CDPlayer cdPlayer;


    @Before
    public void before(){
        radio = new Radio("Sony", "s1");
        rPlayer = new RPlayer("Sony", "r1", 45);
        cdPlayer = new CDPlayer("Sony", "c1", 8);
        stereo = new Stereo("Toshiba", radio, rPlayer, cdPlayer);
    }

    @Test
    public void increaseRadioVolume(){
        stereo.increaseVolume(4);
        assertEquals(4, stereo.getVolume() );
    }

    @Test
    public void tuneRadioToStation(){
        assertEquals("Forth One", radio.getTune());
    }
}
