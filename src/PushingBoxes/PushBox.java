/** The boxes class.
 * This class describes the behaviour of the boxes the player pushes around.
 * Each box is placed trough the BoxFactory class
 * @version 3
 * @see Player
 * @see Model
 * @see BoxFactory
 * @author Viktor and Nour
 */
package PushingBoxes;

import org.newdawn.slick.SlickException;

/**
 *
 * @author Atari
 */
public class PushBox implements Localizable 
{ 
    /**
     *
     */
    public float xpos, 
    /**
     *
     */
    ypos; 
     
     /** Class Constructor. 
      * Places the box in coordinates x and y
      * @param x - the x coordinate of the box
      * @param y - the y coordinate of the x
      * @throws SlickException 
      * @version 3*/
     public PushBox(float x, float y) throws SlickException
     {  xpos = x;
        ypos = y;
     }
    
    @Override
    public void move(Direction direction, Model model)
    {   switch(direction)
        {   case up:
            {   if ( ypos - model.size/2 == model.player.y && xpos >= model.player.x && xpos - model.size <= model.player.x)
                {   ypos -= model.pxToMove;
                if (ypos < model.tgutter + model.size/2 )
                    {   ypos = 4*model.size;
                    }
                    model.player.energyLevel(model.game);
                }
            }
                        
            case down:
            {   if (ypos == model.player.y + model.size && xpos >= model.player.x  && xpos - model.size <= model.player.x)
                {   ypos += model.pxToMove;
                    if ( ypos > model.bgutter + model.size)
                    {   ypos = 13*model.size;
                    }
                    model.player.energyLevel(model.game);
                }
            }
            
            case right:
            {   if (xpos - model.size == model.player.x && ypos - 1.5*model.size <= model.player.y  && ypos - model.size/2 >= model.player.y)
                {   xpos += model.pxToMove;
                    if ( xpos > model.rgutter)
                    {    xpos = 13*model.size;
                    }
                    model.player.energyLevel(model.game);
                }
            }
            
            case left:
            {   if (xpos == model.player.x && ypos - 1.5*model.size <= model.player.y  && ypos - model.size/2 >= model.player.y)
                {   xpos -= model.pxToMove;
                    if (xpos < model.lgutter)
                    {   xpos = 4*model.size;
                    }
                   model.player.energyLevel(model.game);
                }
            }
        }
    }
}
    

