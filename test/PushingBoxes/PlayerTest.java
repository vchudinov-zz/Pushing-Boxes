/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import PushingBoxes.Localizable.Direction;
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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of energyLevel method, of class Player.
     */
    @Test
    public void testEnergyLevel() {
        System.out.println("energyLevel");
        Player instance = new Player();
        instance.energyLevel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Player.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Direction direction = null;
        int gutter = 0;
        int pxToMove = 0;
        Player instance = new Player();
        instance.move(direction, gutter, pxToMove);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
