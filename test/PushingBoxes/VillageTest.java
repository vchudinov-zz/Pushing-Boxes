/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Atari
 */
public class VillageTest
{   public VillageTest() {}
    

    /** Test of getLocation method, of class Village.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Village instance = new Village();
        
        String expResult = "Graphix/village.tmx";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getBoxes method, of class Village.
     */
    @Test
    public void testGetBoxes() {
        System.out.println("getBoxes");
        Village instance = new Village();
        int expResult = 2;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getobjects method, of class Village.
     */
    @Test
    @Ignore
    public void testGetobjects() {
        System.out.println("getobjects");
        Village instance = new Village();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
