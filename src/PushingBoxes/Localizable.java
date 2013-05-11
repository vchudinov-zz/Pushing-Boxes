package PushingBoxes;

/** Localizable refers to all the moving objects of the game without the player.
 * 
 * It is further extended in the GameObject class
 * @see GameObject
 * @see PushBox
 * @author Viktor and Nour
 * 
 * @version 3
*/
public interface Localizable 
{
    /**The directions in which a player can move.
     */
    public enum Direction {
        /**
         *
         */
        right,
        /**
         *
         */
        up,
        /**
         *
         */
        left,
        /**
         *
         */
        down};
    
    /** Deals with the movement of objects. 
     * In the current version the only moveable objects are the boxes.
     * @param direction 
     * @param model 
     * @params direction - the direction of movement
     * @params model - model has all the necessary things for movement - the player, the gutter and the steps.
     * @version 5 
     * @see Player
     */
    public void move(Direction direction, Model model);
}
