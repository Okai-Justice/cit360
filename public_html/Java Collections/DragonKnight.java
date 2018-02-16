package dragonknight;

import byui.cit360.dragonknight.model.Game;
import byui.cit360.dragonknight.model.Player;
import byui.cit360.dragonknight.view.StartProgramView;
import java.io.BufferedReader;

/**
 *
 * @author Justicejil
 */
public class DragonKnight {
    
    private static Game game;
    public static Player player;
    
    
    public static void main(String[] args) {
       
    StartProgramView startProgramView = new StartProgramView();
	
    startProgramView.displayStartProgramView();
        
    }

     public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DragonKnight.player = player;
    }

    public static Object getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static BufferedReader getInFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Game getGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   
    
    
    
}
