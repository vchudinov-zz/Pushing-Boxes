package PushingBoxes;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.newdawn.slick.Input;

/** The Input parameter that the method in this class uses.
 * is from the Slick2d Library and we cannot run it trough JUnit.
 * Instead we test it in-game.
 * @author Viktor and Nour
 */
public class MenuTest 
{   public MenuTest() {}
    
    /** Test of checkmMenu method, of class Menu.
     */
    @Test
    @Ignore
    public void testCheckmMenu()
    {   System.out.println("checkmMenu");
        Input input = null;       
        boolean game = false;
        Menu instance = new Menu();
        instance.checkmMenu(input, game);
        assertTrue(game);
     }
}
