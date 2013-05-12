package PushingBoxes;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.tiled.TiledMap;

/** This class deals with displaying the levels, the boxes and the animation of the character.
 * @see Controller
 * @see Model
 *  
 * @version 3
 * @author Viktor and Nour
 */
public class Visuals 
{   static Image box,                      //The image of the PushBoxes
           trapdoor,                 //The image of the door
           menu,                     //The main menu
           gameOver;                 //The Game Over menu
    static SpriteSheet animation;   //The spreadsheet with the sprites for animating the character 
    Animation character,            //The animations of the character and the directions he moves
              up,down,left,right; 
    static TiledMap map;
    
    
    /**Draws the menu, character and the game objects.
     * Initially it displays the Main menu. 
     * Once a game has been started it will display the Game over Menu
     * @param model - the model containing booleans and relevant variables
     * @param gc - Graphics needed for drawing the energy and the Lives of the payer
     * 
     * @throws SlickException 
     * @version 5
     */
    void graphics(Model model, Graphics gc) throws SlickException
    {   boolean started = true;     //Checks if a game has been started. 
        if (started == model.game)  //If yes - changes the image from menu to Game Over screen.
        {   menu = gameOver;            
        }
        
        if (!model.game)            //If the game has not been started, 
        {   menu.draw();            //or has been finished it displays the menu. 
        }
        
        /*Finally when a game is started it renders everything. 
         *The entire wall of text could be 
         *moved to another method or class, but we have no time for it. */
        else                        
        {   map.render(0,0);    //renders the map.
            
            gc.drawString("Energy " + model.player.energy/10, 14*model.size, model.size/2);//draws Energy
            gc.drawString( "Lives " + model.player.lives, 14*model.size, model.size);      //Draws Lives
            
            trapdoor.draw(Controller.fieldSize/2, Controller.fieldSize/2); //Draws the trapdoor
            
            /*This loop iterates trough the boxes and compares theyr y position with the characters.
             * In theory this should serve to draw the character in front 
             * of the box when he is in front of it.
             * and behind when he should be behind it. Now it works selectively.
             */
            for (int numberBoxes = 0; numberBoxes < model.boxes.length; numberBoxes++) 
            {   if ( model.player.y - model.size  < model.boxes[numberBoxes].ypos )//check the y cordinate.
                {   /*If the players y is smaller than the respective box - draw the character first
                     * and then the box
                     */   
                    character.draw(model.player.x,model.player.y); 
                    if ( model.drawable[numberBoxes])
                    {   box.draw(model.boxes[numberBoxes].xpos,model.boxes[numberBoxes].ypos);
                    }
                }
                    /*Else draw the box first. */
                else 
                {   if (model.drawable[numberBoxes]) 
                    {   box.draw(model.boxes[numberBoxes].xpos,model.boxes[numberBoxes].ypos);
                    }
                    character.draw((float)model.player.x,(float)model.player.y);
                }
            }
        }
    }
    
    /** This method deals with the animation of movement of the character, depending on the input.
     * @param i - input from the keyboard
     * @version 3
     * */
   void moveAnim(Input i) 
    {   if (i.isKeyDown(Input.KEY_UP)) 
        {   character = up;
            character.update(3);        //the speed of animation
        }
        
        else if (i.isKeyDown(Input.KEY_DOWN))   
        {   character = down;
            character.update(3);
        }
        
        else if (i.isKeyDown(Input.KEY_LEFT))   
        {   character = left;
            character.update(3);
        }
            
        else if (i.isKeyDown(Input.KEY_RIGHT))
        {   character = right;
            character.update(3);
        }
    }
    
    /** Initializes the animations and images.
     * @param map - the level map.
     * @throws SlickException 
     * @see Animation
     
     * 
     * @version 4
     */
    void start() throws SlickException
    {     menu = new Image("Graphix/menu.jpg");                //Initialize the menu.
          gameOver = new Image("Graphix/gameOver.jpg");        //And the Game Over Screen.
          box = new Image("Graphix/box.jpg");                  //The image of the box.
          trapdoor = new Image("Graphix/trapdoor.png");        //And the door.
          
          /*Initialize the animation, specifiying the size of each
           * sprite inside the spritesheet.
           * Check the relevant Slick2d documentation */         
          animation = new SpriteSheet("Graphix/character.png", 48, 64, 0);  
          
          /*The section of the sprite sheet that corresponds to each animation.
           * For example down takes the images from the top row of the spritesheet
           */
          up = new Animation(animation, 0,3, 3,3, true,20, false);
          down = new Animation(animation, 0,0, 3,0, true,20, false);
          left = new Animation(animation, 0,1, 3,1, true,20, false);
          right = new Animation(animation,0,2, 3,2, true,20, false);
          character = up;
    }
}
