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

/**
 *
 * @author Atari
 */
public class ModelTest {
    
    public ModelTest() {
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
     * Test of setBoxes method, of class Model.
     */
    @Test
    public void testSetBoxes() throws Exception {
        System.out.println("setBoxes");
        int counter = 0;
        Model instance = new Model();
        instance.setBoxes(counter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Model.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        int lgutter = 0;
        int rgutter = 0;
        int bgutter = 0;
        int tgutter = 0;
        int pxToMove = 0;
        Model instance = new Model();
        instance.start(lgutter, rgutter, bgutter, tgutter, pxToMove);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Model.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Input i = null;
        PushBox[] boxes = null;
        Model instance = new Model();
        instance.move(i, boxes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
