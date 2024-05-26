import java.util.Scanner;

public class max_element {

       public static void max_element_print(int arr[]){
             
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

          max_element_print(arr);
    }
}
