/** Localizable refers to all the moving objects of the game without the player.
 * It's pretty useless at this moment. We are open for suggestions
 * It is further extendend in the GameObject class
 * @see GameObject
 * @see PushBox
 * 
 * @version x.1
*/
package PushingBoxes;

/**
 *
 * @author Atari
 */
public interface Localizable 
{
    /**The directions in which a player can move.
     */
    public enum Direction {right,up,left, down};
    
    /** Deals with the movement of objects. 
     * IN the current version the only moveable objects are the boxes.
     * @params direction - the direction of movement
     * @params p - Objects check their position in relation to the player
     * @param direction 
     * @param p 
     * @param pxToMove - how much the object should move
     * @param gutter - the edges of the playing field
     * @param size - the size of tiles
     * @version x.4 
     * @see Player
     */
    public void move(Direction direction, Player p, int pxToMove,int gutter, int size);
}
