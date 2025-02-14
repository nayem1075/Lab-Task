
//Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class SumOfTwoNumbers {
    
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);
        //Declaring Variables
        int number1, number2, sum;
        
        //Taking the user to enter two numbers
        System.out.print("Enter Two number : ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        // Calculating the sum of the two numbers
        sum = number1 + number2;
        // Displaying the result
        System.out.println("Sum of this two numbers = "+sum);
        
    }
    
}
