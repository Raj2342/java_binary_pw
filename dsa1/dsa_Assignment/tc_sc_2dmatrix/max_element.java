import java.util.Scanner;

public class max_element {

    public static void max_element_print(int arr[][])
    {
        int m= arr.length-1;
        int n= arr[0].length-1;
        int max = arr[0][0];
    
        for(int i=0;i<=m;i++)
        {
          for(int j=0;j<=n;j++)
          {
              if (arr[i][j]>max) {
                  max = arr[i][j];
              }
             
          }
        }

        System.out.println(max);
    
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

         max_element_print(arr);
    }
}
