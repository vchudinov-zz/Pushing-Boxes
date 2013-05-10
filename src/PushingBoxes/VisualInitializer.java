/** Initializers the graphics container. 
 * @version 1
 * @author VIktor & Nour
 * @see Controller
 */
package PushingBoxes;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class VisualInitializer 
{   private static AppGameContainer gameFrame;
    
    /** Creates a new frame in which the game can run
     * @param width - the width of the frame
     * @param height - the height of the frame
     * @version 2
     */
    public static void newFrame(int width, int height)
    {   AppGameContainer app;
        
        try
        {   app = new AppGameContainer(new Controller());
            app.setDisplayMode(width,  height, false);
            app.setTargetFrameRate(30); //Sets the framerate
            app.setAlwaysRender(true);  //So that the game keeps running if you switch windows
            app.setUpdateOnlyWhenVisible(false); //So that the game does not update if it is on the background
            gameFrame = app;
            
            app.start(); // starts the game
         }
         
         catch (SlickException ex) 
         { Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
