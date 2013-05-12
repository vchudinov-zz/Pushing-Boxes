package PushingBoxes;

import java.util.List;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/** Controls the game and communicates with the Model and the Visuals class. 
 * This class uses the interface BasicGame provided by the Slick2d Library 
 * in order to update game logic and display game graphics.
 * 
 * @see Model
 * @see Visuals
 * @see VisualInitializer
 * 
 * @version 3
 * @author Viktor and Nour
 */
public class Controller extends BasicGame
{   static final String name = "Push boxes"; //The name of the game that shows on the header.
    
    
    static List <Location> levels; //The list of levels locations
    
    /*The game map and game logic is based around tiles with size 32x32 px.*/
    static int size = 32, // size of the tiles
               fieldSize = 18*size;//size of the field
    
    //Here we initialize classes needed for the controler to run the game.
    Trapdoor door;
    Menu menu = new Menu();
    Model model = new Model(); //The model of our game
    Visuals view = new Visuals();   //the visual stuff
    Levels locs = new Levels(); //our level creator class
    

    /**Class constructor.
     * Displays the name of the game on top of the window.
     */
    Controller()
    {  super(name);
    }
    
    /**Starts the game in a new frame with the specified size.
     * @throws SlickException 
     * @see - VisualInitializer
     * 
     * @version 1
     */
    protected void game() throws SlickException
    {   VisualInitializer.newFrame(fieldSize, fieldSize);
    }
    
    /**See the slick2d documentation for more info. 
     * This method initializes the game in the game container
     * 
     * @param gc 
     * @see Levels
     * @see Trapdoor
     * @see Model
     * @see Visuals
     * @throws SlickException 
     * 
     * @version 4
     */
    @Override
    public void init(GameContainer gc) throws SlickException
    {   levels = locs.AddLocations();                           //Populate the list of levels
        locs.map();                                             //Set the map
        door = new Trapdoor(Controller.fieldSize/2, Controller.fieldSize/2);    //Set the psition of the door
        model.setBoxes(levels.get(locs.currState).getBoxes());  //Initialize boxes
        model.start(80, 14*size, 13*size, 2*size, 4);           //Start the game logic
        view.start();                                           //Start the graphics
        
    }

    /** Updates the game logic. 
     * See Slick2d documentation for more info. Note the view.moveAnim(input) - 
     * this is for showing the animation of the player. 
     * It is not in the render method because it takes input as an argument 
     * and there is no need for two listeners for input.
     * The update class also checks if the game is in menu mode or not. 
     * This is done by checking a boolean variable game located in the model class. 
     * If it is false - you're in the menu state
     * 
     * @param gc - the Game container
     * @param i - the time it takes between updates in milliseconds.
     * @throws SlickException 
     * @see Model
     * @see Visuals
     * 
     * @version 5
     */
    @Override
    public void update(GameContainer gc, int i) throws SlickException
    {   Input input = gc.getInput();    
        model.game = menu.checkmMenu(input, model.game);    //checking if we're in menu mode    
        
        if (model.game)                                     //If we're inside the game game logic can be applied
        {   model.move(input, model.boxes);
            door.check(model);
            view.moveAnim(input);
            locs.levels(model);
        }
    }
    
    /** Deals with rendering the game graphics.
     * This includes boxes, lives and energy. 
     * Player animation is in the update method.
     * See the relevant Slick2d Documentation
     * 
     * @see Visuals
     * @see Model
     * @param gc -game container
     * @param grphcs -graphics
     * @throws SlickException 
     * 
     * @version 3
     */
    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException
    {   view.graphics(model,grphcs);
    }
}
    

