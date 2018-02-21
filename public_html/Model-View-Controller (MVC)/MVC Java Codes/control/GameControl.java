package byui.cit360.dragonknight.control;

import byui.cit360.dragonknight.exception.MapControlException;
import byui.cit360.dragonknight.exception.GameControlException;

import byui.cit360.dragonknight.model.Location;
import byui.cit360.dragonknight.model.Map;

import dragonknight.DragonKnight;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author JIL
 */
public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {

            return null;
        }

        Player player = new Player();
        player.setName(name);

        DragonKnight.setPlayer(player); // save the player

        return player;

    }

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game(); // Create new game
        DragonKnight.setGame(game); //save in DragonKnight

        game.setPlayer(player); // save player in game

        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.moveNPCToStartingLocation(map);

        player.setLocation(map.getLocation(17, 15)); //move player to starting position in the map

        DragonKnight.setGame(game);

    }

    public static void saveGame(Game game, String filepath) 
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);    //write the game object out to file    }
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        String filepath = null;
        try (FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); // read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        DragonKnight.setCurrentGame(game); // save in DragonKnight
    }

    private static int moveNPCToStartingLocation(Map map) {
        // for every NPC

        NPC[] Npc = NPC.values();
        return 0;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

// start point
// row 1
        locations[0][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][15].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][17].setScene(scenes[SceneType.plain.ordinal()]);
        locations[0][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 2
        locations[1][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][15].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][17].setScene(scenes[SceneType.plain.ordinal()]);
        locations[1][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[1][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 3
        locations[2][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][15].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][17].setScene(scenes[SceneType.plain.ordinal()]);
        locations[2][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][20].setScene(scenes[SceneType.cave.ordinal()]);
        locations[2][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[2][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 4
        locations[3][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.cave.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[3][12].setScene(scenes[SceneType.town.ordinal()]);
        locations[3][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[3][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[3][17].setScene(scenes[SceneType.plain.ordinal()]);
        locations[3][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[3][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 5
        locations[4][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.road.ordinal()]);
        locations[4][10].setScene(scenes[SceneType.road.ordinal()]);
        locations[4][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[4][12].setScene(scenes[SceneType.store.ordinal()]);
        locations[4][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[4][14].setScene(scenes[SceneType.road.ordinal()]);
        locations[4][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[4][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[4][17].setScene(scenes[SceneType.plain.ordinal()]);
        locations[4][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[4][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 6
        locations[5][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.road.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.road.ordinal()]);
        locations[5][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[5][12].setScene(scenes[SceneType.town.ordinal()]);
        locations[5][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[5][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[5][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[5][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[5][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[5][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 7
        locations[6][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.road.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.road.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][12].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[6][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[6][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[6][18].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][19].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][20].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][21].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][22].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][23].setScene(scenes[SceneType.desert.ordinal()]);
        locations[6][24].setScene(scenes[SceneType.desert.ordinal()]);

// row 8
        locations[7][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.road.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.road.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[7][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[7][17].setScene(scenes[SceneType.road.ordinal()]);
        locations[7][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[7][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 9
        locations[8][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.road.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.road.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[8][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][18].setScene(scenes[SceneType.road.ordinal()]);
        locations[8][19].setScene(scenes[SceneType.road.ordinal()]);
        locations[8][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[8][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 10
        locations[9][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[9][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][4].setScene(scenes[SceneType.road.ordinal()]);
        locations[9][5].setScene(scenes[SceneType.road.ordinal()]);
        locations[9][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[9][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][19].setScene(scenes[SceneType.road.ordinal()]);
        locations[9][20].setScene(scenes[SceneType.road.ordinal()]);
        locations[9][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[9][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 11
        locations[10][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][4].setScene(scenes[SceneType.road.ordinal()]);
        locations[10][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][10].setScene(scenes[SceneType.castle.ordinal()]);
        locations[10][11].setScene(scenes[SceneType.castle.ordinal()]);
        locations[10][12].setScene(scenes[SceneType.castle.ordinal()]);
        locations[10][13].setScene(scenes[SceneType.castle.ordinal()]);
        locations[10][14].setScene(scenes[SceneType.castle.ordinal()]);
        locations[10][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][20].setScene(scenes[SceneType.road.ordinal()]);
        locations[10][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[10][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 12
        locations[11][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][3].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][4].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][5].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][10].setScene(scenes[SceneType.castle.ordinal()]);
        locations[11][11].setScene(scenes[SceneType.castle.ordinal()]);
        locations[11][12].setScene(scenes[SceneType.castle.ordinal()]);
        locations[11][13].setScene(scenes[SceneType.castle.ordinal()]);
        locations[11][14].setScene(scenes[SceneType.castle.ordinal()]);
        locations[11][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][19].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][20].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][21].setScene(scenes[SceneType.town.ordinal()]);
        locations[11][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[11][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 13
        locations[12][0].setScene(scenes[SceneType.forest.ordinal()]);
        locations[12][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[12][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[12][3].setScene(scenes[SceneType.town.ordinal()]);
        locations[12][4].setScene(scenes[SceneType.store.ordinal()]);
        locations[12][5].setScene(scenes[SceneType.town.ordinal()]);
        locations[12][6].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][7].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][8].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][9].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][10].setScene(scenes[SceneType.castle.ordinal()]);
        locations[12][11].setScene(scenes[SceneType.castle.ordinal()]);
        locations[12][12].setScene(scenes[SceneType.castle.ordinal()]);
        locations[12][13].setScene(scenes[SceneType.store.ordinal()]);
        locations[12][14].setScene(scenes[SceneType.castle.ordinal()]);
        locations[12][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][17].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][18].setScene(scenes[SceneType.road.ordinal()]);
        locations[12][19].setScene(scenes[SceneType.town.ordinal()]);
        locations[12][20].setScene(scenes[SceneType.store.ordinal()]);
        locations[12][21].setScene(scenes[SceneType.town.ordinal()]);
        locations[12][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[12][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[12][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 14
        locations[13][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[13][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[13][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[13][3].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][4].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][5].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][10].setScene(scenes[SceneType.castle.ordinal()]);
        locations[13][11].setScene(scenes[SceneType.castle.ordinal()]);
        locations[13][12].setScene(scenes[SceneType.castle.ordinal()]);
        locations[13][13].setScene(scenes[SceneType.castle.ordinal()]);
        locations[13][14].setScene(scenes[SceneType.castle.ordinal()]);
        locations[13][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][19].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][20].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][21].setScene(scenes[SceneType.town.ordinal()]);
        locations[13][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[13][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 15
        locations[14][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[14][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[14][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[14][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][4].setScene(scenes[SceneType.road.ordinal()]);
        locations[14][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][12].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][20].setScene(scenes[SceneType.road.ordinal()]);
        locations[14][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[14][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 16
        locations[15][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[15][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[15][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[15][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][4].setScene(scenes[SceneType.road.ordinal()]);
        locations[15][5].setScene(scenes[SceneType.road.ordinal()]);
        locations[15][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][8].setScene(scenes[SceneType.cave.ordinal()]);
        locations[15][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[15][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][19].setScene(scenes[SceneType.road.ordinal()]);
        locations[15][20].setScene(scenes[SceneType.road.ordinal()]);
        locations[15][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[15][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 17
        locations[16][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[16][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[16][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[16][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][5].setScene(scenes[SceneType.road.ordinal()]);
        locations[16][6].setScene(scenes[SceneType.road.ordinal()]);
        locations[16][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[16][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][18].setScene(scenes[SceneType.road.ordinal()]);
        locations[16][19].setScene(scenes[SceneType.road.ordinal()]);
        locations[16][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[16][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 18
        locations[17][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[17][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[17][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[17][3].setScene(scenes[SceneType.plain.ordinal()]);
        locations[17][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][6].setScene(scenes[SceneType.road.ordinal()]);
        locations[17][7].setScene(scenes[SceneType.road.ordinal()]);
        locations[17][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[17][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][15].setScene(scenes[SceneType.start.ordinal()]); // Starting position.
        locations[17][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][17].setScene(scenes[SceneType.road.ordinal()]);
        locations[17][18].setScene(scenes[SceneType.road.ordinal()]);
        locations[17][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[17][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 19
        locations[18][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[18][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[18][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[18][3].setScene(scenes[SceneType.plain.ordinal()]);
        locations[18][4].setScene(scenes[SceneType.plain.ordinal()]);
        locations[18][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][7].setScene(scenes[SceneType.road.ordinal()]);
        locations[18][8].setScene(scenes[SceneType.road.ordinal()]);
        locations[18][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][11].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][12].setScene(scenes[SceneType.road.ordinal()]);
        locations[18][13].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[18][17].setScene(scenes[SceneType.road.ordinal()]);
        locations[18][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[18][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 20
        locations[19][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][3].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][4].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[19][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][8].setScene(scenes[SceneType.road.ordinal()]);
        locations[19][9].setScene(scenes[SceneType.road.ordinal()]);
        locations[19][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[19][12].setScene(scenes[SceneType.town.ordinal()]);
        locations[19][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[19][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[19][16].setScene(scenes[SceneType.road.ordinal()]);
        locations[19][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[19][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 21
        locations[20][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][2].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][3].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][4].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][6].setScene(scenes[SceneType.plain.ordinal()]);
        locations[20][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][9].setScene(scenes[SceneType.road.ordinal()]);
        locations[20][10].setScene(scenes[SceneType.road.ordinal()]);
        locations[20][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[20][12].setScene(scenes[SceneType.store.ordinal()]);
        locations[20][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[20][14].setScene(scenes[SceneType.road.ordinal()]);
        locations[20][15].setScene(scenes[SceneType.road.ordinal()]);
        locations[20][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][20].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][21].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][22].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][23].setScene(scenes[SceneType.forest.ordinal()]);
        locations[20][24].setScene(scenes[SceneType.forest.ordinal()]);

// row 22
        locations[21][0].setScene(scenes[SceneType.plain.ordinal()]);
        locations[21][1].setScene(scenes[SceneType.plain.ordinal()]);
        locations[21][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[21][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[21][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[21][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[21][6].setScene(scenes[SceneType.plain.ordinal()]);
        locations[21][7].setScene(scenes[SceneType.plain.ordinal()]);
        locations[21][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][9].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][10].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][11].setScene(scenes[SceneType.town.ordinal()]);
        locations[21][12].setScene(scenes[SceneType.town.ordinal()]);
        locations[21][13].setScene(scenes[SceneType.town.ordinal()]);
        locations[21][14].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[21][20].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[21][21].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[21][22].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[21][23].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[21][24].setScene(scenes[SceneType.darkArea.ordinal()]);

// row 23
        locations[22][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[22][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[22][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[22][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[22][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[22][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][6].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][7].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][8].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[22][15].setScene(scenes[SceneType.forest.ordinal()]);
        locations[22][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[22][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[22][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[22][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[22][20].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[22][21].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[22][22].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[22][23].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[22][24].setScene(scenes[SceneType.darkArea.ordinal()]);

// row 24
        locations[23][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[23][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[23][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[23][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[23][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[23][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][6].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][7].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][8].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][15].setScene(scenes[SceneType.plain.ordinal()]);
        locations[23][16].setScene(scenes[SceneType.forest.ordinal()]);
        locations[23][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[23][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[23][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[23][20].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[23][21].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[23][22].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[23][23].setScene(scenes[SceneType.finish.ordinal()]);
        locations[23][24].setScene(scenes[SceneType.darkArea.ordinal()]);

// row 25
        locations[24][0].setScene(scenes[SceneType.water.ordinal()]);
        locations[24][1].setScene(scenes[SceneType.water.ordinal()]);
        locations[24][2].setScene(scenes[SceneType.water.ordinal()]);
        locations[24][3].setScene(scenes[SceneType.water.ordinal()]);
        locations[24][4].setScene(scenes[SceneType.water.ordinal()]);
        locations[24][5].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][6].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][7].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][8].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][9].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][10].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][11].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][12].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][13].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][14].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][15].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][16].setScene(scenes[SceneType.plain.ordinal()]);
        locations[24][17].setScene(scenes[SceneType.forest.ordinal()]);
        locations[24][18].setScene(scenes[SceneType.forest.ordinal()]);
        locations[24][19].setScene(scenes[SceneType.forest.ordinal()]);
        locations[24][20].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[24][21].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[24][22].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[24][23].setScene(scenes[SceneType.darkArea.ordinal()]);
        locations[24][24].setScene(scenes[SceneType.darkArea.ordinal()]);
    }

    public static Inventory[] createInventoryList() {

        // create array(list) of inventory
        Inventory[] inventory = new Inventory[10];

        Inventory potion = new Inventory();
        potion.setDescription("Potion");
        potion.setItemAmount(0);
        potion.setItemInStock(0);
        inventory[Item.potion.ordinal()] = potion;

        Inventory superPotion = new Inventory();
        superPotion.setDescription("Super Potion");
        superPotion.setItemAmount(0);
        superPotion.setItemInStock(0);
        inventory[Item.superPotion.ordinal()] = superPotion;

        Inventory megaPotion = new Inventory();
        megaPotion.setDescription("Mega Potion");
        megaPotion.setItemAmount(0);
        megaPotion.setItemInStock(0);
        inventory[Item.megaPotion.ordinal()] = megaPotion;

        Inventory xPotion = new Inventory();
        xPotion.setDescription("X-Potion");
        xPotion.setItemAmount(0);
        xPotion.setItemInStock(0);
        inventory[Item.xPotion.ordinal()] = xPotion;

        Inventory blackStone = new Inventory();
        blackStone.setDescription("Black Stone");
        blackStone.setItemAmount(0);
        blackStone.setItemInStock(0);
        inventory[Item.blackStone.ordinal()] = blackStone;

        Inventory whiteStone = new Inventory();
        whiteStone.setDescription("White Stone");
        whiteStone.setItemAmount(0);
        whiteStone.setItemInStock(0);
        inventory[Item.whiteStone.ordinal()] = whiteStone;

        Inventory shortSword = new Inventory();
        shortSword.setDescription("Short Sword");
        shortSword.setItemAmount(0);
        shortSword.setItemInStock(0);
        inventory[Weapon.shortSword.ordinal()] = shortSword;

        Inventory medSword = new Inventory();
        medSword.setDescription("Medium Sword");
        medSword.setItemAmount(0);
        medSword.setItemInStock(0);
        inventory[Weapon.medSword.ordinal()] = potion;

        Inventory longSword = new Inventory();
        longSword.setDescription("Long Sword");
        longSword.setItemAmount(0);
        longSword.setItemInStock(0);
        inventory[Weapon.longSword.ordinal()] = potion;

        Inventory dualSwords = new Inventory();
        dualSwords.setDescription("Dual Swords");
        dualSwords.setItemAmount(0);
        dualSwords.setItemInStock(0);
        inventory[Weapon.dualSwords.ordinal()] = potion;

        return inventory;
    }

}
