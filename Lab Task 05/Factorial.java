
//Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner Input = new Scanner(System.in);
        //Declaring Variables
        int number, Factorial = 1;
        
        // Prompting the user to enter a number for factorial calculation
        System.out.print("Enter any number to find the Factorial : ");
        number = Input.nextInt();
        // Loop to calculate factorial
        for(int i=1; i<=number; i++){
            // Multiplying the current value of Factorial with i
            Factorial = Factorial * i;
        }
        // Displaying the final factorial result
        System.out.println("Factorial of "+number+" = "+Factorial);
    }
    
}
