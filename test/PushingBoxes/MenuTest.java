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
public class MenuTest {
    
    public MenuTest() {
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
     * Test of checkmMenu method, of class Menu.
     */
    @Test
    public void testCheckmMenu() {
        System.out.println("checkmMenu");
        Input input = null;
        Visuals view = null;
        Menu instance = new Menu();
        instance.checkmMenu(input, view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
