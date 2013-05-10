/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biggameproject;

import PushingBoxes.Bridge;
import PushingBoxes.Location.Direction;
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
public class BridgeTest {
    
    public BridgeTest() {
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
     * Test of getExits method, of class Bridge.
     */
//    @Test
//    public void testGetExits() {
//        System.out.println("getExits");
//        Direction direction = null;
//        Bridge instance = new Bridge();
//        List expResult = null;
//        List result = instance.getExits(direction);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDescription method, of class Bridge.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Bridge instance = new Bridge();
        String expResult = "You hear the sound of water rushing near you, but the thick "
                + "\novergrowth does not let you see where exactly."
                + "\n The path suddenly takes a turn to the left and you see a river."
                + "\n And the only way to cross it seems the old stone bridge in front of you."
                + "\n The problem is that there s a gate on it."
                + "\n You approach the door and judging by the look of it it's locked."
                + "\n Great!"
                + "\n You hear some scuttling noise behind you and you turn around startled."
                + "\n There is an old beardd man with a pointy hat lookig at you with distrust."
                + "\n \"You have to pay a tax to pass from here\" - he syas with a crackling voice."
                + "\n Even greater!\"What\'s the tax\" you ask."
                + "\"Normally I'd take gold. But today is different. "
                + "\nA mighty beast lived here! And it held the key."
                + "\n I defeated it, but alas, the key was not with it."
                + "\n If you want to pass you have to go to the beast's lair and get the key to the bridge!"
                + "\n Off you go now!\"";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
             
                
    }

    /**
     * Test of getLocations method, of class Bridge.
     */
//    @Test
//    public void testGetLocations() {
//        System.out.println("getLocations");
//        Bridge instance = new Bridge();
//        List expResult = null;
//        List result = instance.getLocations();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
