package byui.cit260.dragonknight.view;

import byui.cit260.dragonknight.control.GameControl;
import byui.cit260.dragonknight.exception.LoseGameException;
import byui.cit260.dragonknight.exception.MapControlException;
import byui.cit260.dragonknight.model.Game;
import dragonknight.DragonKnight;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DragonmanJoel
 */

public class MainMenuView extends View{
    
    
    
    public MainMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Main Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nN - Start New Game"
		  + "\nG - Get and Start Saved Game"
		  + "\nH - Get help on how to play the game"
		  + "\nS - Save Game"
		  + "\nQ - Quit"
		  + "\n-----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case
        char choice = value.charAt(0); // get first character entered
        
	switch (choice) {
		case 'N': 
			break;
		case 'G': // get and start an existing game 
			this.startSavedGame();
			break;
		case 'H': // display the help menu 
			this.displayHelpMenu();
			break;
		case 'S': // save the current game
			this.saveGame();
			break;      
		default:
			ErrorView.display("MainMenuView", "*** Invalid Selection *** Try Again");
			break;
	}

	return false;
}

    private void startNewGame() throws MapControlException {
        // create new game
	GameControl.createNewGame(DragonKnight.getPlayer());
        
        try {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        } catch (Exception lge) {
            System.out.println("You lose");
        }
    
    
}

    private void startSavedGame() {
       this.console.println("\n\nEnter the file path for file where the game " + "was saved last.");
String filePath = this.getInput();
  try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game " + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(DragonKnight.getGame(), filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
            
}
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    void displayMainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
    

