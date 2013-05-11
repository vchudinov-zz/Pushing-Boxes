
package PushingBoxes;

import PushingBoxes.Localizable.Direction;

/** This is the class that is responsible for characters. 
 * It contains methods on their movement and energy.
 * Re-added the text-based move method to make the Model class lighter
 * @version 4
 * @see Model
 * @see PushBox
 * @author Victor and Nour
 **/
public class Player
{
    /**Initial energy of the player.
    */
    public int energy = 1000;
    /** Number of lives.
     */
    public int lives = 3; 
    
    /**Starting position on the field.     
     */
    public int x = Controller.fieldSize/2; 
    
    /**Starting position on the field.
     */
    public int y =  Controller.fieldSize/2;
    
    /** Checks if the energy of a character is positive. 
     * Increased energy to 1000. So that it doesn't fall so quickly
     * If it is not - the player loses a live. If lives drop to zero: Game over
     * @param game 
     * @version 0.2.
     */
    public void energyLevel(boolean game)
    {   energy = energy - 5;
    
        if (energy <=0)
        {   // add some time counter 
            x = Controller.fieldSize/2;
            y = Controller.fieldSize/2;    
            energy = 1000;
            lives-=1;
        }
        
        if(lives == 0)
        {   System.out.println("Game over");
            game = false;
        }
    }
    
    /** Method for moving the character.
     * Checks the characters position in relation to the boundaries of the field, and if the player is 
     * inside he can move
     * @version 4
     * @param direction - the direction in which to move.
     * @param gutter - the respective edge of the field
     * @param pxToMove  -the size of the 'step'
     * @see model
     * */
    public void move(Direction direction, int gutter, int pxToMove)
    {   switch(direction)
        {   case up:
            {   if (y > gutter)
                {   y = y - pxToMove;
                }
                break;
            }
            
            case down:
            {   if (y < gutter)
                { y = y + pxToMove;}
                break;
            }
              
            case left:
            {   if (x > gutter)
                {   x = x - pxToMove;
                }
                break;
            }
                
            case right:
            {   if (x < gutter)
                {   x =x + pxToMove;
                }
                break;
          }
        }
    }

 }

