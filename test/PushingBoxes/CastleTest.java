package PushingBoxes;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**@author Viktor and Nour
 */
public class CastleTest
{   public CastleTest() {
    }
    
    /**Test of getLocation method, of class Castle.
     * Tests if the method returns the address of the level map.
     */
    @Test
    public void testGetLocation()
    {   System.out.println("getLocation");
        Castle instance = new Castle();
        String expResult = "Graphix/castle.tmx";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /** Test of getBoxes method, of class Castle.
     * Tests if the method returns the number of boxes.
     */
    @Test
    public void testGetBoxes() 
    {   System.out.println("getBoxes");
        Castle instance = new Castle();
        int expResult = 6;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
    }

    /**Test of getobjects method, of class Castle.
     * Ignored, because it is unimplemented method.
     */
    @Test
    @Ignore
    public void testGetobjects() 
    {   System.out.println("getobjects");
        Castle instance = new Castle();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
    }
}
