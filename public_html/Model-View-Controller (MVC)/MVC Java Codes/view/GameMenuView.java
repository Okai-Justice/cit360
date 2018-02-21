/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.dragonknight.view;

import byui.cit360.dragonknight.control.MovementController;
import byui.cit360.dragonknight.exception.LoseGameException;
import byui.cit360.dragonknight.exception.MovementException;
import byui.cit360.dragonknight.model.Location;
import dragonknight.DragonKnight;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JIL
 */
class GameMenuView extends View{
    
    protected final BufferedReader keyboard = DragonKnight.getInFile();

    public GameMenuView() {
	super("\n"
		  + "\n-----------------------------------------------"
		  + "\n| Game Menu                                    "
		  + "\n-----------------------------------------------"
		  + "\nP - Search for people"
		  + "\nN - Move North"
		  + "\nE - Move East"
                  + "\nS - Move South"
		  + "\nW - Move West"
                  + "\nM - View Map"
                  + "\nL - View Current Location"
                  + "\nW - viewInventory"
		  + "\nQ - Return to Main Menu"
		  + "\n-----------------------------------------------");
    }
    
    
    
    @Override
    public boolean doAction(String value) {

	value = value.toUpperCase(); // convert choice to upper case

	switch (value) {
            
                case "P" :
                searchPeople();
                break;
                case "N" :
                moveNorth();
                break;
                case "E" :
                moveEast();
                break;
                case "S" :
        {
            try {
                moveSouth();
            } catch (LoseGameException e) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, e);
            }
        }
                break;
                case "W" :
                moveWest();
                break;
                case "M" :
                viewMap();
                break;
                case "L" :
                viewCurrentLocation();
                break;
                case "Q" :
                return true;
                default:
                    System.out.println("Invalid option");
                    break;
            
                
        }
           return false;
        }

    private void searchPeople() {
        System.out.println ("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        MovementController mc = new MovementController();
        try{
            mc.moveNorth(DragonKnight.getGame());
            System.out.println("You moved north");
        } catch (MovementException me )  {
            System.out.println("You cannot move there");
        } catch (Exception e) {
        }finally {
            //always executes
             System.out.println("Finally executes");
        }
        
    }

    private void moveEast() {
       MovementController mc = new MovementController();
        if (mc.moveEast(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        }
    }

    private void moveSouth() throws LoseGameException {
       MovementController mc = new MovementController();
        if (mc.moveSouth(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        }
       throw new LoseGameException();
        
    }

    private void moveWest() {
      MovementController mc = new MovementController();
        if (mc.moveWest(DragonKnight.getGame()) == false){
            System.out.println("You cannot move towards that direction");
        }
    }

    private void viewMap() {
        System.out.println(DragonKnight.getGame().getMap().getMapString());
    }
    
   private void viewCurrentLocation() {
       
      String input = "";
      try {
      input = keyboard.readLine();
      } catch (Exception e) {
          //baried
      }
      int myNum = 0;
      try{
      myNum = Integer.parseInt(input);
      } catch (Exception e) {
          System.out.println("Bad numeric input");
      }
      
       Location l = DragonKnight.getGame().getPlayer().getLocation();
       System.out.println("You are at ("+ l.getRow() + ", " + l.getCol() + ")");
   } 
    }

  
   
