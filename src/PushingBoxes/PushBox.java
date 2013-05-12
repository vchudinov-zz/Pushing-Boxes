package PushingBoxes;

import org.newdawn.slick.SlickException;

/** The class that defines the boxes the player is pushing around.
 * Each box is created trough the BoxFactory class.
 * PushBox implements the Localizable interface.
 * 
 * @see Localizable
 * @see Player
 * @see Model
 * @see BoxFactory
 * 
 * @author Viktor and Nour
 * @version 3
 */
public class PushBox implements Localizable 
{   float xpos, //The position of the box on the x coordinate
          ypos; //The position of the box on the y coordinate
     
     /** Class Constructor. 
      * Places the box in coordinates x and y
      * @param x - the x coordinate of the box
      * @param y - the y coordinate of the x
      * @throws SlickException 
      * @version 3
      */
     PushBox(float x, float y) throws SlickException
     {  xpos = x;
        ypos = y;
     }
    
    @Override
    public void move(Direction direction, Model model)
    {   switch(direction)
        {   case up:
            {   //Checks if the player is right below the box so he can move it upwards.
                if ( ypos - model.size/2 == model.player.y && xpos >= model.player.x && 
                                                              xpos - model.size <= model.player.x)
                {   ypos -= model.pxToMove;
                
                    //Checks if the box is over the gutter. If it is it is pushed back a tile.
                    if (ypos < model.tgutter + model.size/2 )
                    {   ypos = 4*model.size;
                    }
                    
                    model.player.energyLevel(model.game);//Reduces the player's energy when he pushes a box
                }
            }
                        
            case down:
            {   //Checks if the player is right above the box so he can move it downwards.
                if (ypos == model.player.y + model.size && xpos >= model.player.x  && xpos - model.size <= model.player.x)
                {   ypos += model.pxToMove;
                    
                    //Checks if the box is over the gutter. If it is it is pushed back a tile.    
                    if ( ypos > model.bgutter + model.size)
                    {   ypos = 13*model.size;
                    }
                    
                    model.player.energyLevel(model.game); //Reduces the player's energy when he pushes a box
                }
            }
            
            case right:
            {   //Checks if the player is on the left of the box so he can move it to the right.
                if (xpos - model.size == model.player.x && ypos - 1.5*model.size <= model.player.y  && ypos - model.size/2 >= model.player.y)
                {   xpos += model.pxToMove;
                    
                    //Checks if the box is over the gutter. If it is it is pushed back a tile.
                    if ( xpos > model.rgutter)
                    {    xpos = 13*model.size;
                    }
                    
                    model.player.energyLevel(model.game);//Reduces the player's energy when he pushes a box
                }
            }
            
            case left:
            {   //Checks if the player is on the right of the box so he can move it to left.
                if (xpos == model.player.x && ypos - 1.5*model.size <= model.player.y  && ypos - model.size/2 >= model.player.y)
                {   xpos -= model.pxToMove;
                    
                    //Checks if the box is over the gutter. If it is it is pushed back a tile.
                    if (xpos < model.lgutter)
                    {   xpos = 4*model.size;
                    }
                   model.player.energyLevel(model.game);//Reduces the player's energy when he pushes a box
                }
            }
        }
    }
}
    

