/** Controls the game communicates with the Model and the Visuals class. 
 * This class uses the interface BasicGame provided by the Slick2d Library.
 * This is an upgraded version of the former BigGameProject class.
 * 
 * @version 3
 * @author Viktor and Nour
 */
package PushingBoxes;

import java.util.List;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Controller extends BasicGame
{   Trapdoor door;
    static List <Location> levels; //The list of levels locations
    static int size = 32, // size of the tiles
               fieldSize = 576;//size of the field
    
    Model model = new Model(); //The model of our game
    Visuals view = new Visuals();   //the visual stuff
    AddLocations locs = new AddLocations(); //our level creator class
    public static final String name = "Push boxes"; //The name of the game.

    /**Class constructor.
     * Displays the name of the game on top of the window.
     */
    public Controller()
    {  super(name);
    }
    
    /**Starts the game in a new frame with the specified size.
     * @version 1
     * @see - VisualInitializer
     */
    public void game() throws SlickException
    {   VisualInitializer.newFrame(fieldSize, fieldSize);
    }
    
    /**See the slick2d documentation for more info. 
     * This method initializes the game in the game container
     * 
     * @see VisualInitializer
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
     * and there is no need for two listeners for input
     * @version 4
     */
    @Override
    public void update(GameContainer gc, int i) throws SlickException
    {   Input input = gc.getInput();
        model.move(input, model.boxes);
        door.check(model);
        view.moveAnim(input);
        locs.levels(model);
    }
    
    /** Deals with rendering the game graphics.
     * See the relevant Slick2d Documentation
     * Also displays the player energy and lives
     * @version 2
     */
    @Override
    public void render(GameContainer gc, Graphics grphcs) throws SlickException
    {   view.draw(model, model.player);
        grphcs.drawString("Energy " + model.player.energy/10, 14*size, size/2);
        grphcs.drawString( "Lives " + model.player.lives, 14*size, size);
    }
}
