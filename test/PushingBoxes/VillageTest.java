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

/**
 *
 * @author Atari
 */
public class VillageTest {
    
    public VillageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLocation method, of class Village.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Village instance = new Village();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Village.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Village instance = new Village();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoxes method, of class Village.
     */
    @Test
    public void testGetBoxes() {
        System.out.println("getBoxes");
        Village instance = new Village();
        int expResult = 0;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getobjects method, of class Village.
     */
    @Test
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
