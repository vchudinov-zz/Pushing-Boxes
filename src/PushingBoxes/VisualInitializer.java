package PushingBoxes;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/** Initializers the graphics container. 
 * @see Controller
 * 
 * @version 1
 * @author VIktor & Nour
 * 
 */

public class VisualInitializer 
{   private static AppGameContainer gameFrame;  //The game frame.
    
    /** Creates a new frame in which the game can run
     * @param width - the width of the frame
     * @param height - the height of the frame
     * @version 2
     */
    static void newFrame(int width, int height)
    {   AppGameContainer app;
        
        try
        {   app = new AppGameContainer(new Controller());
            app.setDisplayMode(width,  height, false);//Sets the size of the window.
            app.setTargetFrameRate(30);               //Sets the framerate.
            app.setAlwaysRender(true);                //So that the game keeps running if you switch windows.
            app.setUpdateOnlyWhenVisible(false);      //So that the game does not update if it is 
            gameFrame = app;                          //on the background.
            
            app.start();                              // starts the game
         }
         
         catch (SlickException ex) 
         { Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
