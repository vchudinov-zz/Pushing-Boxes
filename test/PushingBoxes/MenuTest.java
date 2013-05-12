package PushingBoxes;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.newdawn.slick.Input;

/**@author Viktor and Nour
 */
public class MenuTest 
{   public MenuTest() {}
    
    /** Test of checkmMenu method, of class Menu.
     * We test this by actually testing it in game. No idea how to do it otherwise.
     */
    @Test
    @Ignore
    public void testCheckmMenu() {
        System.out.println("checkmMenu");
        Input input = null;       
        boolean game = false;
        Menu instance = new Menu();
        instance.checkmMenu(input, game);
        assertTrue(game);
    }
}
