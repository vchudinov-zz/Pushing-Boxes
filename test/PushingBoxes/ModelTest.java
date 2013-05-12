/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.newdawn.slick.Input;

/** @author Viktor and Nour
 */
public class ModelTest
{   public ModelTest() {
    }
    
   /** Test of setBoxes method, of class Model.
    * Tests if the method successfully creates an array of boxes.
    */
    @Test
    public void testSetBoxes() throws Exception {
        System.out.println("setBoxes");
        int counter = 2;
        Model instance = new Model();
        instance.setBoxes(counter);
        assertEquals(instance.boxes.length, counter);
        for (int i = 0; i < counter; i++) 
            {   assertNotNull(instance.boxes[i]);
            }
        
        assertEquals(instance.moveable.length, counter);
        for (int i = 0; i < counter; i++)
            {   assertNotNull(instance.moveable[i]);
            }
        
        assertEquals(instance.drawable.length, counter);
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
        int lgutter = 5*instance.size;
        int rgutter = 10*instance.size;
        int bgutter = 10*instance.size;
        int tgutter = 5*instance.size;
        int pxToMove = 3;
        instance.start(5*instance.size, 10*instance.size, 10*instance.size, 5*instance.size, 3);
        assertEquals(instance.tgutter, tgutter);
        assertEquals(instance.bgutter, bgutter);
        assertEquals(instance.lgutter, lgutter);
        assertEquals(instance.rgutter, rgutter);
        assertEquals(instance.pxToMove, pxToMove);
        
        assertNotNull(instance.player);
        assertNotNull(instance.door);
    }

    /**Test of move method, of class Model.
     * Ignoring this test because it requires active input, which we cannot simulte.
     * We test this by actually running the game and seeing if it works.
     * The move method of the Player is tested in the Player test
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
