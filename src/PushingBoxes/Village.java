/*Location 1
 */
package PushingBoxes;

import java.util.List;

/**
 *
 * @author Atari
 */
public class Village implements Location 
{
    /**
     *
     */
    public static String village = "Graphix/village.tmx";
    /**
     *
     */
    public static int numberOfBoxes = 2;
        
    @Override
    public String getLocation()
    {   return village;
    }

    @Override
    public int getBoxes()
    {   return numberOfBoxes;
    }

    @Override
    public List<GameObject> getobjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
       
}
