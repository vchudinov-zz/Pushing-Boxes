/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.Input;
import org.newdawn.slick.tiled.TiledMap;

/**
 *
 * @author Atari
 */
public class VisualsTest {
    
    public VisualsTest() {
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
     * Test of graphics method, of class Visuals.
     */
    @Test
    public void testGraphics() throws Exception {
        System.out.println("graphics");
        Model model = null;
        Visuals instance = new Visuals();
        instance.graphics(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveAnim method, of class Visuals.
     */
    @Test
    public void testMoveAnim() {
        System.out.println("moveAnim");
        Input i = null;
        Visuals instance = new Visuals();
        instance.moveAnim(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Visuals.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        TiledMap map = null;
        Visuals instance = new Visuals();
        instance.start(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
