/** Pushing Boxes - The game where you...push boxes.
 * This is the main class - start here.
 * 
 * @author Viktor and Nour
 * @version x.4
 * 
 * The concept of our game is for the player to push boxes in a hole and then 
 * move to next level where they'll do the same. It is a sort of puzzle. The player should be 
 * careful about their energy, because if it drops to zero they lose a life. 
 * Once all lives are gone - The game is over
 * 
 * Changelog:
 * Tweaked most things to make code better. Improved the Localizable interface. Removed the world interface
 * AddLocations should be renamed to something like levels
 * added new methods in Locations
 * 
 *  
 *  - If we have time - Start menu, Game Over screen, Credits Screen. 
 *  
 *   
 * This class initiates the game. 
 * 
 * Note from Viktor: If you cannot run the game because of a 
 * library error right click on the project -> Add Library. 
 * Select the files in the lib subfolder of the project and add them.
 * In the run submenu in the field VM write 
 * -Djava.library.path=<path to your java projects folder>\PushingBoxes\src\Natives\
 * 
 * note: The project now features improved readability. This is a feature, right?
 * The game should start from here. However there is not much for now. 
 * 
 * The graphics pack we are using were made by Celliana and Inquisitor
 * and have been taken from: http://forums.rpgmakerweb.com and http://www.rpg-palace.com/
 * 
 * The character sprite is taken from: http://untamed.wild-refuge.net
 * The graphics are based on tiles 32x32 squares
 * 
 * @author VIktor and Nour
 * @version 2
 * @see everything
 */
package PushingBoxes;

import org.newdawn.slick.SlickException;


public class Main 
{   public static void main(String[] args) throws SlickException
    {   Controller game = new Controller();
        game.game();
    }
    
}
