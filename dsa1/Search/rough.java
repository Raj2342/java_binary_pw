// Approach: Modified Binary Search
// Time complexity: O(log n)
// Space complexity: O(1)

import java.util.*;
import java.io.*;

public class rough {
   
    
        public static void mySqrt(int x) {
              
           if (x==0) {
            return;
           }
           else{
            mySqrt(x-1);
            System.out.println(x);
           }
            
            
           
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root: ");
        int x = sc.nextInt();

        // function calling
         mySqrt(x);
        // System.out.println("Square root of the given number is: "+result);
    }
}