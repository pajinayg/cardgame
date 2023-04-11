/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author patel
 */
public  class Card extends GroupOfCards{
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    public enum Suit {HEARTS,SPADES,CLUBS,DIAMONDS};
    public enum Value {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};    
    private Suit s;
    private Value v;
    Suit suit1 = Suit.HEARTS;
    Suit suit2 = Suit.SPADES;
    Suit suit3 = Suit.CLUBS;
    Suit suit4 = Suit.DIAMONDS;
    
    Value value1 = Value.TWO;
    Value value2 = Value.THREE;
    Value value3 = Value.FOUR;
    Value value4 = Value.FIVE;
    Value value5 = Value.SIX;
    Value value6 = Value.SEVEN;
    Value value7 = Value.EIGHT;
    Value value8 = Value.NINE;
    Value value9 = Value.TEN;
    Value value10 = Value.JACK;
    Value value11 = Value.QUEEN;
    Value value12 = Value.KING;
    Value value13 = Value.ACE;
    private int i=0;
     public Card(Suit s,Value v)
    {
        this.s=s;
        this.v=v;
    }
     
public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
    public Suit t;

    public Suit getT() {
        return t;
    }

    public void setT(Suit t) {
        this.t = t;
    }

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	
   

}
