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
     * Fails because of a method that is not implemented.
     */
    @Test
    @Ignore
    public void testGetobjects() 
    {   System.out.println("getobjects");
        Castle instance = new Castle();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
