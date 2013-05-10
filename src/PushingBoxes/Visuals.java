/** This class deals with graphics.
 * Visuals deals with displaying the levels, the boxes and the animation of the character.
 * @version 3
 * @author Viktor and Nour
 * @see Controller
 */
package PushingBoxes;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.tiled.TiledMap;

public class Visuals {
       
    public Image box, trapdoor;
    static SpriteSheet animation;
    public Animation character,up,down,left,right; //Correspond to the direction of the character
    static TiledMap map;
    
    
    /**Draws the character and the game objects.
     * @param model - the model containing booleans and relevant stuff
     * 
     * @param player - the player. Used to check if the player should be displayed above 
     *            or below the box. It is not working properly at this stage.
     * @version 4
     * */
    void draw(Model model, Player player)
    {   map.render(0,0);
        trapdoor.draw(232, 232);
        for (int numberBoxes = 0; numberBoxes < model.boxes.length; numberBoxes++) 
        {   if ( player.y  < model.boxes[numberBoxes].ypos )
            {   character.draw(player.x,player.y);
                if ( model.drawable[numberBoxes])
                {   box.draw(model.boxes[numberBoxes].xpos,model.boxes[numberBoxes].ypos);
                }
            }
            else 
            {   if (model.drawable[numberBoxes]) 
                {   box.draw(model.boxes[numberBoxes].xpos,model.boxes[numberBoxes].ypos);
                }
                character.draw((float)player.x,(float)player.y);
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
            character.update(2);
        }
        
        else if (i.isKeyDown(Input.KEY_LEFT))
        {   character = left;
            character.update(2);
        }
            
        else if (i.isKeyDown(Input.KEY_RIGHT))
        {   character = right;
            character.update(2);
        }
        
    }
    
    /** Initializes the animations and images.
     * @param map - the level map.
     * @throws SlickException 
     * @version 4
     */
    public void start(TiledMap map) throws SlickException
    {     animation = new SpriteSheet("Graphix/character.png", 48, 64, 0);
          up = new Animation(animation, 0,3, 3,3, true,20, false);
          down = new Animation(animation, 0,0, 3,0, true,20, false);
          left = new Animation(animation, 0,1, 3,1, true,20, false);
          right = new Animation(animation,0,2, 3,2, true,20, false);
          character = up;
          box = new Image("Graphix/box.jpg");
          this.map = map; 
          trapdoor = new Image("Graphix/trapdoor.png");
    }
}
