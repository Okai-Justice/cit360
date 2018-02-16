
package byui.cit360.dragonknight.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cit360 Justicejil
 */
public class Inventory implements Serializable {
    private String itemName;
    private int itemAmount;
    private int itemInStock;
    
    
    private Item[] item;
    private Weapon[] weapon;
    private Game game;

    public Inventory() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemInStock() {
        return itemInStock;
    }

    public void setItemInStock(int itemInStock) {
        this.itemInStock = itemInStock;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    public Weapon[] getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon[] weapon) {
        this.weapon = weapon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.itemName);
        hash = 97 * hash + this.itemInStock;
        hash = 97 * hash + this.itemAmount;
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
        final Inventory other = (Inventory) obj;
        if (this.itemInStock != other.itemInStock) {
            return false;
        }
        if (this.itemAmount != other.itemAmount) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName=" + itemName + ", itemAmount=" + itemAmount + ", itemInStock=" + itemInStock + '}';
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getRequiredAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getQuantityInStock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static Inventory[] createInventoryList(){
        
        // created array(list) of inventory items
        Inventory[] inventory = new Inventory[14];
        
        Inventory lumber = new Inventory();
        lumber.setDescription("Lumber");
        lumber.setQuantityInStock(0);
        lumber.setRequiredAmount(0);
        inventory[1] = lumber;
        
        Inventory ore = new Inventory();
        ore.setDescription("Ore");
        ore.setQuantityInStock(0);
        ore.setRequiredAmount(0);
        inventory[1] = ore;
        
        Inventory grain = new Inventory();
        grain.setDescription("Grain");
        grain.setQuantityInStock(0);
        grain.setRequiredAmount(0);
        inventory[2] = grain;
        
        return inventory;
        
        
    }

    public void setDescription(String lumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
