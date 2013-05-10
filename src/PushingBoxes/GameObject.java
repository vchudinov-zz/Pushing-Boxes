/** Game object.
 * Includes all the objects that are not boxes or Players.
 * So far we haven't got any implemented but if there is time we will 
 * implement objects that increase or decrease character health
 * @see Localizable
 * @version x.1
 */
package PushingBoxes;

/**
 * @author Viktor and Nour
 */
public interface GameObject extends Localizable  
{   /** Describes whether the object can be taken. 
    * We plan on some objects like that.*/
    boolean canBeTaken();
        
    /** Whether it can be moved. So far we do not need it. Could be implemented in the future
    */
    boolean canBeMoved();
       
    /** If it has any effect on the player. */
    int energyeffect();
}
