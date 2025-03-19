
package com.mycompany.debabratasir;
import java.util.Scanner;

public class TestLeapYear {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Input year from User
        System.out.print("Enter any year to check leap year : ");
        int year = input.nextInt();
        
        //Check leap year
        if(year%400==0){
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("It's not leap year");
        }
        
        input.close();
    }
    
}
