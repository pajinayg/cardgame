/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suit;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Player extends GroupOfCards {
    int[] n= new int[4];
     String[] name=new String[4]; //the unique name for this player
     int p[]= new int[4];
public Suit t;
int[] point= new int[4];
    public Suit getT() {
        return t;
    }

    public void setT(Suit t) {
        this.t = t;
    }
private  int i=0;
public  Suit tcrad(){
       if(i==0){
           t=Card.Suit.SPADES;
       }
       else if(i==1){
           t=Card.Suit.DIAMONDS;
       }
        else if(i==2){
           t=Card.Suit.CLUBS;
       }
        else if(i==3){
           t=Card.Suit.HEARTS;
       }
        else if(i==4){
           t=Card.Suit.SPADES;
       }
        else if(i==5){
           t=Card.Suit.DIAMONDS;
       }
        else if(i==6){
           t=Card.Suit.CLUBS;
       }
        else if(i==7){
           t=Card.Suit.HEARTS;
       }
       i=i+1;
       return t;
    }
    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * //@param  the unique ID to assign to this player.
     */
   
        

    /**
     * @return the player name
     */
    public String[] getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name[]) {
        this.name = name;
    }
    public int[] getID() {
        return p;
    }
    public void setID(int[] p){
        this.p=p;
    }

	/**
	 * A constructor that allows you to set the player's unique ID
	 * @param name the unique ID to assign to this player.
	 * @param n
	 */
	

	/**
	 * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
	 * with logic to play your game.
	 */
	

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
   

}
