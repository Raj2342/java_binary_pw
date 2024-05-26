import java.util.Scanner;

public class middle_column_row {

    public static void middle_column_row_print(int arr[][]){

        int m = arr.length-1;
      
        int n = arr[0].length-1;
       
        for(int i=0;i<=m;i++)
           {
              
            System.out.print(arr[i][(arr.length-1)/2] + " ");
           }
  
           for(int i=0;i<=m;i++)
           { 
              if (i != (arr.length-1)/2) {
                 
                 System.out.print(+arr[(arr.length-1)/2][i]+ " ");
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

         middle_column_row_print(arr);
       }
}
