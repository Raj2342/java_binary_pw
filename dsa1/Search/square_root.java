import java.util.Scanner;

public class square_root {

        public static int  square_root_print( int target)
        {
             int li=0;   
             int hi = target;
             int result =0;

             while (hi>=li) {
              int mid = (li+hi)/2;
              long val = mid*mid;
              if (val==target) {
                   return mid; 
              }
              else if (val> target) {
                // target ka  hamesa double value  hota hai 
 // store the floor value, incase the number is not perfect square root, we can print the floor value

                
                hi=mid-1;
              } 
              else if (val<target) {
                result=mid;
                li=mid+1;
              } 
             }
             return result;
        }
    public static void main(String[] args) {
           
           Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter the square root ");
          int target = sc.nextInt();
         // function calling 
         int store= square_root_print(target);

          if (store==0) {
            System.out.println("Not found square root");
          }
          else{
            System.out.println("Found square root "+ store);
          }
          
    }
}
