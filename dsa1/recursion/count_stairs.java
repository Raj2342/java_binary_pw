import java.util.Scanner;

public class count_stairs {

    public static int count_staris_print(int n)
    {
           if (n<=1) {
              return n;
           }
           else{
            return count_staris_print(n-1)+count_staris_print(n-2);
           }
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the no. of Stairs");
          int n = sc.nextInt();

      int result = count_staris_print(n+1);
      System.out.println(result);
    }
}
