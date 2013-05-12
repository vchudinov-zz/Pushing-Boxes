package PushingBoxes;

import java.util.ArrayList;
import java.util.List;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**This class creates the list of the available levels and changes levels in-game.
 * The current level corresponds to an element in the gameLocations list. 
 * Which element it is depends on the value of the currState variable
 * 
 * @see Location
 * @version 3
 * @author Viktor and Nour
 */
public class Levels
{   static List<Location> gameLocations = new ArrayList<>(); //List containing all the levels
    int currState;//Tracks the current state of the game
    
    /** Adds the different levels to the List gameLocations.
     * 
     * @see Location
     * @return List gameLocations
     * @version 2
     */
    List<Location >AddLocations() 
        {   gameLocations.add( new Village());
            gameLocations.add( new Forest());
            gameLocations.add( new Bridge());
            gameLocations.add( new Castle());
            return gameLocations;
        }
        
    /** Changes the levels. 
     * This method keeps the track of the moveable boxes in play.  
     * When all have been pushed inside the door and have become 
     * immobile the method changes the level. 
     * If the game is on the last level instead of changing 
     * it the game goes to a Game Over screen
     * 
     * @param model 
     * @throws SlickException 
     * @argument model - takes as an argument an instance of the Model class, 
     * where all the necessary variables are
     * @see Model
     * @version 2
     */
    void levels(Model model) throws SlickException
    {   int boxesHome = 0;  //The number of the immobileboxes
        for (int i = 0; i < model.moveable.length; i++)
        {   if (!model.moveable[i]) 
            {   boxesHome++;
            }
        }
            if (boxesHome == model.numberOfBoxes) //Statement that changes the level
            {   currState +=1;
                if (currState < gameLocations.size()) 
                {   model.setBoxes(gameLocations.get(currState).getBoxes()); //Prepares the number of boxes for the next level
                    map();  //changes the map
                }
                else //Statement that exits in Game Over
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
     void map() throws SlickException
     {   Visuals.map = new TiledMap(gameLocations.get(currState).getLocation());
     }
 }
