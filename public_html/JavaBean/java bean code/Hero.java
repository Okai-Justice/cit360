/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit360.dragonknight.model;

import java.io.Serializable;

/**
 *
 * @author cit360 Justicejil
 */
public class Hero implements Serializable{
      private String name;
      private double hitpoints;
      private double attackpoints;

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public double getAttackpoints() {
        return attackpoints;
    }

    public void setAttackpoints(double attackpoints) {
        this.attackpoints = attackpoints;
    }
      
      
      
}



