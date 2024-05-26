import java.util.Scanner;

public class even_index {

    public static void even_index(int arr[] , int m){
             int sum =0;
          for(int i=0;i<=m-1;i++)
          {
            if (i%2==0) {
                sum = sum+ arr[i];
            }
          }
          System.out.println(sum);
    }
     public static void main(String[] args) {
       
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of the array");
          int m = sc.nextInt();
          System.out.println("Enter the array ");
          int arr[] = new int [m];
          for(int i=0;i<=m-1;i++)
          {
            arr[i]= sc.nextInt();
          }

          even_index(arr, m);


       
       
       
        

       
          
     }
}