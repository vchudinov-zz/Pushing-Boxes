/** This class takes care of the game logic.
 * This includes movement of the player, checking his position in relation to 
 * the boxes and the gutters of the field. Also the initial setup of the game.
 * 
 * @see Player
 * @see PushBox
 * @see Controller
 * 
 * @version 4
 * @author Viktor and Nour
 */
package PushingBoxes;

import PushingBoxes.Localizable.Direction;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 *
 * @author Atari
 */
public class Model 
{   boolean game = false;
    Player player;  //Our player
    BoxFactory factory = new BoxFactory();  //The factory that creates all the boxes
    
    int size, lgutter,rgutter,tgutter,bgutter, pxToMove, counter; //gutters, size of tiles, 'step' size and number of boxes
    PushBox[] boxes; //The boxes that we'll push around
    boolean[] drawable,moveable;    //Boolean values that represent whether the boxes should be displayed and moved
    
    Trapdoor door;  //the door where all boxes must go
    
    /** Sets up the boxes using the box factory
     * @param counter - the number of boxes
     * @throws SlickException 
     * @version 2
     */
    public void setBoxes(int counter) throws SlickException
    {   this.counter = counter;
        boxes = BoxFactory.generator(counter);
        drawable = BoxFactory.boxSettings(drawable,counter);
        moveable = BoxFactory.boxSettings(moveable,counter);
//        door = new Trapdoor(Controller.fieldSize/2, Controller.fieldSize/2);
    }
    
    /** Initializes the logical game board.
     * Takes as parameters the values of each gutter -top, bottom, 
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
     * 
     * @version 3
     */
    public void start(int lgutter, int rgutter, int bgutter,int tgutter, int pxToMove)
    {   player = new Player();
        size = Controller.size;
        this.lgutter = lgutter;
        this.rgutter = rgutter;
        this.tgutter = tgutter;
        this.bgutter = bgutter; 
        this.pxToMove = pxToMove;
    }
    
    /** Movement of player and boxes.
     * Takes care of the movement and checks if a box is to be moved. 
     * Also checks if a box is on the door. 
     * We think that this method has quite a lot of redundancy, 
     * but couldn't think how to improve it
     * 
     * @param i 
     * @param boxes 
     * @version 5 
     */
    public void move(Input i, PushBox[] boxes) 
    {   if (i.isKeyDown(Input.KEY_UP))
         {   player.move(Direction.up, tgutter, pxToMove);
             for (int box = 0; box < boxes.length; box++)
             {   if ( moveable[box])
                 {   boxes[box].move(Direction.up, this);
                 }
             }
         }
            
         else if (i.isKeyDown(Input.KEY_DOWN))
         {   player.move(Direction.down, bgutter, pxToMove);
                
             for (int box = 0; box < boxes.length; box++) 
             {   if (moveable[box])
                 {   boxes[box].move(Direction.down, this);
                 }
             }
         }
        
         else if (i.isKeyDown(Input.KEY_LEFT))
         {   player.move(Direction.left, lgutter, pxToMove);
                
             for (int box = 0; box < boxes.length; box++)
             {   if (moveable[box])
                 {   boxes[box].move(Direction.left, this);

                 }
             }
         }
        
         else if (i.isKeyDown(Input.KEY_RIGHT))
         {  player.move(Direction.right, rgutter, pxToMove);
       
             for (int box = 0; box < boxes.length; box++)
             {   if (moveable[box]) 
                 {   boxes[box].move(Direction.right, this);

                 }
             }
         }
    }
}
