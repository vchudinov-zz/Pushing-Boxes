package PushingBoxes;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.tiled.TiledMap;

/** This class deals with graphics.
 * Visuals deals with displaying the levels, the boxes and the animation of the character.
 * @version 3
 * @author Viktor and Nour
 * @see Controller
 */
public class Visuals {
    
    /**
     *
     */
    public Image box,
    /**
     *
     */
    trapdoor,
    /**
     *
     */
    menu,
    /**
     *
     */
    gameOver;
    static SpriteSheet animation;
    /**
     *
     */
    public Animation character,
    /**
     *
     */
    up,
    /**
     *
     */
    down,
    /**
     *
     */
    left,right; //Correspond to the direction of the character
    static TiledMap map;
    
    
    /**Draws the menu, character and the game objects.
     * @param model - the model containing booleans and relevant stuff
     * 
     * @param gc - Graphics needed for drawing the energy and the Lives of the payer
     * @throws SlickException 
     * @version 5
     * */
    public void graphics(Model model, Graphics gc) throws SlickException
    {   boolean started = true;
        if (started == model.game)
        {   menu = gameOver;            
        }
        if (!model.game) 
        {   menu.draw();
        }
        
        else
        {   map.render(0,0);
            gc.drawString("Energy " + model.player.energy/10, 14*model.size, model.size/2);
            gc.drawString( "Lives " + model.player.lives, 14*model.size, model.size);
            trapdoor.draw(Controller.fieldSize/2, Controller.fieldSize/2);
            for (int numberBoxes = 0; numberBoxes < model.boxes.length; numberBoxes++) 
            {   if ( model.player.y  < model.boxes[numberBoxes].ypos )
                {   character.draw(model.player.x,model.player.y);
                    if ( model.drawable[numberBoxes])
                    {   box.draw(model.boxes[numberBoxes].xpos,model.boxes[numberBoxes].ypos);
                    }
                }
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
            character.update(3);
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
     * @version 4
     */
    public void start(TiledMap map) throws SlickException
    {     menu = new Image("Graphix/menu.jpg");
          gameOver = new Image("Graphix/gameOver.jpg");
          animation = new SpriteSheet("Graphix/character.png", 48, 64, 0);
          up = new Animation(animation, 0,3, 3,3, true,20, false);
          down = new Animation(animation, 0,0, 3,0, true,20, false);
          left = new Animation(animation, 0,1, 3,1, true,20, false);
          right = new Animation(animation,0,2, 3,2, true,20, false);
          character = up;
          box = new Image("Graphix/box.jpg");
          trapdoor = new Image("Graphix/trapdoor.png");
    }
}
