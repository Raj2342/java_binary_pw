import java.util.Scanner;
// advanced version of finally - less code and less complexity
public class try_finally2 {
      public static void main(String[] args) {
        int store =0;
         try(Scanner sc = new Scanner(System.in))
         {
             store = sc.nextInt();
         }
        System.out.println(store);
         System.out.println("hii");
      }
}
