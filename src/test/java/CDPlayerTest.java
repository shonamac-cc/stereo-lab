import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "CDPlay1", 8);
    }

    @Test
    public void canGetNumOfCds(){
        assertEquals(8, cdPlayer.getNumOfCds());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("CDPlay1", cdPlayer.getModel());
    }
}
