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
public class BoxFactoryTest {
    
    public BoxFactoryTest() {
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
     * Test of generator method, of class BoxFactory.
     */
    @Test
    public void testGenerator() throws Exception {
        System.out.println("generator");
        int numberOfBoxes = 0;
        PushBox[] expResult = null;
        PushBox[] result = BoxFactory.generator(numberOfBoxes);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boxSettings method, of class BoxFactory.
     */
    @Test
    public void testBoxSettings() {
        System.out.println("boxSettings");
        boolean[] settings = null;
        int length = 0;
        boolean[] expResult = null;
        boolean[] result = BoxFactory.boxSettings(settings, length);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
