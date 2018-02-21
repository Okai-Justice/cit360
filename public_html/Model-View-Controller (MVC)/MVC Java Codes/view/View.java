
package byui.cit360.dragonknight.view;

import dragonknight.DragonKnight;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author JIL
 */

public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected final PrintWriter console = DragonKnight.getOutFile;
    protected final BufferedReader keyboard = DragonKnight.getInFile();
    private boolean message;
    
    public View(){
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    @Override
    public void display (){
        String value;
        boolean done = false;
        do{
            //prompt for and get players name
         this.console.println(this.message);
        value = this.getInput();// useer wants to quit
             // exit the view
        
        //do the requested action and display the next view 
        done = this.doAction(value);
        
        } while (!done); //exit the view when done == true
        
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        try {
        //while a valid name has not been retrieved 
        while (!valid) {
            
            
            //get the value entered from the keyboard
            value = this.keyboard.readLine();
            value = value.trim();
            
            
            
            if (value.length() < 1) { //blank value entered
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                continue;
            }
            break;
        }
          } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }    
     return null; // return the name
        }

}
        
