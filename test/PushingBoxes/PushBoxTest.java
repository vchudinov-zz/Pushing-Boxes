package PushingBoxes;

import PushingBoxes.Localizable.Direction;
import static org.junit.Assert.*;
import org.junit.Test;
import org.newdawn.slick.SlickException;

/** @author Viktor and Nour
 */
public class PushBoxTest 
{   public PushBoxTest() {}
    
    /** Test of move method, of class PushBox.
     */
    @Test
    public void testMove() throws SlickException {
        System.out.println("move");
        
        Model model = new Model();          //Starting sample gutters and step to move
        model.size = 32;
        int tgutter = 80;
        int bgutter = 13*model.size;
        int lgutter = 2*model.size;
        int rgutter = 13*model.size;             
        int pxToMove = 4;
        model.start(lgutter, rgutter, bgutter, tgutter, pxToMove);  //starting the model
        
        //check movement downards
        PushBox instance = new PushBox(model.player.x,model.player.y + model.size); //Setting the box in relation to the player
        int expected = (int) (instance.ypos +pxToMove);
        
        instance.move(Direction.down,model);                    //Checking if it is pushed.
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals( expected,(int)instance.ypos);
        
        //Check movement upwards. 
        instance.xpos = model.player.x + model.size/2;  //Setting the box in relation to the player
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.ypos -pxToMove);
        System.out.println(instance.xpos + " " + instance.ypos);
        
        instance.move(Direction.up,model);              //Checking if it is pushed.
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals( expected,(int)instance.ypos);
        
        //Check movement left
        instance.xpos = model.player.x;                 //Setting the box in relation to the player
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.xpos - pxToMove);
        
        instance.move(Direction.left,model);            //Checking if it is pushed.
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals(expected,(int)instance.xpos);
        
        //check movement right
        instance.xpos = model.player.x + model.size;    //Setting the box in relation to the player
        instance.ypos = model.player.y + model.size/2;
        expected = (int) (instance.xpos + pxToMove);
        
        instance.move(Direction.right,model);           //Checking if it is pushed.
        System.out.println(instance.xpos + " " + instance.ypos);
        assertEquals(expected,(int)instance.xpos);
    }
}
