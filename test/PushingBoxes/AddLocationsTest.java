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
public class AddLocationsTest {
    
    public AddLocationsTest() {
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
     * Test of AddLocations method, of class AddLocations.
     */
    @Test
    public void testAddLocations() {
        System.out.println("AddLocations");
        AddLocations instance = new AddLocations();
        List expResult = null;
        List result = instance.AddLocations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of levels method, of class AddLocations.
     */
    @Test
    public void testLevels() throws Exception {
        System.out.println("levels");
        Model model = null;
        Visuals view = null;
        AddLocations instance = new AddLocations();
        instance.levels(model, view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of map method, of class AddLocations.
     */
    @Test
    public void testMap() throws Exception {
        System.out.println("map");
        AddLocations instance = new AddLocations();
        instance.map();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
