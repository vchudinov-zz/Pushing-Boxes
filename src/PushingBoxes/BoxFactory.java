
package PushingBoxes;

import java.util.Random;
import org.newdawn.slick.SlickException;

/** Factory class for PushBox objects.
 * Creates new PushBoxes at random coordinates within the game field. 
 * In a final version of the game the boxes will have a set number of 
 * coordinates in order to prompt the player to carefully preserve their energy
 *  
 * @see PushBox
 * @version 3
 * @author Viktor and Nour
 */
public class BoxFactory 
{   static PushBox[] boxes;                  //The array of all Pushboxes for each level.
    
    static Random random = new Random();    //Random generator for the coordinates of each box
    
    /** Populates the array boxes with the specified number of boxes.
     * 
     * @return - Returns the populated array of PushBoxes
     * @throws SlickException 
     * @param numberOfBoxes - the number of PushBoxes to be created
     * 
     * @version 2
     */
    protected static PushBox[] generator(int numberOfBoxes) throws SlickException
    {   boxes = new PushBox[numberOfBoxes];                                     //Initialize the array.
        for (int counterOfBoxes = 0; counterOfBoxes < numberOfBoxes; counterOfBoxes++)  //Populate it.
        {   boxes[counterOfBoxes] = new PushBox(random.nextInt(10)*32+96, random.nextInt(10)*32+96);
        }
        return boxes;   //Return it.
    }
    
    /** Used to set up the boolean value for each box.
     * In the current version these are movable and drawable - 
     * whether the object can be moved and whether it should be shown on the screen. 
     * For example when a box falls inside the "door" it shouldn't be shown and it shouldn't move.
     * 
     * This could be replaced by having a getMoveable and getDrawable method 
     * inside PushBox, but for now it works with arrays.
     * @return - Returns the populated array of booleans
     * @param settings - the boolean array that should be populated with values.
     * @param length - the length of the boolean
     * @see Model
     *  
     * @version 3
     */
    protected static boolean[] boxSettings(boolean[] settings, int length)
    {   settings = new boolean[length];           //Initialize the boolean
        for (int i = 0; i < settings.length; i++) //Populate the boolean.
        {   settings[i] = true;
        }
        return settings;                          //Return it
    }
}
