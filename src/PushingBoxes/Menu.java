package PushingBoxes;

import org.newdawn.slick.Input;

/** A single method class that changes the boolean variable game. 
 * This variable shows if the game is running or if it should display the menu.
 * @see Model
 * 
 * @version 2
 * @author Viktor and Nour
 */
public class Menu 
{   /** Checks and changes the boolean variable game.
    * We've included an extra key for testing purposes.
    * @param input - input from the keyboard
    * @param game - the boolean variable that decides the state of the game
    * @return game - returns the changed variable
    * 
    * @version 2
    */
    protected boolean checkmMenu(Input input, boolean game)
    {   if (input.isKeyPressed(Input.KEY_ENTER)) //Starts the game
        { game = true;
        }
    
        else if (input.isKeyPressed(Input.KEY_Q))//Exits the game
        {   System.exit(1);
        }
        
        else if (input.isKeyPressed(Input.KEY_0))//Switches to the menu at will.
        { game = false;}
        
        return game;
    }
}
