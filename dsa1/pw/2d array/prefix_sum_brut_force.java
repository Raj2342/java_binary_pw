import java.util.*;
import java.io.*;
public class prefix_sum_brut_force {
       
        public static int  findSumMatrix(int arr[][] , int r1 , int c1 , int r2, int c2)
        {   
             int sum =0;
            for(int i=r1;i<=r2;i++)
            {
              for(int j=c1;j<=c2;j++)
              {
                    sum = sum+ arr[i][j];
              }
            }
            return sum ; 
        }
       public static void main(String[] args) {
        
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter  no. of rows");
             int m = sc.nextInt();
             System.out.println("Enter no. of colomn");
             int n = sc.nextInt();
             System.out.println("Enter  element of matrix ");
             
             int arr[][] = new int[m][n];
            
              for(int i=0;i<m;i++)
              {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]= sc.nextInt();
                }
              }

              System.out.println("row1 point ");
              int r1 = sc.nextInt();
              System.out.println("colomn1 point ");
              int c1 = sc.nextInt();
              System.out.println("row2 point");
              int r2 = sc.nextInt();
              System.out.println("colomn2 point ");
              int c2 = sc.nextInt();

           int result =   findSumMatrix(arr , r1, c1 , r2 , c2);
             System.out.println(result);
             
             
            //  System.out.println( " total sum "+sum); 
       }
}
