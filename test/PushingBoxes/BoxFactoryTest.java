package PushingBoxes;

import static org.junit.Assert.*;
import org.junit.Test;

/** @author Viktor and Nour
 */
public class BoxFactoryTest
{   public BoxFactoryTest() {}
    
    /** Test of generator method, of class BoxFactory.
     * Tests if it creates a list full of levels.
     */
    @Test
    public void testGenerator() throws Exception 
    {   System.out.println("generator");
        int numberOfBoxes = 2;
        PushBox[] expResult = {new PushBox(0,0), new PushBox(0,0)};
        PushBox[] result = BoxFactory.generator(numberOfBoxes);
        assertEquals(expResult.length, result.length);
    }

    /** Test of boxSettings method, of class BoxFactory.
     * Tests if the method successfully sets up the box settings.
     */
    @Test
    public void testBoxSettings()
    {   System.out.println("boxSettings");
        int length = 2;
        boolean[] settings = new boolean[length];
        boolean[] expResult = {true, true};
        boolean[] result = BoxFactory.boxSettings(settings, length);
        for (int i = 0; i < length; i++)
        {   System.out.println(expResult[i] + " " +  result[i]);
            assertTrue(result[i]);
        }
    }
}
