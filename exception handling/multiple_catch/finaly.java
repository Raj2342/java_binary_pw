import java.util.Scanner;

public class finaly {
    public static void main(String[] args) {
         System.out.println("Enter integer no.");
        Scanner sc = new Scanner(System.in);
         int store=0;

        try{
            store = sc.nextInt();
         }
         catch(Exception e )
         {
            System.out.println("something wrong");
         }
         finally 
         {
             sc.close();
          System.out.println("i am finally keyword ");
         }

         System.out.println("if catch not written i am not print if exeption in try code  ");
    }
}
