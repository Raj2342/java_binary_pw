import java.util.Arrays;
import java.util.Scanner;

public class brut_force_approach  {
      
      public  static int power(int a , int b){
            // step-1 base condition 
          
        if (b==1) {
               return a;
             }
             // step-2 
             else{
               return a*power(a,b-1);
             }
             

      }
           public static void main(String[] args) {
                 
      //-****************** bruth force*************************
                   // int a = 2;
                  // int b=4;
                  // int result=1;
                  // for(int i=1;i<=b;i++){
                  //     result = result*a;
                  // }
                  // System.out.println(result);

      //*****************  brut force approach *************************
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter the a value ");
                  int a = sc.nextInt();
                  System.out.println("Enter the b value ");
                  int b = sc.nextInt();
              int result =   power(a,b);
              System.out.println(result);
           }
}
