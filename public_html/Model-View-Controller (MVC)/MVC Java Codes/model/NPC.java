package byui.cit360.dragonknight.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author JIL
 */
public enum NPC implements Serializable {

    Hadrian("He is storekeeper"),
    Tybalt("He is a storekeeper"),
    Tyrionn("He is a storekeeper, first of his name"),
    Adelaide("He is a storekeeper"),
    Fendrel("He is a storekeeper");
    
    private final Point location;
    private final String description;
    
    private Game[] game;
    private Item[] item;
    /*private Location[] location;*/
    
    


    NPC(String description) {
        this.description = description;
        location = new Point(1,1);
    }

    public Point getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }
    
    

    @Override
    public String toString() {
        return "NPC{" + "location=" + location + ", description=" + description + '}';
    }
            
}

