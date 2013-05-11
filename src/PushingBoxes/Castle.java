/** This one of the levels
 * @version x.0
 * Still needs the address to the map
 */
package PushingBoxes;

import java.util.List;

/**
 *
 * @author Atari
 */
public class Castle implements Location 
{   static String castle ="Graphix/castle.tmx";
    /**
     *
     */
    public static int numberOfBoxes = 6;
        
    @Override
    public String getLocation() {
        return castle;
    }

    @Override
    public int getBoxes() {
        return numberOfBoxes;
    }

    @Override
    public List<GameObject> getobjects() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
