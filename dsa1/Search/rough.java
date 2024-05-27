import java.util.*;
import java.io.*;
public class rough {

     public static int first_occurance_print(int arr[] , int target)
     {      
            int result =0;
            int li=0;
            int hi=arr.length-1;

            while (hi>=li) {
               
               int mid = (li+hi)/2;
               

                if(arr[mid]==target)
                {
                    result = mid;
                    hi=mid-1; 
                }
                else if (arr[mid]<target) {
                     li= mid+1;
                }
                else if (arr[mid]>target) {
                    hi=mid-1;
                }
            }

            return result;
     }
    public static void main(String[] args) {
     
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the size of array ");
          int size = sc.nextInt();
          System.out.println("Enter the target elemnt ");
          int target = sc.nextInt();
          System.out.println("Enter the array");
          int arr[] = new int[size];
          for(int i=0;i<size-1;i++)
          {
            arr[i]= sc.nextInt();
          }

        int store=  first_occurance_print(arr,target);
        if (store==0) {
            System.out.println("Not find first occurance element  ");
        }
        else{

            System.out.println("first occurance element find "+store);
        }


    }
}
