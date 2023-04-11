/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suit;
import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.*;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public  class Game extends Player {

    private Suit presidence;
    private Value presidence1;
    
    
    Card cp = new Card(presidence, presidence1);
    Player p= new Player();
    
   
GroupOfCards gq= new GroupOfCards();
    int comp;
// i have change gp.deck[]
   
      Suit turmp;
      public void gen(){
        this.turmp=p.tcrad();
      }
      
    public  void play(int i, int j, int k, int l,int size) {
     
        if (deck1[i].getS() == deck2[j].getS()) {
            if (deck1[i].getS() == turmp && deck2[j].getS() == turmp) {
                comp = deck1[i].getV().ordinal() - deck2[j].getV().ordinal();
                if (comp > 0) {
                    cp.setS(deck1[i].getS());
                    cp.setV(deck1[i].getV());
                } else if (comp < 0) {
                    cp.setS(deck2[j].getS());
                    cp.setV(deck2[j].getV());
                }
            } else {
                comp = deck1[i].getV().ordinal() - deck2[j].getV().ordinal();
                if (comp > 0) {
                    cp.setS(deck1[i].getS());
                    cp.setV(deck1[i].getV());
                } else if (comp < 0) {
                    cp.setS(deck2[j].getS());
                    cp.setV(deck2[j].getV());
                } 
            }
        }
            
            else {
        //trump catd condition
        if(deck1[i].getS()==turmp ){
        cp.setS(deck1[i].getS());
          cp.setV(deck1[i].getV());
        }
        else if(deck2[j].getS()==turmp){
            cp.setS(deck2[j].getS());
          cp.setV(deck2[j].getV());
        }
        else{
        cp.setS(deck1[i].getS());
          cp.setV(deck1[i].getV()); }
    }
            //--------------------------------------------------------
            if (cp.getS() == deck3[k].getS()) {
                if (cp.getS() == turmp && deck3[k].getS() == turmp) {
                    int comp = cp.getV().ordinal() - deck3[k].getV().ordinal();
                    if (comp > 0) {
                        cp.setS(cp.getS());
                        cp.setV(cp.getV());
                    } else if (comp < 0) {
                        cp.setS(deck3[k].getS());
                        cp.setV(deck3[k].getV());
                    }
                } else {
                    int comp = cp.getV().ordinal() - deck3[k].getV().ordinal();
                    if (comp > 0) {
                        cp.setS(cp.getS());
                        cp.setV(cp.getV());
                    } else if (comp < 0) {
                        cp.setS(deck3[k].getS());
                        cp.setV(deck3[k].getV());
                    }
                }

            } else {
                if (cp.getS() == turmp) {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                } else if (deck3[k].getS() == turmp) {
                    cp.setS(deck3[k].getS());
                    cp.setV(deck3[k].getV());
                } else {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                }
            }
            //------------------------------------------------------------
            if (cp.getS() == deck4[l].getS()) {
                if (cp.getS() == turmp
                        && deck4[l].getS() == turmp) {
                    int comp = cp.getV().ordinal() - deck4[l].getV().ordinal();
                    if (comp > 0) {
                        cp.setS(cp.getS());
                        cp.setV(cp.getV());
                    } else if (comp < 0) {
                        cp.setS(deck4[l].getS());
                        cp.setV(deck4[l].getV());
                    }
                } else {
                    int comp = cp.getV().ordinal() - deck4[l].getV().ordinal();
                    if (comp > 0) {
                        cp.setS(cp.getS());
                        cp.setV(cp.getV());
                    } else if (comp < 0) {
                        cp.setS(deck4[l].getS());
                        cp.setV(deck4[l].getV());
                    }
                }

            } else {
                if (cp.getS() == turmp) {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                } else if (deck4[l].getS() == turmp) {
                    cp.setS(deck4[l].getS());
                    cp.setV(deck4[l].getV());
                } else {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                }

            }
        }
    

  public void show() {
        System.out.println("WINNER CARD IS:" + cp.getS() + "" + cp.getV());
    }
  public void point(int p1,int p2,int p3,int p4,int size,int pc1,int pc2,int pc3,int pc4){
      
      
      for(int i=0;i<size;i++){
          int z=0;
          if(z==0){
          if(deck1[pc1].getS()==cp.getS() && deck1[pc1].getV()==cp.getV()){
              point[0]=p1+10;
              point[1]=0;
               point[2]=0;
                point[3]=0;
              System.out.println("Points of 1:"+point[0]);
          }
          if(deck2[pc1].getS()==cp.getS() && deck2[pc1].getV()==cp.getV()){
              point[0]=0;
              point[1]=p2+10;
               point[2]=0;
                point[3]=0;
              System.out.println("Points of 2:"+point[1]);
          }
          if(deck3[pc1].getS()==cp.getS() && deck3[pc1].getV()==cp.getV()){
              point[0]=0;
              point[1]=0;
               point[2]=p3+10;
                point[3]=0;
              System.out.println("Points of 3:"+point[2]);
          }
          if(deck4[pc1].getS()==cp.getS() && deck4[pc1].getV()==cp.getV()){
              point[0]=0;
              point[1]=0;
               point[2]=0;
                point[3]=p4+10;
              System.out.println("Points of 4:"+point[3]);
          }}
          else{
              System.out.println("Kem la");
          }
      }
      
     
      
  }
   public void ptable(){
      System.out.println("----------POINT TABLE-----------");
      System.out.println("PLAYER 1 "+point[0]);
      System.out.println("PLAYER 2 "+point[1]);
      System.out.println("PLAYER 3 "+point[2]);
      System.out.println("PLAYER 3 "+point[3]);
  }

}//end class
