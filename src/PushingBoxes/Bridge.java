package PushingBoxes;

import java.util.List;

/** This is the Bridge Level.
 * The description of the methods is in Location.
 * @see Location
 * @version 2 
 * @author Viktor and Nour
 */
public class Bridge implements Location 
{   static String bridge ="Graphix/bridge.tmx"; //The address of the map.
    static int numberOfBoxes = 5;               //The specific number of boxes for this level.
    
    @Override
    public String getLocation()
    {   return bridge;
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
