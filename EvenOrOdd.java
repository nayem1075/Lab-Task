
//Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        
        // Creating Scanner object to take user input
        Scanner User = new Scanner(System.in);
        //Declaring Variables
        int number;
        
        // Asking the user for the number to check even or odd
        System.out.print("Enter any number : ");
        number = User.nextInt();
        
        // Checking if the number is even or odd
        if(number%2==0){
            // If the remainder when divided by 2 is 0, it is an even number
            System.out.println(number+" is Even Number");
        }
        else {
            // If the remainder is not 0, it is an odd number
            System.out.println(number+" is Odd number");
        }
    }
    
}
