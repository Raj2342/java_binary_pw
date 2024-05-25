/* 
q-2:write a program to print the elements above the secondary diagonal in a user inputted
square matrix.

*/

import java.util.Scanner;

public class question_2 {

       public  static void  AboveDiagonal(int arr[][]){
        int m = arr.length;
        int n= arr[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j<m-1){
                 System.out.print(" "+arr[i][j]);
                }
            }
        }
       }
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
         System.out.println("ENTER ROW OF MATRIX ");
         int m = sc.nextInt();
         System.out.println("Enter coloumn of matrix");
         int n = sc.nextInt();
         System.out.println("Enter element of matrix");
         int arr[][] = new int[m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
         }

         AboveDiagonal(arr);
    }
}
