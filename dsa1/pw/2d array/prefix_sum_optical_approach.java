import java.util.*;
import java.io.*;
public class prefix_sum_optical_approach {

    // step-1
     public static void RowPrefixSum(int arr[][] , int m , int n){
            for(int i=0;i<m;i++)
            {
                for(int j=1;j<n;j++)
                {
                    arr[i][j]= arr[i][j]+arr[i][j-1];
                }
            }
     }

     // step-2
     public  static void ColoumnPrefixSum(int arr[][] , int m ,  int n )
     {
        
         for(int j=0;j<n;j++){
            for(int i=1;i<m;i++)
            {
                arr[i][j]= arr[i][j] + arr[i-1][j];
            }
         }
     }
     
       // step-3
    public static void Sumofprefix(int arr[][] , int r1 , int c1 , int r2, int c2){
        int full = arr[r2][c2];
        int top = arr[r1-1][c2];
        int left = arr[r2][c1-1];
        int Repeated_Regin = arr[r1-1][c1-1];

        int result = full-top-left+Repeated_Regin;
        System.out.println(result);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter no. of rows");
         int m = sc.nextInt();
         System.out.println("Enter no.of columns");
         int n = sc.nextInt();
         System.out.println("Enter   matrix");
         
         int arr[][] = new int[m][n];
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
         }


         System.out.println("Enter the vaue of r1 coordinates ");
         int r1 = sc.nextInt();
         System.out.println("Enter the vaue of c1 coordinates ");
         int c1 = sc.nextInt();
         System.out.println("Enter the vaue of r2 coordinates ");
         int r2 = sc.nextInt();
         System.out.println("Enter the vaue of c2 coordinates ");
         int c2 = sc.nextInt();

         RowPrefixSum(arr,m,n);
         ColoumnPrefixSum(arr, m,n);
         Sumofprefix(arr,r1,c1,r2,c2);




    }
}
