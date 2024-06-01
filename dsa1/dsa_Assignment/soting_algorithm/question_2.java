// Q2. WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.lang.reflect.Array;
import java.util.Arrays;

public class question_2 {

      public static void  selection_sort(int arr[])
      {
            for(int i=0;i<arr.length-1;i++)
            {
                 int min = i;
                for(int j=i+1;j<=arr.length-1;j++)
                {
                if (arr[j]>arr[min]) {
                    min= j;
                } 
                }

                if (min!=i) {
                    int temp = arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
                    
                }
            }
      }
      public static void main(String[] args) {
            int arr[]= {3,5,1,6,0};
            selection_sort(arr);
            System.out.println(Arrays.toString(arr));  

      }
}
