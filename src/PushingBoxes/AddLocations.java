package PushingBoxes;

import java.util.ArrayList;
import java.util.List;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**This class deals with adding and changing locations.
 * It also keeps track of the current level using the variable currState.
 * @version 3
 * @author Viktor and Nour
 */
public class AddLocations
{   static List<Location> gameLocations = new ArrayList<>(); //List containing all the levels
    int currState;//Tracks the current state of the game
    
    /** Adds the different levels to the List gameLocations.
     * @return 
     * @version 2
     * @see Location
     */
    public List<Location >AddLocations() 
        {   gameLocations.add( new Village());
            gameLocations.add( new Forest());
            gameLocations.add( new Bridge());
            gameLocations.add( new Castle());
            return gameLocations;
        }
        
    /** Changes the levels. 
     * This is done by keeping track of the moveable boxes in play. 
     * When all have been pushed inside the door and have become 
     * immobile the method changes the level
     * 
     * @param model 
     * @throws SlickException 
     * @argument model - takes as an argument an instance of the Model class, 
     * where all the necessary variables are
     *  
     * @version 2
     * @see Model
     */
    public void levels(Model model) throws SlickException
    {   int boxesHome = 0;
        for (int i = 0; i < model.moveable.length; i++)
        {   if (!model.moveable[i]) 
            {   boxesHome++;
            }
        }
            if (boxesHome == model.counter)
            {   currState +=1;
                if (currState < gameLocations.size()) 
                {   model.setBoxes(gameLocations.get(currState).getBoxes());
                    map();  
                }
                else 
                {   currState = 0;
                    model.game = false;
                }
               
            }
        }
       
        /** Changes the background(the map) of the game field.
         * It probably could be made different and better if there is time
         * 
         * @throws SlickException 
         * @version 1
         */
        public void map() throws SlickException
        {   Visuals.map = new TiledMap(gameLocations.get(currState).getLocation());
        }
 }
