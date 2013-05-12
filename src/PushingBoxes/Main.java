package PushingBoxes;

import org.newdawn.slick.SlickException;


/** Pushing Boxes - The game where you...push boxes.
 * The goal of the game is to get all the boxes in the trapdoor.
 * Moving heavy boxes is not that easy, though, and when the player does it he loses energy.
 * Lose your energy and you lose a life. Unlike cats the player has only three lives before they lose the game
 * 
 * Note from Viktor: If you cannot run the game because of a 
 * library error right click on the project -> Add Library. 
 * Select the files in the lib subfolder of the project and add them.
 * In the run submenu in the field VM write 
 * -Djava.library.path=<path to your java projects folder>\PushingBoxes\src\Natives\
 * 
 * 
 * The graphics were made by Celliana and Inquisitor
 * and have been taken from: http://forums.rpgmakerweb.com and http://www.rpg-palace.com/
 * 
 * The character sprite is taken from: http://untamed.wild-refuge.net
 * The graphics are based on tiles 32x32 pixels.
 * 
 * @see everything
 *   
 * @author Viktor and Nour
 * @version 5
 */
public class Main 
{   /** Starts the game. 
    * It's nice to get things clear
    * And have a class Main.
    * 
    * @param args
    * @throws SlickException
    * @version 1
    */
    public static void main(String[] args) throws SlickException
    {   Controller game = new Controller();
        game.game();
    }
}
