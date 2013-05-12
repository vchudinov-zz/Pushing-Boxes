package PushingBoxes;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.newdawn.slick.Input;

/** @author Viktor and Nour
 */
public class ModelTest
{   public ModelTest() { }
    
   /** Test of setBoxes method, of class Model.
    * Tests if the method successfully creates an array of boxes.
    */
    @Test
    public void testSetBoxes() throws Exception {
        System.out.println("setBoxes");
        int counter = 2;                                //A counter of boxes. To get tings running.
        Model instance = new Model();
        instance.setBoxes(counter);                     //Setting the boxes.
        assertEquals(instance.boxes.length, counter);   //Testing if the array is populated.
        for (int i = 0; i < counter; i++)               //Testing to see if it really has objects.
            {   assertNotNull(instance.boxes[i]);
            }
        
        assertEquals(instance.moveable.length, counter);//Checking the same for the moveable array.
        for (int i = 0; i < counter; i++)
            {   assertNotNull(instance.moveable[i]);
            }
        
        assertEquals(instance.drawable.length, counter);//And for the drawable array.
        for (int i = 0; i < counter; i++)
            {   assertNotNull(instance.drawable[i]);
            }
    }

    /** Test of start method, of class Model.
     * Tests if the method successfully initializes the variables on gutter,size and movement. 
     * And if it successfully creates Player and door 
     */
    @Test
    public void testStart() 
    {   System.out.println("start");
        
        Model instance = new Model();
        int lgutter = 5*instance.size; //Sample gutters and sizes.
        int rgutter = 10*instance.size;
        int bgutter = 10*instance.size;
        int tgutter = 5*instance.size;
        int pxToMove = 3;
        instance.start(5*instance.size, 10*instance.size, 10*instance.size, 5*instance.size, 3);
        assertEquals(instance.tgutter, tgutter);    //checking if they are implemented.
        assertEquals(instance.bgutter, bgutter);
        assertEquals(instance.lgutter, lgutter);
        assertEquals(instance.rgutter, rgutter);
        assertEquals(instance.pxToMove, pxToMove);
        
        assertNotNull(instance.player);             //Checking if the player and door are created.
        assertNotNull(instance.door);
    }

    /**Test of move method, of class Model.
     * Ignoring this test because it requires a parameter 
     * from class Input from the SLick2d Library and we cannot simulate it. 
     * We test this by actually running the game and seeing if it works.
     * The move method of the Player is tested in the Player test and works fine.
     * The move method of the boxes is tested in the PushBox test and also works fine.
     * This method only calls them.
     * @see Player
     * @see PushBox
     */
    
    @Test
    @Ignore
    public void testMove()
    {   System.out.println("move");
        Input i = null;
        PushBox[] boxes = null;
        Model instance = new Model();
        instance.move(i, boxes);
    }
}
