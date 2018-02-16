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
 * @author gee
 */
public class ManufacturingControlTest {
    
    public ManufacturingControlTest() {
    }

    /**
     * Test of calculateManufactureSpell method, of class ManufacturingControl.
     */
    @Test
    public void testCalculateManufactureSpell() {
        System.out.println("calculateManufactureSpell");
        double resource = 1.0;
        double amount = -2.0;
        double item = 5.0;
        ManufacturingControl instance = new ManufacturingControl();
        double expResult = -1;
        double result = instance.calculateManufactureSpell(resource, amount, item);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
