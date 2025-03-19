
package com.mycompany.debabratasir;
import java.util.Scanner;

public class BaseAndExponent {
    
    public static void main(String[] args) {
     Scanner user = new Scanner(System.in);
     
        System.out.print("Enter the base : ");
        int base = user.nextInt();
        
        System.out.print("Enter the exponent : ");
        int exponent = user.nextInt();
        
        //Explicit Type Casting
        long result =(long) Math.pow(base, exponent);
        
        System.out.println(base+" power of "+exponent+" = "+result);
        
        user.close();
        
    }
}
