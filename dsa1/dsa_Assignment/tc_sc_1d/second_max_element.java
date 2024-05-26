import java.util.Arrays;
import java.util.Scanner;

public class second_max_element {

    public static void second_max_element_print(int arr[]){

            Arrays.sort(arr);
            System.out.println(arr[arr.length-2]);
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

         second_max_element_print(arr);
    }
}
