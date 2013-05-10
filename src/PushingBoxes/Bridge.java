/** This one of our levels
 * @version 2 
 * @see Location
 */
package PushingBoxes;


import java.util.List;

public class Bridge implements Location 
{   public static String bridge ="Graphix/bridge.tmx"; //this is the address of the map
    public static int numberOfBoxes = 5;
    public static int id = 4;    
    
    

    @Override
    public String getLocation() {
        return bridge;
    }

    @Override
    public int getID() 
    {   return id;
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
