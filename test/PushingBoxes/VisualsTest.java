package PushingBoxes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

/**We could not test the methods of Controller, Visuals and VisualInitializer with a JUnit test,
 * since it does not work with the Slick2d library. 
 * Or at least we could not make it work or find information how to do it. 
 * Luckily, these tests are only for graphics, and the logic is tested just fine.
 * @author Viktor and Nour
 */
public class VisualsTest
{   public VisualsTest() {}
    /**Test of graphics method, of class Visuals.
     */
    @Test
    @Ignore
    public void testGraphics() throws Exception {
        System.out.println("graphics");
        Model model = null;
        Graphics gc = null;
        Visuals instance = new Visuals();
        instance.graphics(model, gc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /** Test of moveAnim method, of class Visuals.
     */
    @Test
    @Ignore
    public void testMoveAnim() 
    {   System.out.println("moveAnim");
        Input i = null;
        Visuals instance = new Visuals();
        instance.moveAnim(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**Test of start method, of class Visuals.
     */
    @Test
    @Ignore
    public void testStart() throws Exception 
    {   System.out.println("start");
        Visuals instance = new Visuals();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
