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
    int comp;
    Card[] deck = new Card[size];
    Card[] deck1 = new Card[size];
    Card[] deck2 = new Card[size];
    Card[] deck3 = new Card[size];
    Card[] deck4 = new Card[size];
    Card[] finalcard= new Card[1];
    int a,b,c,d,s;
    
    //Player p= new Player();

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
        //System.out.println("player 1");
        
        for (int j = 0; j < size1; j++)
        {   
            int rNum = rand.nextInt(52);
                if (this.deck1[j].getS() != this.deck1[rNum].getS() || this.deck1[j].getV() != this.deck1[rNum].getV()) 
                {
                    this.deck1[j].setS(deck[rNum].getS());
                    this.deck1[j].setV(deck[rNum].getV());
                } 
        }
               
       // System.out.println("player 2");

        int i3 = 0;
        int c1 = 0;
        for (int j = 0; j < size1; j++) 
        {
           
                i3 = 0;
                rNum = rand.nextInt(52);
                if (this.deck2[j].getS() != this.deck2[rNum].getS() || this.deck2[j].getV() != this.deck2[rNum].getV())/* && (deck2[j])!=deck1[j]*/ 
                {

                    for (int k = 0; k < size1; k++)
                    {
                        if (this.deck2[rNum].getS() != this.deck1[k].getS() || deck2[rNum].getV() != this.deck1[k].getV())
                        {
                            
                            this.deck2[j].setS(this.deck[rNum].getS());
                            this.deck2[j].setV(this.deck[rNum].getV());
                            i3 = 0;
                        } 
                    }
                }
        } 


        //System.out.println("player 3");
int c4=0;
int a1=0;
        for (int j = 0; j < size1; j++)
        
        {a1=0;
            
            int rNum = rand.nextInt(52);
            if ((this.deck3[j].getS() != this.deck3[rNum].getS()) || (this.deck3[j].getV() != this.deck3[rNum].getV()))
            {
                for (int k = 0; k < size1; k++)
                {
                    if (this.deck3[rNum].getS() != deck1[k].getS() || this.deck3[rNum].getV() != deck1[k].getV()) 
                    {
                        for (int l = 0; l < size1; l++)
                        {
                            if (this.deck3[l].getS() != this.deck2[rNum].getS() || this.deck3[l].getV() != this.deck2[rNum].getV())
                            {
                                this.deck3[j].setS(deck[rNum].getS());
                                this.deck3[j].setV(deck[rNum].getV());
                                //System.out.println(c4+""+deck[c4].getS());
                                //System.out.println(c4+""+deck[c4].getV());
                               
                            }
                         }
                    }
                }
            }
        }
        
       // System.out.println("player 4");

        for (int j = 0; j < size1; j++) 
        {
            int rNum = rand.nextInt(52);
            if ((this.deck4[j].getS() != this.deck4[rNum].getS()) || (this.deck4[j].getV() != this.deck4[rNum].getV())/*&& (deck4[j])!=deck1[j] && (deck4[j])!=deck2[j] &&  (deck4[j])!=deck3[j]*/)
            {
                for (int k = 0; k < size1; k++) 
                {
                    if ((this.deck4[rNum].getS()) != deck1[k].getS() || (this.deck4[rNum].getV()) != deck1[k].getV()) 
                    {
                        for (int l = 0; l < size1; l++)
                        {
                            if ((this.deck4[rNum].getS()) != deck2[l].getS() || (this.deck4[rNum].getV()) != deck2[l].getV()) 
                            {
                                for (int m = 0; m < size1; m++) 
                                {
                                    if ((this.deck4[rNum].getS()) != deck3[m].getS() || (this.deck4[rNum].getV()) != deck3[m].getV())
                                    {
                                        this.deck4[j].setS(deck[rNum].getS());
                                        this.deck4[j].setV(deck[rNum].getV());
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

    
    }
public void showcard1(int z){
   int j1 = 0;
   if(z==1){
   System.out.println("Cards of Player1");
        for (int i = 1; i < size1 + 1; i++) {
            
            System.out.print(this.deck1[j1].getS() + " ");
            System.out.println(this.deck1[j1].getV());
            j1++;
        }
}}
public void showcard2(int z){
   int j1 = 0;
        if(z==1)  {     
System.out.println("Cards of Player2");
        for (int i = 1; i < size1 + 1; i++) {
            System.out.print(this.deck2[j1].getS() + " ");
            System.out.println(this.deck2[j1].getV());
            j1++;
        }
}}
public void showcard3(int z){
   int j1 = 0;
   if(z==1){
   System.out.println("Cards of Player3");
        for (int i = 1; i < size1 + 1; i++) {
            
            System.out.print(this.deck3[j1].getS() + " ");
            System.out.println(this.deck3[j1].getV());
            j1++;
        }
}}
public void showcard4(int z){
   int j1 = 0;
   if(z==1){
   System.out.println("Cards of Player4");
        for (int i = 1; i < size1 + 1; i++) {
           
            System.out.print(this.deck4[j1].getS() + " ");
            System.out.println(this.deck4[j1].getV());
            j1++;
        }
}}
public void check(){
    if (deck1[0].getS() != deck2[0].getS()){
        System.out.println(deck1[0].getS()+""+deck2[0].getS());
    }
    else{
     System.out.println(deck1[0].getS()+""+deck2[0].getS());   
    }
    
}
    
   
}


//end class
