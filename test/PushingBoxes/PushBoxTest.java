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
public class PushBoxTest {
    
    public PushBoxTest() {
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
     * Test of move method, of class PushBox.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Direction direction = null;
        Player p = null;
        int pxToMove = 0;
        int gutter = 0;
        int size = 0;
        PushBox instance = null;
        instance.move(direction, p, pxToMove, gutter, size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
