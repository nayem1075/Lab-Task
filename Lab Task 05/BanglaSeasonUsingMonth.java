
package com.mycompany.debabratasir;

import java.util.Scanner;

public class BanglaSeasonUsingMonth {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Enter the month number : ");
        int month = Input.nextInt();
        
        switch(month){
            
            case 1:
            case 2:  
            System.out.println("Summer");
            break;
            
            case 3:
            case 4:  
            System.out.println("Monsoon");
            break;
            
            case 5:
            case 6:  
            System.out.println("Autumn");
            break;
            
            case 7:
            case 8:  
            System.out.println("Late Autumn");
            break;
            
            case 9:
            case 10:  
            System.out.println("Winter");
            break;
            
            case 11:
            case 12 :  
            System.out.println("Spring");
            break;
            
            default : 
                System.out.println("Invalid month. Please enter a month between 1 to 12.");
        }
        
        Input.close();
        
    }
}
