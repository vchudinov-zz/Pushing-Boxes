package PushingBoxes;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/** @author Viktor and Nour
 */
public class BridgeTest
{   public BridgeTest()
    {}
    
     /** Test of getLocation method, of class Bridge.
      * Tests if the method returns the map address correctly.
     */
    @Test
    public void testGetLocation() 
    {   System.out.println("getLocation");
        Bridge instance = new Bridge();
        String expResult = "Graphix/bridge.tmx";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        ;
    }

    /**Test of getBoxes method, of class Bridge.
     * Tests if the method returns the number of boxes for the level.
     */
    @Test
    public void testGetBoxes()
    {   System.out.println("getBoxes");
        Bridge instance = new Bridge();
        int expResult = 5;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
     }

    /**Test of getobjects method, of class Bridge.
     * This is an unimplemented method. This is why it is ignored.
     */
    @Test
    @Ignore
    public void testGetobjects()
    {   System.out.println("getobjects");
        Bridge instance = new Bridge();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
}
