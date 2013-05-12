package PushingBoxes;

/** Trapdoor - the place where boxes go to die.
 * THis class creates a trapdoor and checks whether 
 * a box has the same coordinates as the door. 
 * If it does, the box disappears and cannot be moved anymore.
 * 
 * @version 2
 * @author Viktor and Nour
 */
public class Trapdoor {
    int x,
        y; //The x and y coordinates
    
    /** Class constructor.
     * Sets the door on the field
     * @param x - the x position
     * @param y - the y position
     * @version 1
     */
    Trapdoor(int x, int y)
    { x = this.x;
      y = this.y;
    }
      
    /** Checks the position of boxes in relation to the door.
     * Iterates trough all the boxes on the field and checks their position.
     * If they are on the same tile as the door they become un-movable and disappear.
     *      * 
     * @param model - Takes a model, because our Model class has all the necessary variables inside it.
     * 
     * @see Model
     * @see Player
     * @see PushBox
     * 
     * @version 6
     */
    void check(Model model)
    {   for (int i = 0; i < model.boxes.length; i++) /*Iterate trough the boxes 
                                                     * and checks if they ar einside the door, */
        {   if (model.boxes[i].xpos <= Controller.fieldSize/2 && 
                model.boxes[i].xpos >= Controller.fieldSize/2 && 
                model.boxes[i].ypos  <= Controller.fieldSize/2 && 
                model.boxes[i].ypos >= Controller.fieldSize/2 - 32 )
            
            {   model.drawable[i] = false; /*if the box is inside the coordinates 
                                            * it disappears and becomes unmoveable */
                model.moveable[i] = false;
            }
       } 
    }
}
    

