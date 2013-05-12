
package PushingBoxes;

import java.util.List;

/** The forest level
 *  @see Location
 *  @author VIktor and Nour
 *  @version 2
 */
public class Forest implements Location 
{   static String forest = "Graphix/forest.tmx"; // The address to the map. 
    static int numberOfBoxes = 4;   // The number of boxes for this level.
    
    @Override
    public String getLocation()
    {   return forest;
    }

    @Override
    public int getBoxes()
    {   return numberOfBoxes;
    }

    @Override
    public List<GameObject> getobjects()
    {   throw new UnsupportedOperationException("Not supported yet.");
    }
}
