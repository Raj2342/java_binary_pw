/*
 *  approach-1
 * TC = O(N) , SC = O(N)
 */

import java.util.Arrays;

import javax.print.DocFlavor.READER;

import java.util.*;
public class Array_PALINDROME {
    public static void main(String[] args) {
        // original array

        int[] arr = { 1, 2,3,2,1}; 
        System.out.println("original array:"+Arrays.toString(arr));
        
        // reverse array
        int reversed[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            reversed[arr.length-1-i] = arr[i];
        }
        System.out.println("reverser array :"+Arrays.toString(reversed));

        // check if the array is a palindrome
         boolean isPaLINDROME = true;
         for(int i=0; i<arr.length;i++){
             if (arr[i] != reversed[i]) {
                isPaLINDROME = false;
                break;
             }
         }

         if (isPaLINDROME) {
             System.out.println("array is palindrome");
         }
         else {
            System.out.println(" array is not palindrome");
         }
      



      
        
        
    }
}
