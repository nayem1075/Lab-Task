
package com.mycompany.debabratasir;
import java.util.Scanner;

public class SumSubSeries {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Input number from user
        System.out.print("Enter the number for N terms : ");
        int n = input.nextInt();
        
        int sum=0;
        
        for (int i=1; i<=n; i++) {
            if(i%2==0){//For print - before even number
                sum = sum - i;
            }
            else{
                sum = sum + i;//For print + before odd number
            }
        }
        
        System.out.println("1-2+3-4+5-6...."+n+" = "+sum);
        
    }
    
}
