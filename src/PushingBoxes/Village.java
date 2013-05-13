package PushingBoxes;

import java.util.List;

/** The village level.
 * @see Location
 * @author Viktor and Nour
 * @version 3
 */
public class Village implements Location 
{   static String village = "Graphix/village.tmx";   //The address to the map.
    static int numberOfBoxes = 2;                    //The number of boxes for the level.
        
    @Override
    public String getLocation()
    {   return village;
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
