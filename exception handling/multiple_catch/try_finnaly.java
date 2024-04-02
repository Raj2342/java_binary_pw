import java.util.InputMismatchException;
// when you write  exception in catch box it is important to import library otherwise it show error
import java.util.Scanner;

public class try_finnaly {
      public static void main(String[] args) {
        int store =0;
         System.out.println("Enter a integer no.");
          
          // try with resource 
        
          try(Scanner sc = new Scanner(System.in))
          {

               store = sc.nextInt();// critical statement 
          }
          

          System.out.println(store);
      }
}
