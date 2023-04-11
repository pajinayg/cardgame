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
        Scanner k= new Scanner(System.in);
        String name[]= new String[4];
        int ID[]={1,2,3,4};
        int ie=1;
        // TODO code application logic here
        System.out.println("Welcome to KachuFul");
        System.out.println("Enter name of Player 1 and is your ID is:"+ID[0]);
         name[0]=k.nextLine();
          System.out.println("Enter name of Player 2 and is your ID is:"+ID[1]);
         name[1]=k.nextLine();
           System.out.println("Enter name of Player 3 and is your ID is:"+ID[2]);
         name[2]=k.nextLine();
         System.out.println("Enter name of Player 4 and is your ID is:"+ID[3]);
         name[3]=k.nextLine();
         Player p= new Player(name,ID);
         int c=0;
         int pre[]= new int[4];
         
         do{
             p.tcrad();
             System.out.println("Trump card of this Group:"+p.getT());
             System.out.println("This Round is gonna be of "+ie+"Cards");
             GroupOfCards gc= new  GroupOfCards();
           
             gc.generate(ie);
             System.out.println("Now Game Starts.........");
             do{
             System.out.println("To see card of player 1 enter 1");
             c=k.nextInt();
             gc.showcard1(c);
             }while(c!=1);
             c=0;
             System.out.println("Enter your prediction:");
             pre[0]=k.nextInt();
             do{
             System.out.println("To see card of player 2 enter 1");
             c=k.nextInt();
             gc.showcard2(c);
             }while(c!=1);
             c=0;
              System.out.println("Enter your prediction:");
             pre[1]=k.nextInt();
             do{
             System.out.println("To see card of player 3 enter 1");
             c=k.nextInt();
             gc.showcard3(c);
             }while(c!=1);
             c=0;
              System.out.println("Enter your prediction:");
             pre[2]=k.nextInt();
             do{
             System.out.println("To see card of player 4 enter 1");
             c=k.nextInt();
             gc.showcard4(c);
             }while(c!=1);
             c=0;
              System.out.println("Enter your prediction:");
             pre[3]=k.nextInt();
             p.setP(pre);
             
                 
          ie++;
         }while(ie<14);
         
    }
    
}
