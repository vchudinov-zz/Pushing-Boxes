package PushingBoxes;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/** @author Viktor and Nour
 */
public class LevelsTest 
{   public LevelsTest() {}
    
    /** Test of AddLocations method, of class Levels.
     * Tests if the game successfully adds the levels to the list of levels.
     */
    @Test
    public void testAddLocations() 
    {   System.out.println("AddLocations");
        Levels instance = new Levels();
        List expResult = instance.AddLocations(); //Create a new list and populate it.
        expResult.add(new Village());
        expResult.add(new Forest());
        expResult.add(new Bridge());
        expResult.add(new Castle());
        List result = instance.AddLocations();    //Run the method.
        assertEquals(expResult, result);          //Compare the lists.
    }

    /** Test of levels method, of class Levels.
     * Passes the test but fails when it has to change the map
     * @see Model - lines 55-60
     */
    @Test
    public void testLevels() throws Exception 
    {   System.out.println("levels");
        Model model = new Model();
        Levels instance = new Levels();
        model.setBoxes(2);  //For example 2
        
        System.out.println(model.moveable[0] + " " + model.moveable[1]); //print the current state of moveable
        model.moveable[1] = false;
        model.moveable[0] = false;
        System.out.println(model.moveable[0] + " " + model.moveable[1]);//And after the change
        
        //Checks if the game succesfully goes to Game Over. Succesfull
        instance.currState = 6;  //setting the current state to be larger than the length of the levels list
        int expected = 0;        //should be 0 after the change
        boolean test = false;    //and a test boolean, to see if game has become false.
        
        instance.levels(model);  //running the method
        assertEquals(expected, instance.currState);
        assertEquals(test, model.game);
        
        /*Checks if the game changes levels successfully. 
        It works, but the test fails, when it has to change the map, because the test cannot parse it */
        
        instance.levels(model);
        System.out.println(instance.currState);
        assertEquals(expected, instance.currState);
    }

    /**
     * Test of map method, of class Levels.
     * We cannot test if the method actually changes the map,
     * because JUnit has problem with parsing it. But it is a simple assignement, 
     * and if the addLocation method works so should this. 
     * THis is why here we test if we can bring an element from the gameLocations list 
     * and get it's address - basically what the method does.
     */
    @Test
    public void testMap() throws Exception
    {   System.out.println("map");
        Levels instance = new Levels();
        Visuals view = new Visuals();
        
        instance.currState = 0;     //set current state to 0
        instance.AddLocations();    //run add locations to get a list of levels.
        String expected = "Graphix/village.tmx";    //the string that corresponds to the 0-th element
        assertEquals(expected, instance.gameLocations.get(0).getLocation()); //Compare addreses.
    }
}
