/** Our Locations.
 * Generally each location should have a String with address to its map and a description object
 * @version 2
 *  * @author Viktor and Nour
 */
package PushingBoxes;

import java.util.List;

/**
 *
 * @author Atari
 */
public interface Location
{   
    
    /** Return the location of the game map.
     * @return 
     * @version 2
     */
    String getLocation();
    
    /** Returns the location ID.
     * We need this in order to change the levels
     * @return 
     * @version 1
     */
    int getID();
    
    /** Returns the number of boxes for each location
     * "version 1
     * @return 
     */
    int getBoxes();
    
    /** Returns the game objects on each location. 
     * Not implemented yet
     * @return 
     */
    List<GameObject> getobjects();
    
}
