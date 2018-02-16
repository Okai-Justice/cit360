package byui.cit360.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cit360 Justicejil
 */
public enum Item implements Serializable{
    
    potion(),
    superPotion(),
    megaPotion(),
    xPotion(),
    blackStone(),
    whiteStone();
    
    
    
    // class instance variables
    private String name;
    private String description;
    private int cost;
    private String itemType;
    private int itemDamage;
    private int itemHeal;
    
    private Game game;
    private Inventory inventory;
    

    Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemDamage() {
        return itemDamage;
    }

    public void setItemDamage(int itemDamage) {
        this.itemDamage = itemDamage;
    }

    public int getItemHeal() {
        return itemHeal;
    }

    public void setItemHeal(int itemHeal) {
        this.itemHeal = itemHeal;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + ", cost=" + cost + ", itemType=" + itemType + ", itemDamage=" + itemDamage + ", itemHeal=" + itemHeal + '}';
    }
    
    
}
