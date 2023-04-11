/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Player extends GroupOfCards {
    int[] n= new int[4];
     String[] name=new String[4]; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * //@param  the unique ID to assign to this player.
     */
    public Player(String name[],int n[]){
        
       this.n=n;
        this.name=name;
    }
    public void givedeck(boolean player1, boolean player2, boolean player3, boolean player4){
       
        
        if(player1==true)
        {
            System.out.println(deck1);
        }
        if(player2==true)
        {
            System.out.println(deck2);
        }
        if(player3==true)
        {
            System.out.println(deck3);
        }
        if(player4==true)
        {
            System.out.println(deck4);
        }
        
    }
            

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
