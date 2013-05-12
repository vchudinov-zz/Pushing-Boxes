package PushingBoxes;

import org.junit.Ignore;
import org.junit.Test;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**We could not test the methods of Controller, Visuals and VisualInitializer with a JUnit test,
 * since it does not work with the Slick2d library. 
 * Or at least we could not make it work or find information how to do it. 
 * Luckily, these tests are only for graphics, and the logic is tested just fine.
 * @author Viktor and Nour
 */
public class ControllerTest
{   public ControllerTest() {}
        
    /** Test of game method, of class Controller.
     * Ignored, because of the reasons described above.
     */
    @Test
    @Ignore
    public void testGame() throws Exception
    {   System.out.println("game");
        Controller instance = new Controller();
        instance.game();
    }

    /** Test of init method, of class Controller.
     * Ignored because of reasons described above.
     */
    @Test
    @Ignore
    public void testInit() throws Exception 
    {   System.out.println("init");
        GameContainer gc = null;
        Controller instance = new Controller();
        instance.init(gc);
    }

    /** Test of update method, of class Controller.
     * Ignored because of reasons described above.
     */
    @Test
    @Ignore
    public void testUpdate() throws Exception 
    {   System.out.println("update");
        GameContainer gc = null;
        int i = 0;
        Controller instance = new Controller();
        instance.update(gc, i);
    }

    /** Test of render method, of class Controller.
     * Ignored because of reasons described above.
     */
    @Test
    @Ignore
    public void testRender() throws Exception
    {   System.out.println("render");
        GameContainer gc = null;
        Graphics grphcs = null;
        Controller instance = new Controller();
        instance.render(gc, grphcs);
    }
}
