/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PushingBoxes;

import PushingBoxes.Localizable.Direction;
import org.junit.Test;
import static org.junit.Assert.*;

/**@author VIktor and Nour
 */
public class PlayerTest 
{   public PlayerTest() {}
    
    /** Test of energyLevel method, of class Player.
     * Tests if the player energy changes.
     */
    @Test
    public void testEnergyLevel() 
    {   System.out.println("energyLevel");
        Player instance = new Player();
        int result = instance.energy - 5;
        instance.energyLevel(true);
        assertEquals(instance.energy, result);
    }

    /** Test of move method, of class Player.
     * Tests if the player successfully changes coordinates.
     */
    @Test
    public void testMove()
    {   System.out.println("move");
        Direction direction = Direction.up;
        int gutter = 10;
        int pxToMove = 2;
        Player instance = new Player();
        //move up
        int result_up = instance.y - pxToMove;
        instance.move(direction, gutter, pxToMove);
        assertEquals(instance.y, result_up);
        
        //move right
        int result_right = instance.x + pxToMove;
        instance.move(Direction.right, gutter*100, pxToMove);
        assertEquals(instance.x, result_right);
        
        //move left
        int result_left = instance.x - pxToMove;
        instance.move(Direction.left, gutter, pxToMove);
        assertEquals(instance.x, result_left);
        
        //move down
        int result_down = instance.y + pxToMove;
        instance.move(Direction.down, gutter*100, pxToMove);
        assertEquals(instance.y, result_down);
    }
}
