
// Package declaration
package com.mycompany.debabratasir;
// Importing Scanner class for user input
import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args){
        
        // Creating Scanner object to take user input
        Scanner Input = new Scanner(System.in);
        
        //Declaring Variables
        int number, first=0, second=1, fibonacci;
        
        // Asking the user for the number of terms
        System.out.print("Enter the number of terms : ");
        number = Input.nextInt();
        
        System.out.println("Fibonacci series up to "+number+" terms : ");
        
        // Loop to generate and print the Fibonacci serie
       for(int i=0; i<number; i++){
           
           System.out.print(" "+first);
           
           fibonacci = first + second;
           // Updating first and second numbers for the next iteration
           first = second;
           second = fibonacci;
       }
       // Closing the Scanner to prevent resource leaks
        Input.close();
    }
    
}
