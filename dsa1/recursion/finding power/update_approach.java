// biginteger 

import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;

public class update_approach {

   public static BigInteger  powerFind(BigInteger a,int b)
   {
    BigInteger finalresult;
    BigInteger result1;
    if (b==1) {
        return a;
    }
    else{
          result1 = powerFind(a, b/2);
        finalresult = result1.multiply(result1);
        if (b%2==0) {
            return finalresult;
        }
        else{
            return a.multiply(finalresult);
        }
    }
   }
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the a value ");
          BigInteger a =  sc.nextBigInteger();
          System.out.println("Enter the  b value ");
          int  b = sc.nextInt();

          BigInteger   result = powerFind(a,b);
          System.out.println(result);
    }
}
