
package PushingBoxes;

import java.util.Random;
import org.newdawn.slick.SlickException;

/** Factory class for PushBox objects.
 * Creates new boxes. Currently it places the boxes at random coordinates. 
 * In a final version of the game the boxes will have a set number of 
 * coordinates in order to have a puzzle element
 * 
 * @version 3
 * 
 * @author Viktor and Nour
 */
public class BoxFactory {
    /**
     *
     */
    public static PushBox[] boxes;  //An array containing all the boxes
    static Random random = new Random();    //Random generator for the coordinates
    
    /** Populates the array boxes with the specified number of boxes.
     * @return - Returns the populated array of PushBoxes
     * @throws SlickException 
     * @param numberOfBoxes - the number of PushBoxes to be created
     * @version 2
     */
    public static PushBox[] generator(int numberOfBoxes) throws SlickException
    {   boxes = new PushBox[numberOfBoxes];
        for (int counterOfBoxes = 0; counterOfBoxes < numberOfBoxes; counterOfBoxes++)
        {   boxes[counterOfBoxes] = new PushBox(random.nextInt(10)*32+96, random.nextInt(10)*32+96);
        }
        return boxes;
    }
    
    /** Used to set up the boolean value for each box.
     * In the current version these are moveable and drawable - 
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
    
    public static boolean[] boxSettings(boolean[] settings, int length)
    {   settings = new boolean[length];
        for (int i = 0; i < settings.length; i++) 
        {   settings[i] = true;
        }
        return settings;
    }
}
