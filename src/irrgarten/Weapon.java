/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author josepc
 */
public class Weapon {
    private float power;
    private int uses;
    
    // Constructor p, u es power y uses
    public Weapon(float power, int uses) {
        this.power = power;
        this.uses = uses;
    }
    
    public float attack() {
        if (uses > 0) {
            uses--;
            return power;
        }
        
        return 0;
    }
    
    // Sobreescribir el metodo toString (recomendado por el IDE)
    @Override
    public String toString() {
        return ("W[" + power + ", " + uses + "]");
    }
    
    public boolean discard() {
        Dice dice = new Dice();
        return dice.discardElement(uses);
    }
    
}
