import java.util.Scanner;

public class question_3 {
    public static void BothDiagonal(int arr[][] ){
         int m = arr.length-1;
         int n= arr[0].length-1; 
         for(int i=0;i<=m;i++)
         {
            for(int j=0; j<=n;j++)
            {
                 if (i==j ) {
                    System.out.print(arr[i][j]+ " ");
                 }
                 else if (i+j==m){
                    System.out.print(arr[i][j]+ " ");
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

         BothDiagonal(arr);
    }
}
