/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author patel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String name[] = new String[4];
        int ID[] = {1, 2, 3, 4};
        int ie = 1;
        int rr=0;
        // TODO code application logic here
        System.out.println("Welcome to KachuFul");
        System.out.println("Enter name of Player 1 and is your ID is:" + ID[0]);
        name[0] = k.nextLine();
        System.out.println("Enter name of Player 2 and is your ID is:" + ID[1]);
        name[1] = k.nextLine();
        System.out.println("Enter name of Player 3 and is your ID is:" + ID[2]);
        name[2] = k.nextLine();
        System.out.println("Enter name of Player 4 and is your ID is:" + ID[3]);
        name[3] = k.nextLine();
        Player p = new Player();
        Game g = new Game();
        p.setName(name);
        p.setID(ID);
        int c = 0;

        do {
            int ci = 0;
            //int pre[]= new int[4];
            int r = 0;
            int round = 0;
            int po1[] = new int[8];
            int po2[] = new int[8];
            int po3[] = new int[8];
            int po4[] = new int[8];
            int pre1[] = new int[8];
            int pre2[] = new int[8];
            int pre3[] = new int[8];
            int pre4[] = new int[8];
            int cc1 = 0;
            int ccc1 = 0;
            int e;
            int cc2 = 0;
            int ccc2 = 0;
            int e1 = 0;
            int cc3 = 0;
            int ccc3 = 0;
            int e2 = 0;
            int cc4 = 0;
            int ccc4 = 0;
            int e3 = 0;
            //p.tcrad();
            //System.out.println("Trump card of this Group:"+p.getT());
            //g.gen();
            g.gen();
            System.out.println("trump card:" + g.turmp);
            System.out.println("This Round is gonna be of " + ie + "Cards");
            //dg GroupOfCards g= new  GroupOfCards();

            g.generate(ie);
            System.out.println("Now Game Starts.........");
            do {

                if (rr == 0) {
                    do {
                        System.out.println("To see card of player 1 enter 1");
                        c = k.nextInt();
                        g.showcard1(c);
                    } while (c != 1);
                    c = 0;
                    System.out.println("Enter your prediction:");
                    pre1[ci] = k.nextInt();
                    do {
                        System.out.println("To see card of player 2 enter 1");
                        c = k.nextInt();
                        g.showcard2(c);
                    } while (c != 1);
                    c = 0;
                    System.out.println("Enter your prediction:");
                    pre2[ci] = k.nextInt();
                    do {
                        System.out.println("To see card of player 3 enter 1");
                        c = k.nextInt();
                        g.showcard3(c);
                    } while (c != 1);
                    c = 0;
                    System.out.println("Enter your prediction:");
                    pre3[ci] = k.nextInt();
                    do {
                        System.out.println("To see card of player 4 enter 1");
                        c = k.nextInt();
                        g.showcard4(c);
                    } while (c != 1);
                    c = 0;
                    System.out.println("Enter your prediction:");
                    pre4[ci] = k.nextInt();

                    // p.setP(pre);
                    ///////////////////////////
                    do {

                        System.out.println("To select the card of player 1 enter 1");
                        c = k.nextInt();
                        g.showcard1(c);
                        System.out.println("--Enter the index of the card you want to play consider first to start form 0: ");
                        po1[ci] = k.nextInt();
                        if (po1[ci] < ie && po1[ci] >= 0) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                    } while (c != 1);
                    c = 0;
                    do {
                        System.out.println("To select the card of player 2 enter 1");
                        c = k.nextInt();
                        g.showcard2(c);
                        System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                        po2[ci] = k.nextInt();
                        if (po2[ci] < ie && po2[ci] >= 0) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                    } while (c != 1);
                    c = 0;
                    do {
                        System.out.println("To select the card of player 3 enter 1");
                        c = k.nextInt();
                        g.showcard3(c);
                        System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                        po3[ci] = k.nextInt();
                        if (po3[ci] < ie && po3[ci] >= 0) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                    } while (c != 1);
                    c = 0;
                    do {
                        System.out.println("To select the card of player 4 enter 1");
                        c = k.nextInt();
                        g.showcard4(c);
                        System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                        po4[ci] = k.nextInt();
                        if (po4[ci] < ie && po4[ci] <= 0) {
                            c = 1;
                        } else {
                            c = 0;
                        }
                    } while (c != 1);
                    c = 0;

                    g.play(po1[ci], po2[ci], po3[ci], po4[ci], ie);
                   
                    g.point(pre1[ci], pre2[ci], pre3[ci], pre4[ci], ie, po1[ci], po2[ci], po3[ci], po4[ci]);
                   
                    g.show();
                   
                    r++;
                } //-------------------------------------
                else {
                    ci = 1;

                    int p1c = 0;
                    int p2c = 0;
                    int p3c = 0;
                    int p4c = 0;
                    do {
                        System.out.println("To see card of player 1 enter 1");
                        c = k.nextInt();
                        g.showcard1(c);
                        System.out.println("Enter your prediction:");
                    pre1[ci] = k.nextInt();
                    } while (c != 1);
                    c = 0;

                    do {
                        System.out.println("To see card of player 2 enter 1");
                        c = k.nextInt();
                        g.showcard2(c);
                        System.out.println("Enter your prediction:");
                    pre2[ci] = k.nextInt();
                    } while (c != 1);
                    c = 0;

                    do {
                        System.out.println("To see card of player 3 enter 1");
                        c = k.nextInt();
                        g.showcard3(c);
                        System.out.println("Enter your prediction:");
                    pre3[ci] = k.nextInt();
                    } while (c != 1);
                    c = 0;

                    do {
                        System.out.println("To see card of player 4 enter 1");
                        c = k.nextInt();
                        g.showcard4(c);
                        System.out.println("Enter your prediction:");
                    pre4[ci] = k.nextInt();
                    } while (c != 1);
                    c = 0;

                    ci++;
                    //////////////////

                    do {

                        System.out.println("To select the card of player 1 enter 1");
                        c = k.nextInt();
                        g.showcard1(c);
                        do {
                            System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                            po1[cc1] = k.nextInt();
                            if (po1[cc1] < ie && po1[cc1] >= 0) {
                                e = po1[cc1];
                                for (int i = 0; i <= r; i++) {
                                    if (e == po1[r]) {
                                        ccc1 = 0;
                                    } else {
                                        ccc1 = 1;
                                    }
                                }
                            }
                        } while (ccc1 == 1);

                    } while (c != 1);
                    c = 0;

                    //////////////////////////////////
                    do {

                        System.out.println("To select the card of player 2 enter 1");
                        c = k.nextInt();
                        g.showcard2(c);
                        do {
                            System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                            po2[cc2] = k.nextInt();

                            if (po2[cc2] < ie && po2[cc2] >= 0) {
                                e1 = po1[cc2];
                                for (int i = 0; i <= r; i++) {
                                    if (e1 == po1[r]) {
                                        ccc2 = 0;
                                    } else {
                                        ccc2 = 1;
                                    }
                                }
                            }
                        } while (ccc2 == 1);
                    } while (c != 1);
                    c = 0;
                    ///////////////////////////////

                    do {

                        System.out.println("To select the card of player 3 enter 1");
                        c = k.nextInt();
                        g.showcard3(c);
                        do {
                            System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                            po3[cc3] = k.nextInt();

                            if (po3[cc3] < ie && po3[cc3] >= 0) {
                                e2 = po3[cc3];
                                for (int i = 0; i <= r; i++) {
                                    if (e2 == po3[r]) {
                                        ccc3 = 0;
                                    } else {
                                        ccc3 = 1;
                                    }
                                }
                            }
                        } while (ccc3 == 1);
                    } while (c != 1);
                    c = 0;
                    ////////////////////////

                    do {

                        System.out.println("To select the card of player 4 enter 1");
                        c = k.nextInt();
                        g.showcard4(c);
                        do {
                            System.out.println("Enter the index of the card you want to play consider first to start form 0: ");
                            po4[cc4] = k.nextInt();

                            if (po4[cc4] < ie && po4[cc4] >= 0) {
                                e3 = po4[cc4];
                                for (int i = 0; i <= r; i++) {
                                    if (e3 == po4[r]) {
                                        ccc4 = 0;
                                    } else {
                                        ccc4 = 1;
                                    }
                                }
                            }
                        } while (ccc4 == 1);
                    } while (c != 1);
                    /////////////////////
                    c = 0;

                    g.play(po1[cc1], po2[cc2], po3[cc3], po4[cc4], ie);
                    g.show();
                    g.point(pre1[ci], pre2[ci], pre3[ci], pre4[ci], ie, po1[cc1], po2[cc2], po3[cc3], po4[cc4]);
                    cc1++;
                    cc2++;
                    cc3++;
                    cc4++;
                    r++;
                }
rr++;
            } while (round == ie); //
            System.out.println("------------------------------------------------");
            ci++;
            g.ptable();
            ie++;
        } while (ie < 4);

    }

}
