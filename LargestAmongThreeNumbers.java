
//Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class LargestAmongThreeNumbers {
    
    public static void main(String[] args){
        // Creating Scanner object to take user input
        Scanner User = new Scanner(System.in);
        //Declaring Variables
        int number1, number2, number3;
        
        //Taking the user to enter three numbers
        System.out.print("Enter three numbers : ");
        number1 = User.nextInt();
        number2 = User.nextInt();
        number3 = User.nextInt();
        
// Checking which number is the largest
        if(number1>number2 && number1>number3){
            // If number1 is greater than both number2 and number3
            System.out.println("The largest number is : "+number1); 
        }
        else if(number2>number1 && number2>number3){
             // If number2 is greater than both number1 and number3
            System.out.println("The largest number is : "+number2);
        }
        else{
             // If number3 is the greatest among all
            System.out.println("The largest number is : "+number3);
        }
        // Closing the Scanner object to prevent memory leak
        User.close();
    }
}
