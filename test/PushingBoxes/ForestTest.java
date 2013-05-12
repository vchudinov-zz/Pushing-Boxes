/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**@author Viktor and Nour
 */
public class ForestTest 
{   public ForestTest() {
    }
    
    /** Test of getLocation method, of class Forest.
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
     * Test fails because of a non-implemented method. 
     */
    @Test
    @Ignore
    public void testGetobjects()
    {   System.out.println("getobjects");
        Forest instance = new Forest();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
