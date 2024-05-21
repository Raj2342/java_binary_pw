/*
 *  *  approach-2

 */
public class Array_simple_palindrome {
    public static void main(String[] args) {
         
          int  arr[] = {1,2,3,2,1,6};
         int n = arr.length;
         int m =0;
          for(int i=0;i<n/2;i++)
          {
            if (arr[i] != arr[n-1-i]) {
                 m =1;
                System.out.println("not plaindrome");
                break;
            }
          }

          if (m==0) {
            System.out.println("palindrome");
          }
         
    }
}
