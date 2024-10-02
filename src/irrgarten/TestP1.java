/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author josepc
 */
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weapon sword = new Weapon(2.0f, 5);
        Shield shield = new Shield(3.0f, 4);

        System.out.println("Weapon attack: " + sword.attack()); // 2.0
        System.out.println("Shield protect: " + shield.protect()); // 3.0
        System.out.println("Weapon toString: " + sword.toString()); // W[2.0, 4]
        System.out.println("Shield toString: " + shield.toString()); // S[3.0, 3]

        Directions direction = Directions.UP;
        GameCharacter character = GameCharacter.PLAYER;
        Orientation orientation = Orientation.HORIZONTAL;
        System.out.println("Direction: " + direction);
        System.out.println("GameCharacter: " + character);
        System.out.println("Orientation: " + orientation);

        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            System.out.println("Random Position: " + dice.randomPos(10));
            System.out.println("Who starts: " + dice.whoStarts(4));
            System.out.println("Random Intelligence: " + dice.randomIntelligence());
            System.out.println("Random Strength: " + dice.randomStrength()); 
            System.out.println("Resurrect Player: " + dice.resurrectPlayer());
            System.out.println("Weapons Reward: " + dice.weaponsReward());
            System.out.println("Shields Reward: " + dice.shieldsReward());
            System.out.println("Health Reward: " + dice.healthReward());
            System.out.println("Weapon Power: " + dice.weaponPower());
            System.out.println("Shield Power: " + dice.shieldPower());
            System.out.println("Uses Left: " + dice.usesLeft());
            System.out.println("Intensity: " + dice.intensity(5.0f));
        }

        GameState state = new GameState("Labyrinth1", "Player1", "Monster1", 0, false, "Log1");
        System.out.println("GameState Log: " + state.getLog());
    }
    
}
