package PushingBoxes;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;
import static org.junit.Assert.*;

/** @author Viktor and Nour
 */
public class LevelsTest 
{   public LevelsTest() {
    }
    
    /** Test of AddLocations method, of class Levels.
     */
    @Test
    public void testAddLocations() {
        System.out.println("AddLocations");
        Levels instance = new Levels();
        List expResult = instance.AddLocations(); 
        expResult.add(new Village());
        expResult.add(new Forest());
        expResult.add(new Bridge());
        expResult.add(new Castle());
        List result = instance.AddLocations();
        assertEquals(expResult, result);
        
    }
}
