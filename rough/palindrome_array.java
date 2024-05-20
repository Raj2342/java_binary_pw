import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class palindrome_array {
    public static void main(String[] args) {
          
          int arr[] = { 1,2,3,2,-1};
          int reverseArr[] = new int[10];

          for(int i=arr.length-1; i<0;i--)
          {
               reverseArr[0] =  arr[i];
          }

          System.out.println(Arrays.toString(reverseArr));

        
    }
}
