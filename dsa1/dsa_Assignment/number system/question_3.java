// Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
// Input 8, Even
// 3, False 

import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int  number = sc.nextInt(); 

           if ((number & 1) ==1 ) {
                System.out.println("odd");
           }
           else{
            System.out.println("even");
           }

    }
}
