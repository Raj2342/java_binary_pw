import java.util.Scanner;

public class square_root {

        public static int  square_root_print( int target)
        {
             int li=0;   
             int hi = target;
             

             while (hi>=li) {
              int mid = (li+hi)/2;
              long val = mid*mid;
              if (val==target) {
                   return mid; 
              }
              else if (val> target) {
                hi=mid-1;
              } 
              else if (val<target) {
                li=mid+1;
              } 
             }
             return 0;
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
