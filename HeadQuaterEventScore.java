/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise5_1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class HeadQuaterEventScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
       HeadQuaterEvent obj = new HeadQuaterEvent();
       FirstSubscriber first = new FirstSubscriber();
       SecondSubscriber second = new SecondSubscriber();
       obj.addSubscriber(first);
       obj.addSubscriber(second);
       Scanner inp = new Scanner(System.in);
       String scoreLine;
       System.out.print("Enter Score ");
       scoreLine = inp.nextLine();
       while(!scoreLine.equals("")) {
           obj.setScoreLine(scoreLine);
           System.out.print("Enter Score ");
           scoreLine = inp.nextLine();
        
        
    }
    
    }
}
