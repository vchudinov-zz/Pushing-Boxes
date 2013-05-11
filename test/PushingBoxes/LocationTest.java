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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getLocation method, of class Location.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Location instance = new LocationImpl();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Location.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Location instance = new LocationImpl();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoxes method, of class Location.
     */
    @Test
    public void testGetBoxes() {
        System.out.println("getBoxes");
        Location instance = new LocationImpl();
        int expResult = 0;
        int result = instance.getBoxes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getobjects method, of class Location.
     */
    @Test
    public void testGetobjects() {
        System.out.println("getobjects");
        Location instance = new LocationImpl();
        List expResult = null;
        List result = instance.getobjects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class LocationImpl implements Location {

        public String getLocation() {
            return "";
        }

        public int getID() {
            return 0;
        }

        public int getBoxes() {
            return 0;
        }

        public List<GameObject> getobjects() {
            return null;
        }
    }
}
