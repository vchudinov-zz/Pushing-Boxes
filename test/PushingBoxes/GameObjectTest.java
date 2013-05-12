package PushingBoxes;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/** We do not have implemented this class, so this test is meaningless right now.
 * @author Viktor and Nour
 */
public class GameObjectTest {
    
    public GameObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**Test of canBeTaken method, of class GameObject.
     * Unimplemented method.
     */
    @Test
    public void testCanBeTaken() {
        System.out.println("canBeTaken");
        GameObject instance = new GameObjectImpl();
        boolean expResult = false;
        boolean result = instance.canBeTaken();
        assertEquals(expResult, result);
        
    }

    /** Test of canBeMoved method, of class GameObject.
     * Unimplemented method.
     */
    @Test
    public void testCanBeMoved() {
        System.out.println("canBeMoved");
        GameObject instance = new GameObjectImpl();
        boolean expResult = false;
        boolean result = instance.canBeMoved();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of energyeffect method, of class GameObject.
     */
    @Test
    public void testEnergyeffect() {
        System.out.println("energyeffect");
        GameObject instance = new GameObjectImpl();
        int expResult = 0;
        int result = instance.energyeffect();
        assertEquals(expResult, result);
       
    }

    public class GameObjectImpl implements GameObject {

        public boolean canBeTaken() {
            return false;
        }

        public boolean canBeMoved() {
            return false;
        }

        public int energyeffect() {
            return 0;
        }

        @Override
        public void move(Direction direction, Model model) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
