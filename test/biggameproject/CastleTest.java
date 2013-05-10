/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import PushingBoxes.Castle;
import PushingBoxes.Location.Direction;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Atari
 */
public class CastleTest {
    
    public CastleTest() {
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
     * Test of getExits method, of class Castle.
     */
    @Test
    public void testGetExits() {
        System.out.println("getExits");
        Direction direction = null;
        Castle instance = new Castle();
        List expResult = null;
        List result = instance.getExits(direction);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Castle.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Castle instance = new Castle();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocations method, of class Castle.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        Castle instance = new Castle();
        List expResult = null;
        List result = instance.getLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadmap method, of class Castle.
     */
    @Test
    public void testLoadmap() {
        System.out.println("loadmap");
        Castle instance = new Castle();
        TiledMap expResult = null;
        TiledMap result = instance.loadmap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
