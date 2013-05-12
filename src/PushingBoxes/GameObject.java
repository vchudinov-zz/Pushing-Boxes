package PushingBoxes;

/** Game object includes all the objects that are not boxes or Players.
 * So far we haven't got any implemented. 
 * Game objects are items that have some effect on the player - like hurting him,
 * or increasing his lives and energy.
 * Note that this does not include PushBoxes. we decided to separate them at this stage.
 * 
 * @see Localizable
 * @version 2
 * 
 * @author Viktor and Nour
 */
public interface GameObject extends Localizable  
{   /** Describes whether the object can be taken. 
    * @return boolean - true if it can be taken, false if not 
    */
    boolean canBeTaken();
        
    /** Describes whether the object can be moved. 
     * @return boolean - true if it can be moved.
     */
    boolean canBeMoved();
       
    /** Describes whether the object has any effect on player energy.
     * @return in - the energy effect
     */
    int energyeffect();
}
