
package PushingBoxes;

import java.util.List;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/** Controls the game communicates with the Model and the Visuals class. 
 * This class uses the interface BasicGame provided by the Slick2d Library.
 * This is an upgraded version of the former BigGameProject class.
 * 
 * @version 3
 * @author Viktor and Nour
 */
public class Controller extends BasicGame
{
    /**
     *
     */
    public static final String name = "Push boxes"; //The name of the game.
    
    static List <Location> levels; //The list of levels locations
    static int size = 32, // size of the tiles
               fieldSize = 18*size;//size of the field
    
    Trapdoor door;
    Menu menu = new Menu();
    Model model = new Model(); //The model of our game
    Visuals view = new Visuals();   //the visual stuff
    AddLocations locs = new AddLocations(); //our level creator class
    

    /**Class constructor.
     * Displays the name of the game on top of the window.
     */
    public Controller()
    {  super(name);
    }
    
    /**Starts the game in a new frame with the specified size.
     * @version 1
     * @throws SlickException 
     * @see - VisualInitializer
     */
    public void game() throws SlickException
    {   VisualInitializer.newFrame(fieldSize, fieldSize);
    }
    
    /**See the slick2d documentation for more info. 
     * This method initializes the game in the game container
     * 
     * @param gc 
     * @see VisualInitializer
     * @throws SlickException 
     * @version 4
     */
    @Override
    public void init(GameContainer gc) throws SlickException
    {   levels = locs.AddLocations();
        locs.map();
        door = new Trapdoor(Controller.fieldSize/2, Controller.fieldSize/2);
        model.setBoxes(2);
        model.start(80, 14*size, 13*size, 2*size, 4);
        view.start(view.map);
        
    }

    /** Updates the game logic. 
     * See Slick2d documentation for more info. Note the view.moveAnim(input) - 
     * this is for showing the animation of the player. 
     * It is not in the render method because it needs input as an argument 
     * and there is no need for two listeners for input.
     * The update class also checks if the game is in menu mode or not.
     * @param gc 
     * @param i 
     * @throws SlickException 
     * @version 5
     */
    @Override
    public void update(GameContainer gc, int i) throws SlickException
    {   Input input = gc.getInput();
        model.game = menu.checkmMenu(input, model.game);
        
        if (model.game)
        {   model.move(input, model.boxes);
            door.check(model);
            view.moveAnim(input);
            locs.levels(model);
        }
    }
    
    /** Deals with rendering the game graphics.
     * See the relevant Slick2d Documentation
     * Also displays the player energy and lives
     * @param gc 
     * @param grphcs 
     * @throws SlickException 
     * @version 3
     */
    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException
    {   view.graphics(model,grphcs);
    }
}
    

