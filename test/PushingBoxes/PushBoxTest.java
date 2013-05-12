package PushingBoxes;

import PushingBoxes.Localizable.Direction;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.SlickException;

/** @author Viktor and Nour
 */
public class PushBoxTest {
    
    public PushBoxTest() {
    }
    
    /** Test of move method, of class PushBox.
     */
    @Test
    public void testMove() throws SlickException {
        System.out.println("move");
        Direction direction = Direction.down;
        
        Model model = new Model();
        model.size = 32;
        int tgutter = 80;
        int bgutter = 13*model.size;
        int lgutter = 2*model.size;
        int rgutter = 13*model.size;             
        int pxToMove = 4;
        model.start(lgutter, rgutter, bgutter, tgutter, pxToMove);
        
        //check movement downards
        PushBox instance = new PushBox(model.player.x,model.player.y + model.size);
        int expected = (int) (instance.ypos +pxToMove);
        instance.move(direction,model);
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals( expected,(int)instance.ypos);
        
        //Check movement upwards. 
        instance.xpos = model.player.x + model.size/2;
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.ypos -pxToMove);
        System.out.println(instance.xpos + " " + instance.ypos);
        
        instance.move(Direction.up,model);
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals( expected,(int)instance.ypos);
        
        //Check movement left
        instance.xpos = model.player.x;
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.xpos - pxToMove);
        
        instance.move(Direction.left,model);
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals(expected,(int)instance.xpos);
        
        //check movement right
        instance.xpos = model.player.x + model.size;
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.xpos + pxToMove);
        
        instance.move(Direction.right,model);
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals(expected,(int)instance.xpos);
    }
}
