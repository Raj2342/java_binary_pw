import java.util.Scanner;
import java.util.*;


public class factorial{

     public static int factorial_print(int n){
        
        int store =0;
            if(n==0 || n==1)
            {
                return 1;
            }

            else{
              store = n*factorial_print(n-1);
            }
        
          return store;
     }
     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
              System.out.println("Enter the number ");
              int n = sc.nextInt();
            int result=  factorial_print(n);
            System.out.println(result);
    }
}