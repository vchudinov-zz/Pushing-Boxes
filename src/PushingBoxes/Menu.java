/** A single method class that changes the boolean variable game. 
 * This variable shows if the game is running or if it should display the menu.
 * @version 2
 * @see Model
 * @author Viktor and Nour
 */
package PushingBoxes;

import org.newdawn.slick.Input;

/**
 *
 * @author Atari
 */
public class Menu 
{   boolean checkmMenu(Input input, boolean game)
    {   if (input.isKeyPressed(Input.KEY_ENTER)) 
        { game = true;
        }
    
        else if (input.isKeyPressed(Input.KEY_Q))
        {   System.exit(1);
        }
        
        else if (input.isKeyPressed(Input.KEY_0))
        { game = false;}
        
        return game;
    }
}
