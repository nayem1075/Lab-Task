
package com.mycompany.debabratasir;
import java.util.Scanner;

public class TemperatureConversation {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Input Fahrenheit temperature from user
        System.out.print("Enter temperature in Fahrenheit : ");
        double temperature = input.nextDouble();
        
        //formula for convert Fahrenheit to Celsius temperature
        double ConvertedTemperature = (temperature - 32) * 5/9;
        
        //Print Celsius Temperature
        System.out.println(temperature+" degree Fahrenheit is equal to "+ConvertedTemperature+" in Celsius");
        
    }
    
}
