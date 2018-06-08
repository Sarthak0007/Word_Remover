/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word_remover;

import java.util.Scanner;


public class Word_Remover {

    
    public static void main(String[] args) {
        
       String a,b;
       
       Scanner scn =new Scanner(System.in);
        System.out.println("Enter a String:-");
        a =scn.nextLine();
        
        System.out.println("Enter a Word to be delete from string:-");
        b =scn.nextLine();
        
        
        System.out.print("Deleting all '" + b + "' from '" + a + "'...\n");
        a = a.replaceAll(b, "");
        
        System.out.print("Specified word deleted Successfully from the String..!!");
        
        System.out.print("\nNow the String is :");
       System.out.print(a);       
            System.out.println("");
       
       
       
    }
    
}
