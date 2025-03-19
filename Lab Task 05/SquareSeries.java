
package com.mycompany.debabratasir;
import java.util.Scanner;

public class SquareSeries {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //input from user
        System.out.print("Enter the number for N terms : ");
        int n = input.nextInt();
        int sum=0;
        
        //For execute upto n terms
        for(int i=1; i<=n; i++){
            
            sum = sum + i*i;
        }
        
        System.out.print("1^2 + 2^2 + 3^2 + ....."+n+"^2 = "+sum);
        
    }
    
}
