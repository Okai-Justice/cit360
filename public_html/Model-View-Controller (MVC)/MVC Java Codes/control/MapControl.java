package byui.cit360.dragonknight.control;

import byui.cit360.dragonknight.model.Map;
import byui.cit360.dragonknight.model.Scene;

/**
 *
 * @author JIL
 */
public class MapControl {
    
    public static Map createMap() {
        // create the map
        Map map = new Map(25,25);
        
        // create scenes
        Scene[] scenes = createScenes();
        
        //assign a scene to a location
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;

    
}

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //public static int moveNPCToStartingLocation(NPC npc, Point coordinates)
       //     throws MapControlException {
       // Map map = DragonKnight.getCurrentGame().getMap();
       // int newRow = coordinates.x-1;
       // int newColumn = coordinates.y-1;
        
       // if (newRow < 0 || newRow >= map.NUM_ROWS || newColumn < 0 || newColumn >= map.NUM_COLS)
         //   throw new MapControlException("Can not move NPC to location " + coordinates.x + ", " + coordinates.y
         //   + " because that location is outside the bounds of the map.");
    //}

    static void moveNPCToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
