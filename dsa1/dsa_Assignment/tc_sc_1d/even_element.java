import java.util.Scanner;

public class even_element {

    public static void even_element_print(int arr[] ){
        for(int i:arr){
            if (i%2==0) {
                
                System.out.println(i);
            }
           }
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

          even_element_print(arr);
        
        
        
        
        
    }
}
