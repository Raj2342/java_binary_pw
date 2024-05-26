/*
  time complexity- O(m*n)
  space complixity:O(1)
 */

import java.util.Arrays;

public class question_4 {
    public static void main(String[] args) {
         
          int arr[][] = {
           {1,2,4,0},
           {2,5,7,-1},
           {4,2,6,9}
          };
          int m= arr.length-1;
          int n= arr[0].length-1;
          int max = arr[0][0];
          int min = arr[0][0];
          for(int i=0;i<=m;i++)
          {
            for(int j=0;j<=n;j++)
            {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
                else if (arr[i][j]<min){
                    min= arr[i][j];
                }
            }
          }
          
          //output
           System.out.println(max);
           System.out.println(min);
        
          
         
    }
}
