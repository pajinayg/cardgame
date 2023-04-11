/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    Random rand = new Random();
    int rNum = rand.nextInt(51);
    int size = 52;
    int size1;
//The group of cards, stored in an ArrayList
    /* public GroupOfCards (int size1){
        this.size1=size1;
    }*/
    Card[] deck = new Card[size];
    Card[] deck1 = new Card[size];
    Card[] deck2 = new Card[size];
    Card[] deck3 = new Card[size];
    Card[] deck4 = new Card[size];

    public void generate(int size2) {
        this.size1 = size2;
        int c = 0;
        for (Card.Suit s : Card.Suit.values()) //enum suits Hearts
        {

            for (Card.Value v : Card.Value.values()) //1
            {
                this.deck[c] = new Card(s, v);
                this.deck1[c] = new Card(s, v);
                this.deck2[c] = new Card(s, v);
                this.deck3[c] = new Card(s, v);
                this.deck4[c] = new Card(s, v);//deck[0] = hearts,1,2
                c++;
            }
        }
System.out.println("player 1");
        // for(int i=0;i<size1;i++){
        // System.out.println(deck1[0].getS()+""+deck1[0].getV());
        // System.out.println("random"+deck1[rNum].getS()+""+deck1[rNum].getV());
        int i2 = 0;
        for (int j = 0; j < size1; j++) {
            do {
                int rNum = rand.nextInt(52);
                if (this.deck1[j].getS() != this.deck1[rNum].getS() || this.deck1[j].getV() != this.deck1[rNum].getV()) {
                    this.deck1[j].setS(deck[rNum].getS());
                    this.deck1[j].setV(deck[rNum].getV());
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } while (i2 == 0);
        }
        // }
        int j1 = 0;
        for (int i = 1; i < size1 + 1; i++) {

            System.out.print(deck1[j1].getS() + " ");
            System.out.println(deck1[j1].getV());
            j1++;
        }
        System.out.println("-------------------");
        
        System.out.println("player 2");
        
        int i3 = 0;
        
        int c1=0;
        for (int j = 0; j < size1; j++) {
            do {
               
                i3 = 0;
                 rNum = rand.nextInt(52);
                if (this.deck2[j].getS() != this.deck2[rNum].getS() || this.deck2[j].getV() != this.deck2[rNum].getV())/* && (deck2[j])!=deck1[j]*/ {
                  
                    for (int k = 0; k < size1; k++) {
                        if (this.deck2[rNum].getS() != this.deck1[k].getS() || deck2[rNum].getV() != this.deck1[k].getV()) {
                          // System.out.println("demo"+deck2[rNum].getS());
                           //System.out.println("demo"+deck2[rNum].getV());
                            this.deck2[c1].setS(this.deck[rNum].getS());
                           this.deck2[c1].setV(this.deck[rNum].getV());
                               i3 = 0;
                            
                              if(c1<=size1){
                                   this.deck2[c1].setS(this.deck[rNum].getS());
                            this.deck2[c1].setV(this.deck[rNum].getV());  
                                  c1++; 
                                    
                                   // System.out.println("c1"+c1);
                                    //System.out.println("demo"+deck2[rNum].getS());
                           //System.out.println("demo"+deck2[rNum].getV());
                           break;
                              }
                             
                        } 
                        else{
                        i3=0;
                            break;
                        
                            
                        }
                       
                    }
                  
                }
                else {
                            i3 = 1;
                        }
                  
// deck2[j]=deck[rNum];
            } while (i3 == 0);
        }
        //}
        int j2 = 0;
        for (int i = 0; i < size1 + 1; i++) {

            System.out.print(deck2[j1].getS() + " ");
            System.out.println(deck2[j1].getV());
            j1++;
        }
        System.out.println("----------------");
        
        
        System.out.println("player 3");

        for (int j = 0; j < size1; j++) {
            int rNum = rand.nextInt(52);
            if ((this.deck3[j].getS() != this.deck3[rNum].getS()) || (this.deck3[j].getV() != this.deck3[rNum].getV())) {
                for (int k = 0; k < size1; k++) {
                    if (this.deck3[j].getS() != deck1[k].getS() || this.deck3[j].getV() != deck1[k].getV()) {
                        for (int l = 0; l < size1; l++) {
                            if (this.deck3[j].getS() != this.deck2[k].getS() || this.deck3[j].getV() != this.deck2[k].getV()) {
                                this.deck3[l].setS(deck[rNum].getS());
                                this.deck3[l].setV(deck[rNum].getV());
                            }
                        }
                    }
                }

//deck3[j]=deck[rNum];
            }
        }//}
        int j3 = 0;
        for (int i = 1; i < size1 + 1; i++) {

            System.out.print(deck3[j1].getS() + " ");
            System.out.println(deck3[j1].getV());
            j1++;
        }
        System.out.println("--------------------");
        
        System.out.println("player 4");
        
        for (int j = 0; j < size1; j++) {
            int rNum = rand.nextInt(52);
            if ((this.deck4[j].getS() != this.deck4[rNum].getS()) || (this.deck4[j].getV() != this.deck4[rNum].getV())/*&& (deck4[j])!=deck1[j] && (deck4[j])!=deck2[j] &&  (deck4[j])!=deck3[j]*/) {
                for (int k = 0; k < size1; k++) {
                    if ((this.deck4[j].getS()) != deck1[j].getS() || (this.deck4[j].getV()) != deck1[j].getV()) {
                        for (int l = 0; l < size1; l++) {
                            if ((this.deck4[j].getS()) != deck2[j].getS() || (this.deck4[j].getV()) != deck2[j].getV()) {
                                for (int m = 0; m < size1; m++) {
                                    if ((this.deck4[j].getS()) != deck3[j].getS() || (this.deck4[j].getV()) != deck3[j].getV()) {
                                        this.deck4[j].setS(deck[rNum].getS());
                                        this.deck4[j].setV(deck[rNum].getV());
                                    }
                                }
                            }
                        }
                    }
                }

// deck4[j]=deck[rNum];
            }
        }
        // }
        int j4 = 0;
        for (int i = 1; i < size1 + 1; i++) {

            System.out.print(deck4[j1].getS() + " ");
            System.out.println(deck4[j1].getV());
            j1++;
        }
        
    }

    /*  private ArrayList<Card> cards;
  
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
     */
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
