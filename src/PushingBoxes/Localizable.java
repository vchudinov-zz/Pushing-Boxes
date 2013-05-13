package PushingBoxes;

/** Deals with the movement of objects.
     * In this version the only movable objects are the PushBoxes and the player. 
          * 
     * @param direction - the direction of movement
     * @param model - model has all the necessary things for movement -  the gutter and the step size.
     * @see Player
     * @see Model
     * 
     * @version 5 
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
