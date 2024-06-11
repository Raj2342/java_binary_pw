import java.util.Scanner;

public class rough {

    public static void recursion_Array(int arr[] , int i, int n)
    {
          if (i==n) return ;

          else{
            System.out.println(arr[0]+" ");
            recursion_Array(arr, i+1, n);
          }
          
    }
    public static void main(String[] args) {
         
           int i =0;
        
          int arr[]={3,7,2,6,8};
          int n=arr.length;
         
      

    }
}
