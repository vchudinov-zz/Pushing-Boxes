/** This one of the levels
 * @version x.0
 * Still needs the address to the map
 */
package PushingBoxes;

import java.util.List;

public class Castle implements Location 
{   static String castle ="Graphix/castle.tmx";
    public static int numberOfBoxes = 6;
    public static int id = 3;  
    @Override
    public String getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getID() {
       return id;
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
