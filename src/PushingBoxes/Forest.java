/** The forest level
 *  Needs address to the map
 *  @version x.0
 */
package PushingBoxes;

import java.util.List;

public class Forest implements Location 
{   public static String forest = "Graphix/forest.tmx";
    public static int numberOfBoxes = 4;
    public static int id = 1;

    @Override
    public String getLocation()
    {   return forest;
    }

    @Override
    public int getID()
    {   return id;
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
