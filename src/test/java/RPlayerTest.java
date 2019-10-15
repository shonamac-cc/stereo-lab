import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RPlayerTest {

    RPlayer rPlayer;

    @Before
    public void before(){
        rPlayer = new RPlayer("Sony", "Rplay1", 45);
    }

    @Test
    public void canGetSpeed(){
        assertEquals(45, rPlayer.getSpeed());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", rPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Rplay1", rPlayer.getModel());
    }
}
