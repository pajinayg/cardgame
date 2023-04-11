/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package ca.sheridancollege.project;

/**
 *
 * @author patel
 
public class Kachuful extends GroupOfCards  {
     private Card.Suit presidence;
    private Card.Value presidence1;
    
    Card cp = new Card(presidence, presidence1);
    Player p= new Player();

    int comp;

    
    public void play(int i, int j, int k, int l, int size) {
if (deck1[i].getS() == deck2[j].getS()) {
            if (deck1[i].getS() == cp.getT() && deck2[j].getS() == cp.getT()) {
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
        if(p.deck1[i].getS()==cp.getT() ){
        cp.setS(p.deck1[i].getS());
          cp.setV(p.deck1[i].getV());
        }
        else if(deck2[j].getS()==cp.getT()){
            cp.setS(deck2[j].getS());
          cp.setV(deck2[j].getV());
        }
        else{
        cp.setS(deck1[i].getS());
          cp.setV(deck1[i].getV()); }
    }
            //--------------------------------------------------------
            if (cp.getS() == deck3[k].getS()) {
                if (cp.getS() == cp.getT() && deck3[k].getS() == cp.getT()) {
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
                if (cp.getS() == cp.getT()) {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                } else if (deck3[k].getS() == cp.getT()) {
                    cp.setS(deck3[k].getS());
                    cp.setV(deck3[k].getV());
                } else {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                }
            }
            //------------------------------------------------------------
            if (cp.getS() == deck4[l].getS()) {
                if (cp.getS() == cp.getT()
                        && deck4[l].getS() == cp.getT()) {
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
                if (cp.getS() == cp.getT()) {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                } else if (deck4[l].getS() == cp.getT()) {
                    cp.setS(deck4[l].getS());
                    cp.setV(deck4[l].getV());
                } else {
                    cp.setS(cp.getS());
                    cp.setV(cp.getV());
                }

            }       
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}*/
