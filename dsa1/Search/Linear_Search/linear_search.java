import java.util.*;
import java.io.*;
public class linear_search {
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of the array ");
          int size = sc.nextInt();
          System.out.println("Enter element of array ");
          int arr[] = new int[size];

          for(int i=0;i<size;i++)
          {
            arr[i]=sc.nextInt();
          }

          System.out.println("Enter target element ");
          int target = sc.nextInt();
        int index = -1;
          for(int i=0;i<size;i++)
          {
             if(arr[i]==target)
              {
                index = i;
              }
             
          }

          if (index==-1) {
            System.out.println("searching element not found ");
          }
          else{
            System.out.println("Searching element found "+ index);
          }
    }
}