
package com.mycompany.debabratasir;
import java.util.Scanner;

public class LargestNumberOfArrayList {
    
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);

        System.out.print("Enter how many elements input for ArrayList : ");
         int size = user.nextInt();
         
         int [] number = new int[size];
         
         System.out.print("Enter ArrayList Elements : ");
         
         for(int i=0; i<size; i++){
             number[i] = user.nextInt();
         }
         
         System.out.print("\n\nArrayList : ");
         for(int i=0; i<size; i++){
         System.out.print(" "+number[i]);
         }
         int maximum = number[0];
         
         for(int i=1; i<size; i++){
             
             if(number[i] > maximum){
                 maximum = number[i];
             }
         }
         System.out.println("\n\nThe largest number of an ArrayList is : "+maximum);

    }
}
