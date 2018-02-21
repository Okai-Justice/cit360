package byui.cit360.dragonknight.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author JIL
 */
public class Player implements Serializable {

    
    // class instance variables
    private String name;
    List<Item> inventory;
     List<Hero> team;
    private String classSelection;
    private String attributes;
    private String race;
    
    private Game[] game;
    private Location location;

    public Player() {
        inventory = new ArrayList<>();
        team = new ArrayList<>();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassSelection() {
        return classSelection;
    }

    public void setClassSelection(String classSelection) {
        this.classSelection = classSelection;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.classSelection);
        hash = 41 * hash + Objects.hashCode(this.attributes);
        hash = 41 * hash + Objects.hashCode(this.race);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.classSelection, other.classSelection)) {
            return false;
        }
        if (!Objects.equals(this.attributes, other.attributes)) {
            return false;
        }
        if (!Objects.equals(this.race, other.race)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", classSelection=" + classSelection + ", attributes=" + attributes + ", race=" + race + '}';
    }
    
    

}

