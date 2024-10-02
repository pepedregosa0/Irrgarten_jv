/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;
import java.util.Random;

/**
 *
 * @author josepc
 */
public class Dice {
    private int MAX_USES = 5;
    private float MAX_INTELLIGENCE = 10.0f;
    private float MAX_STRENGTH = 10.0f;
    private float RESURRECT_PROB = 0.3f;
    private int WEAPONS_REWARD = 2;
    private int SHIELDS_REWARD = 3;
    private int HEALTH_REWARD = 5;
    private int MAX_ATTACK = 3;
    private int MAX_SHIELD = 2;
    
    private Random generator = new Random();
    
    public int randomPos(int max) {
        return generator.nextInt(max);
    }
    
    public int whoStarts(int nplayers) {
        return generator.nextInt(nplayers);
    }
    
    public float randomIntelligence() {
        return generator.nextFloat(MAX_INTELLIGENCE);
    }
    
    public float randomStrength() {
        return generator.nextFloat(MAX_STRENGTH);
    }
    
    public boolean resurrectPlayer() {
        if (generator.nextFloat() < RESURRECT_PROB) 
            return true;
        else return false;
    }
    
    public int weaponsReward() {
        return generator.nextInt(WEAPONS_REWARD + 1);
    }
    
    public int shieldsReward() {
        return generator.nextInt(SHIELDS_REWARD + 1);
    }
    
    public int healthReward() {
        return generator.nextInt(HEALTH_REWARD + 1);
    }
    
    public float weaponPower() {
        return generator.nextFloat(MAX_ATTACK);
    }
    
    public float shieldPower() {
        return generator.nextFloat(MAX_SHIELD);
    }
    
    public int usesLeft() {
        return generator.nextInt(MAX_USES + 1);
    }
    
    public float intensity(float competence) {
        return generator.nextFloat(competence);
    }
    
    public boolean discardElement(int usesLeft) {
        if (usesLeft == MAX_USES) return false;
        else if (usesLeft <= 0) return true;
        else return generator.nextFloat() > (float) (usesLeft / MAX_USES); 
        // Casting necesario para evitar division entera
    }
}
