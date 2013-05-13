package PushingBoxes;

import PushingBoxes.Localizable.Direction;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/** This class takes care of the game logic.
 * This includes movement of the player, checking his position in relation to 
 * the boxes and the gutters of the field. Also the initial setup of the game.
 * Movement on the field is done by changing the 
 * coordinates x and y in relation to the top left corner of the game container
 * 
 * @see Player
 * @see PushBox
 * @see Controller
 * 
 * @version 4
 * @author Viktor and Nour
 */

public class Model 
{   boolean game = false;                   /* This boolean decides whether the game is running or 
                                               if it is in the menu. */
    boolean[] drawable,moveable;            /* Boolean values that represent 
                                             * whether the boxes should be displayed and moved. */
    
    int size, lgutter,rgutter,tgutter,bgutter, pxToMove, numberOfBoxes; /* gutters, size of tiles,
                                            * 'step' size for movement and number of boxes. */
    PushBox[] boxes;                        //The boxes that the player pushes around.
    
    Player player;                          // The player.
    BoxFactory factory = new BoxFactory();  //The factory that creates all the boxes.
    Trapdoor door;                          //the door where all boxes must go.
    
    /** Sets up the boxes using the box factory
     * @param nOfBoxes - the number of boxes
     * @throws SlickException 
     * 
     * @version 2
     */
    protected void setBoxes(int nOfBoxes) throws SlickException
    {   this.numberOfBoxes = nOfBoxes;
        boxes = BoxFactory.generator(nOfBoxes); //Generates the array of boxes
        drawable = BoxFactory.boxSettings(drawable,nOfBoxes);   //makes them drawable
        moveable = BoxFactory.boxSettings(moveable,nOfBoxes);   //and movable
    }
    
    /** Initializes the logical game board.
     * Takes as parameters the values of each gutter - top, bottom, 
     * left and right, and the 'step' a player makes when moving.
     * The gutters refer to the edges of the game board over which the player cannot go.
     * There is a reference to the size variable in Controller class. 
     * 
     * @param lgutter  - the left gutter
     * @param rgutter - the right gutter
     * @param bgutter - the bottom gutter
     * @param tgutter - the top gutter
     * @param pxToMove - the 'step' of the player
     * 
     * @see Controller
     * @version 3
     */
    protected void start(int lgutter, int rgutter, int bgutter,int tgutter, int pxToMove)
    {   player = new Player();          //Initialize the player
        size = Controller.size;         //set the tile size to be the same. In theory this could be removed.
        door = new Trapdoor(Controller.fieldSize/2, Controller.fieldSize/2);    //sets the trapdoor
        this.lgutter = lgutter;         //Sets the gutters
        this.rgutter = rgutter;
        this.tgutter = tgutter;
        this.bgutter = bgutter; 
        this.pxToMove = pxToMove;       //sets the step size of the player
    }
    
    /** Movement of player and boxes.
     * Takes care of the movement and checks if a box is to be moved. 
     * Also checks if a box is on the door. 
     * We think that this method has quite a lot of redundancy, 
     * but couldn't think how to improve it
     * 
     * @param i - keyboard input
     * @param boxes  - the array of boxes
     * @version 5 
     */
     protected void move(Input i, PushBox[] boxes) 
     {   if (i.isKeyDown(Input.KEY_UP))
         {   player.move(Direction.up, this);
             
             //Iterate trough the boxes and check ig they can be moved. If yes - move.
             for (int box = 0; box < boxes.length; box++)
             {   if ( moveable[box])
                 {   boxes[box].move(Direction.up, this);
                 }
             }
         }
            
         else if (i.isKeyDown(Input.KEY_DOWN))
         {   player.move(Direction.down,this);
                
             for (int box = 0; box < boxes.length; box++) 
             {   if (moveable[box])
                 {   boxes[box].move(Direction.down, this);
                 }
             }
         }
        
         else if (i.isKeyDown(Input.KEY_LEFT))
         {   player.move(Direction.left, this);
                
             for (int box = 0; box < boxes.length; box++)
             {   if (moveable[box])
                 {   boxes[box].move(Direction.left, this);
                 }
             }
         }
        
         else if (i.isKeyDown(Input.KEY_RIGHT))
         {  player.move(Direction.right, this);
       
             for (int box = 0; box < boxes.length; box++)
             {   if (moveable[box]) 
                 {   boxes[box].move(Direction.right, this);
                 }
             }
         }
    }
}
