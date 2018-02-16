package byui.cit360.dragonknight.model;

import dragonknight.DragonKnight;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cit360 Justicejil
 */
public class Game implements Serializable {

    public static void getsaveGame(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private String menu;
    private String spell;
    private double playerLevel;
    private double hitPoints;
    private int expPoints;
    
    private Item[] item;
    private NPC npc;
    private Map map;
    private Monster[] monster;
    private Player player;
    private Scene[] scene;
    private Weapon[] weapon;
    private Inventory[] inventory;
    
    
 
    

    public Game() {
    }
    
    

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public double getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(double playerLevel) {
        this.playerLevel = playerLevel;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public NPC getNpc() {
        return npc;
    }

    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Monster[] getMonster() {
        return monster;
    }

    public void setMonster(Monster[] monster) {
        this.monster = monster;
    }

    public Scene[] getScene() {
        return scene;
    }

    public void setScene(Scene[] scene) {
        this.scene = scene;
    }

    public Weapon[] getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon[] weapon) {
        this.weapon = weapon;
    }
    
    

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.menu);
        hash = 79 * hash + Objects.hashCode(this.spell);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.playerLevel) ^ (Double.doubleToLongBits(this.playerLevel) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.hitPoints) ^ (Double.doubleToLongBits(this.hitPoints) >>> 32));
        hash = 79 * hash + this.expPoints;
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.playerLevel) != Double.doubleToLongBits(other.playerLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hitPoints) != Double.doubleToLongBits(other.hitPoints)) {
            return false;
        }
        if (this.expPoints != other.expPoints) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (!Objects.equals(this.spell, other.spell)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "menu=" + menu + ", spell=" + spell + ", playerLevel=" + playerLevel + ", hitPoints=" + hitPoints + ", expPoints=" + expPoints + '}';
    }

    public void SetPlayer(Player player) {
        DragonKnight.player = player;
    }

    public void setItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
