package PushingBoxes;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**@author Viktor and Nour
 */
public class ForestTest 
{   public ForestTest() {}
    
    /** Test of getLocation method, of class Forest.
     * Tests if the method returns the address to the map.
     */
    @Test
    public void testGetLocation()
    {   System.out.println("getLocation");
        Forest instance = new Forest();
        String expResult = "Graphix/forest.tmx";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**Test of getBoxes method, of class Forest.
     * Tests if the method returns the number of the boxes for the level.
     */
    @Test
    public void testGetBoxes() 
    {   System.out.println("getBoxes");
        Forest instance = new Forest();
        int expResult = 4;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
    }

    /** Test of getobjects method, of class Forest.
     * Ignored because it is not implemented. 
     */
    @Test
    @Ignore
    public void testGetobjects()
    {   System.out.println("getobjects");
        Forest instance = new Forest();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
    }
}
