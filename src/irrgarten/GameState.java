/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author josepc
 */
public class GameState {
    private String labyrinth;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    public GameState(String lb, String p, String m, int cP, boolean w, String lg) {
        labyrinth = lb;
        players = p;
        monsters = m;
        currentPlayer = cP;
        winner = w;
        log = lg;
    }
    
    // getters
    public String getLabyrinth(){
        return labyrinth;
    }
    
    public String getPlayers(){
        return players;
    }
    
    public String getMonsters(){
        return monsters;
    }
    
    public int getCurrentPlayer(){
        return currentPlayer;
    }
    
    public boolean isWinner(){
        return winner;
    }
    
    public String getLog(){
        return log;
    }
}
