package PushingBoxes;

import java.util.List;

/** This the castle level.
 * The description of the methods is in Location.
 * @see Location
 * @version 2
 * @author Viktor and Nour
 */
public class Castle implements Location 
{   static String castle ="Graphix/castle.tmx"; //The address of the map.
    /**The number of boxes for this level. */
    static int numberOfBoxes = 6;
        
    @Override
    public String getLocation()
    {   return castle;
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
