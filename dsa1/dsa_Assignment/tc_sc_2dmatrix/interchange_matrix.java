import java.lang.reflect.Array;
import java.util.Arrays;

public class interchange_matrix {
    public static void main(String[] args) {
         int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
         };
         int m = arr.length-1;
         int n= arr[0].length-1;

           for(int i=0;i<m;i++)
           {
            for(int j=0;j<n;j++)
            {
                int temp = arr[i][i];
                arr[i][i]= arr[i][m-i];
                arr[i][m-i] = temp;
            }
           }

           for(int i=0;i<=m;i++)
           {
            for(int j=0;j<=n;j++){
              System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
            
           
    }
}
