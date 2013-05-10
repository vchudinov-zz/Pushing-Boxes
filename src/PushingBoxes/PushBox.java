/** The boxes class.
 * This class describes the behaviour of the boxes the player pushes around.
 * Each box is placed trough the BoxFactory class
 * @version 0.3
 * @see Player
 * @see Model
 * @see BoxFactory
 * @author Viktor and Nour
 */
package PushingBoxes;

import org.newdawn.slick.SlickException;

public class PushBox implements Localizable 
{    public float xpos,ypos; 
     
     /** Class Constructor. 
      * Places the box in coordinates x and y
      * @param x - the x coordinate of the box
      * @param y - the y coordinate of the x
      * @throws SlickException 
      * @version 0.2*/
     public PushBox(float x, float y) throws SlickException
     {  xpos = x;
        ypos = y;
     }
    
    @Override
    public void move(Direction direction, Player p, int pxToMove,int gutter, int size)
    {   switch(direction)
        {   case up:
            {   if ( ypos - size/2 == p.y && xpos >= p.x && xpos - size <= p.x)
                {   ypos -= pxToMove;
                if (ypos < gutter)
                    {   ypos = 4*size;
                    }
                    p.energyLevel();
                }
            }
                        
            case down:
            {   if (ypos == p.y + size && xpos >= p.x  && xpos - size <= p.x)
                {   ypos += pxToMove;
                    if ( ypos > gutter)
                    {   ypos = 13*size;
                    }
                    p.energyLevel();
                }
            }
            
            case right:
            {   if (xpos - size == p.x && ypos - size <= p.y  && ypos - size/2 >= p.y)
                {   xpos += pxToMove;
                    if ( xpos > gutter)
                    {    xpos = 13*size;
                    }
                    p.energyLevel();
                }
            }
            
            case left:
            {   if (xpos == p.x && ypos - size <= p.y  && ypos - size/2 >= p.y)
                {   xpos -= pxToMove;
                    if (xpos < gutter)
                    {   xpos = 4*size;
                    }
                    p.energyLevel();
                }
            }
        }
    }
}
    

