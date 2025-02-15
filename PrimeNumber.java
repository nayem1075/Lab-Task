
//Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner User = new Scanner(System.in);
        //Declaring Variables
        int number, count=0;
        
        // Prompting the user to enter a number for checking prime
        System.out.print("Enter any number to check prime number : ");
        number = User.nextInt();
        
        // Checking if the number is less than or equal to 1
        if(number<=1){
            // If the number is 1 or less, it's not a prime number
            count++;
        }
        else{
            // Loop to check divisibility from 2 to sqrt(number)
            for(int i=2; i<number/2; i++){
                  // If the number is divisible by any i, it's not prime
                if(number%i==0){
                    count++;// Increment count if a divisor is found
                    break;// Break the loop as it's not prime
                }
            }
        }
        // If count is still 0, it's a prime number
            if(count==0){
                System.out.println(number+" is a Prime number");
            }
            else{
                System.out.println(number+" is not a Prime number");
            }
    }
    
}
