import java.util.*;
import java.io.*;
public class rotation_2d_matrix {

    public static void rotationMatrix(int arr[][])
    { 
        int m = arr.length;
        int n = arr[0].length;
         // step-1  transpose  rows and colomn 
         for(int i=0;i<m;i++)
         {
            for(int j=i;j<n;j++)
            {
               int temp = arr[i][j];
               arr[i][j]= arr[j][i];
               arr[j][i]=temp;
            }
         }

         // step-2  swap right and left side element 
         for(int i=0; i<m ; i++)
         {
             int lc =0;
             int rc = n-1;

             while(rc>lc)   
             {
                   int temp = arr[i][lc];
                   arr[i][lc] = arr[i][rc];
                   arr[i][rc]= temp;
                 lc++;
                 rc--;   
             }
         }
    }
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // function calling 
        rotationMatrix(arr);

        for(var mat : arr)
        {
            System.out.println(Arrays.toString(mat));
        }

        
    }
}