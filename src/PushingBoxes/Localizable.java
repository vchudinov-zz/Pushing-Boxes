package PushingBoxes;

/** Localizable refers to all the objects of the game without the player.
 * It is further extended in the GameObject class.
 * PushBox - or the boxes the player pushes around are an implementation of Localizable.
 * The player could also be an implementation of this class, 
 * but we decided to keep him as a separate class, 
 * because the Localizable move method takes slightly different arguments. 
 * There is probably a way around this, but we couldn't find it
 * 
 * @see GameObject
 * @see PushBox
 * @see Player
 * @see Model
 * @version 3
 * 
 * @author Viktor and Nour
 * 
 
*/
public interface Localizable 
{   /**The directions in which an object can move. 
    * Their names are self-explanatory */
    enum Direction { right,up,left,down};
    
    /** Deals with the movement of objects.
     * In this version the only movable objects are the PushBoxes. 
     * In order to move they check their location in relation to the player, 
     * to detect if he is 'pushing' them
     * 
     * @param direction - the direction of movement
     * @param model - model has all the necessary things for movement - the player, the gutter and the steps.
     * @see Player
     * @see Model
     * 
     * @version 5 
     */
     public void move(Direction direction, Model model);
}
