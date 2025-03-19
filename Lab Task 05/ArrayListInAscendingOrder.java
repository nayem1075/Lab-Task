
package com.mycompany.debabratasir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListInAscendingOrder {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> number = new ArrayList<>();
        
         System.out.print("Enter how many elements input for ArrayList : ");
         int size = input.nextInt();
         
         System.out.print("Enter ArrayList Elements : ");
         
         for(int i=0; i<size; i++){
        
             number.add(input.nextInt());
        }
         
         System.out.print("\nArrayList Before Ascending : "+number);
         
         Collections.sort(number);
         
         System.out.print("\n\nArraList After Ascending Order : ");
         
         for(int i=0; i<size; i++){
             System.out.print(" "+number.get(i));
         }
         
         input.close();
    }
}
