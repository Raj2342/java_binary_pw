import java.util.Scanner;

public class rough {

    public static int addition(int n)
    {
          if (n<=1) {
            return 1;
          }
          else if(n%2==0){
            return addition(n-1)-n ;
          }
          else{
            return addition(n-1)+n;
          }
    }
    public static void main(String[] args) {
         
      
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
       int result =  addition(n);
       System.out.println(result);

    }
}
