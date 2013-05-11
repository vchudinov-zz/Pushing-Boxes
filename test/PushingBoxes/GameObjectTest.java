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

/**
 *
 * @author Atari
 */
public class GameObjectTest {
    
    public GameObjectTest() {
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
     * Test of canBeTaken method, of class GameObject.
     */
    @Test
    public void testCanBeTaken() {
        System.out.println("canBeTaken");
        GameObject instance = new GameObjectImpl();
        boolean expResult = false;
        boolean result = instance.canBeTaken();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canBeMoved method, of class GameObject.
     */
    @Test
    public void testCanBeMoved() {
        System.out.println("canBeMoved");
        GameObject instance = new GameObjectImpl();
        boolean expResult = false;
        boolean result = instance.canBeMoved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of energyeffect method, of class GameObject.
     */
    @Test
    public void testEnergyeffect() {
        System.out.println("energyeffect");
        GameObject instance = new GameObjectImpl();
        int expResult = 0;
        int result = instance.energyeffect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameObjectImpl implements GameObject {

        public boolean canBeTaken() {
            return false;
        }

        public boolean canBeMoved() {
            return false;
        }

        public int energyeffect() {
            return 0;
        }
    }
}
