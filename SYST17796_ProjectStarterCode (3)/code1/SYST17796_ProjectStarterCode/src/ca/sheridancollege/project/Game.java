/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Game {

    //private final String name;//the title of the game
    //private ArrayList<Player> players;// the players of the game
int p1=0;
int p2=0;
int p3=0;
int p4=0;
//Card c= new Card();
	/**
	 * the title of the game
	 */
	private Collection<Player> players;
  /*  public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
*/
    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public void setpre(int p1,int p2,int p3,int p4){
        
    }   
    public void play(){
        
    }

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public  void declareWinner(){
        
    }

	public Collection<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	/**
	 * the players of the game
	 * @param name
	 */
	

}//end class
