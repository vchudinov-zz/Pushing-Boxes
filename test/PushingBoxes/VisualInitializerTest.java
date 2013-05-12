package PushingBoxes;

import org.junit.Ignore;
import org.junit.Test;

/**We could not test the methods of Controller, Visuals and VisualInitializer with a JUnit test,
 * since it does not work with the Slick2d library. 
 * Or at least we could not make it work or find information how to do it. 
 * Luckily, these tests are only for graphics, and the logic is tested just fine.
 * @author Viktor and Nour
 */
public class VisualInitializerTest 
{   public VisualInitializerTest() {}
    
    /** Test of newFrame method, of class VisualInitializer.
     * This method basically creates a new frame and since
     * it has to do with Slick2D JUnit does not like it.
     * We can run it by hand and it works.
     */
    @Test
    @Ignore
    public void testNewFrame()
    {   System.out.println("newFrame");
        int width = 20;
        int height = 30;
        VisualInitializer.newFrame(width, height);
     }
}
