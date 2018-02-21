/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.dragonknight.model;

import byui.cit360.dragonknight.control.GameControl;
import byui.cit360.dragonknight.enums.LocationType;
import java.io.Serializable;

/**
 *
 * @author JIL
 */
public class Map implements Serializable {
    
    public static final int NUM_ROWS = 25;
    public static final int NUM_COLS = 25;
    
    private Location[][] matrix;
    

    public Map() {
         matrix = new Location[NUM_ROWS][NUM_COLS];
        init();
        
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void init() {
        
      for (int row = 0; row < NUM_ROWS; row++){
      for( int col = 0; col < NUM_COLS; col++){
//   create and initialize new Location object instance
                Location loc = new Location();
                
                //Create a random location type
      loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
       loc.setRow(row);
       loc.setCol(col);
               matrix[row][col] = loc;

    }
}
    }
    
    public String getMapString() {
        
        String rtn ="";
        for (int row = 0; row < NUM_ROWS; row++){
      for( int col = 0; col < NUM_COLS; col++){
          rtn += matrix[row][col].getType().name().charAt(0);
          
          if(matrix[row][col].getHero() !=null) {
              rtn += matrix[row][col].getHero().getName().charAt(0);
          }
          rtn += "\t";
      }
      rtn += "\n";    
    }
        return rtn;
}

    public Location getLocation(int row, int col) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
}
