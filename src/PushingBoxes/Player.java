package PushingBoxes;

/** This is the class that is responsible for characters. 
 *  It contains methods on their movement and energy.
 *  
 * @see Model
 * @see PushBox
 * 
 * @version 4
 * @author Victor and Nour
 **/

public class Player implements Localizable
{   int energy = 1000;                  //Initial energy of the player.
    int lives = 3;                      //the number of lives.
    int x = Controller.fieldSize/2;     //The starting position of the player on the x coordinate.
    int y =  Controller.fieldSize/2;    //The starting position of the player on the y coordinate.
    
    /** Changes energy and checks if the energy of a character is positive. 
     * If it is not - the player loses a live. If lives drop to zero: Game over.
     * @param game - the boolean value from Model
     * 
     * @see model
     * @version 3.
     */
    protected void energyLevel(boolean game)
    {   energy = energy - 5;        
    
        if (energy <=0)     /*The player loses a life and 
                             * is put back in the middle of the field with new energy and one less lives. */
        {   x = Controller.fieldSize/2;
            y = Controller.fieldSize/2;    
            energy = 1000;
            lives-=1;
        }
        
        if(lives == 0)      //If there are no more lives the game is over. 
        {   game = false;
        }
    }
    
    /** Method for moving the character.
     * Checks the characters position in relation to the boundaries of the field, and if the player is 
     * inside he can move
     * 
     * @param direction - the direction in which to move.
     * @param model - contains all the necessary things for movement like board gutters
     * @see model
     * 
     * @version 4
     * */
    protected void move(Direction direction, Model model)
    {   switch(direction)
        {   case up:
            {   if (y > model.tutter)
                {   y = y - model.pxToMove;
                }
                break;
            }
            
            case down:
            {   if (y < model.bgutter)
                { y = y + model.pxToMove;}
                break;
            }
              
            case left:
            {   if (x > model.lgutter)
                {   x = x - model.pxToMove;
                }
                break;
            }
                
            case right:
            {   if (x < model.rgutter)
                {   x = x + model.pxToMove;
                }
                break;
          }
        }
    }

 }

