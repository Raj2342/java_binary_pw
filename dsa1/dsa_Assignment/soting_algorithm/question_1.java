// Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.lang.reflect.Array;
import java.util.Arrays;

public class question_1 {

      public static void desc_bubble_sort(int arr[])
      {
              for(int i=0;i<arr.length-1;i++)
              {
                   for(int j=0;j<arr.length-1-i;j++)
                   {
                       if (arr[j]<arr[j+1]) {
                           int temp = arr[j+1];
                           arr[j+1]= arr[j];
                           arr[j]=temp;
                       }
                   }
              }
      }
    public static void main(String[] args) {
          int arr[]= {3,5,1,6,0}; 
          desc_bubble_sort(arr);
          System.out.println(Arrays.toString(arr));         
    }
}