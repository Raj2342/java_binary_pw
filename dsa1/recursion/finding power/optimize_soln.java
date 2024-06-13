import java.util.*;
import java.lang.*;
public class optimize_soln {

    public static int power(int a,int b)
    {
      int result =0 ;
      int  finalresult=0;
        if(b==1){
            return a;
        }
       else{
        result = power(a,b/2);
        finalresult = result*result;
        if (b%2!=0) {
            return a*finalresult;
        }
        else{
            return finalresult;
        }
       }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of a");
         int a =  sc.nextInt();
         System.out.println("Enter the value of b");
         int b =  sc.nextInt();
       int  final_result =  power(a,b);
       System.out.println(final_result);

    }
}
