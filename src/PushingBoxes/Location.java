package PushingBoxes;

import java.util.List;

/** The interface that describes the different levels.
 * Each location contains the address to its map, an integer with the 
 * numbers of boxes for the level and in the future - a List of other game objects
 * 
 * @version 3
 * @author Viktor and Nour
 */
public interface Location
{    /** Return the location of the game map.
     * @return location
     * @version 2
     */
    String getLocation();
    
    /** Returns the number of boxes for each location
     * @return numberOfBoxes - an int corresponding to the number of boxes for the level.
     * @version 1
     */
    int getBoxes();
    
    /** Returns the game objects on each location. 
     * Not implemented yet
     * @return List
     */
    List<GameObject> getobjects();
    
}
