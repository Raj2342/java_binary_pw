import java.util.*;
public class fibonaci_series {

    public static int  fibonaci_series_print(int n)
    {
          // step-1 base case condition
         if (n<=1) {
            return n;
            }
            // step-2 rescursive function call
            else{
                return  fibonaci_series_print(n-1)+fibonaci_series_print(n-2);
            }

    }
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the fibinaci series");
         int n = sc.nextInt();
       int result =  fibonaci_series_print(n);
       System.out.println(result);


    }
}
