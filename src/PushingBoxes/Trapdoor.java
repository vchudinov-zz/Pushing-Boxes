/** Trapdoor - the place where boxes go to die.
 * @version 2
 * @author Viktor and Nour
 */
package PushingBoxes;

public class Trapdoor {
    public int x,y; //position of the door
    
    /** Class constructor.
     * Sets the door on the field
     * @param x - the x position
     * @param y - the y position
     * @version 1
     */
    public Trapdoor(int x, int y)
    { x = this.x;
      y = this.y;
    }
      
    /** Checks the position of boxes in relation to the door.
     * Iterates trough all the boxes on the field and checks their position.
     * If they are on the tile they become unmoveable and inivisible
     * If a box is on the door it disappears and the player should receive energy.
     * We have an issue with updating the energy right now
     * 
     * @param model - Takes a model, because our Model class has all the goodies
     * 
     * @version 6
     */
    public void check(Model model)
    {   for (int i = 0; i < model.boxes.length; i++) 
        {   if (model.boxes[i].xpos <= 264 && model.boxes[i].xpos >= 232 && model.boxes[i].ypos  <= 232 && model.boxes[i].ypos >= 200 )
            {   model.drawable[i] = false;
                model.moveable[i] = false;
            }
       } 
    }
}
    

