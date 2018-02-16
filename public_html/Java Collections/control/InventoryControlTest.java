/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.dragonknight.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justicejil
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addToInventory method, of class InventoryControl.
     */
    @Test
    public void testAddToInventory() {
        System.out.println("addToInventory");
        int total = 1;
        int amount = 2;
        InventoryControl instance = new InventoryControl();
        int expResult = 2;
        int result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeFromInventory method, of class InventoryControl.
     */
    @Test
    public void testRemoveFromInventory() {
        System.out.println("removeFromInventory");
        int item = 0;
        int amount = 0;
        InventoryControl instance = new InventoryControl();
        int expResult = 0;
        int result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeItem method, of class InventoryControl.
     */
    @Test
    public void testStoreItem() {
        System.out.println("storeItem");
        int item = 0;
        int amount = 0;
        int cost = 0;
        int pocket = 0;
        InventoryControl instance = new InventoryControl();
        int expResult = 0;
        int result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellItem method, of class InventoryControl.
     */
    @Test
    public void testSellItem() {
        System.out.println("sellItem");
        int item = 0;
        int amount = 0;
        int cost = 0;
        int pocket = 0;
        InventoryControl instance = new InventoryControl();
        int expResult = 0;
        int result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
