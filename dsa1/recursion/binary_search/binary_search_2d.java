// binary serach in 2d array
public class binary_search_2d {

    public static boolean binary_2d(int arr[][], int target)
    {
          int m = arr.length;
          int n = arr[0].length;
          int low =0;
          int high=m*n-1;
          int mid=0;
          int  midElement =0;
          while (high>=low) {
              mid = low+(high-low)/2;
              midElement= arr[mid/n][mid%n]; // important 
              if (midElement==target) {
                return true;
              }
              else if (midElement<target) {
                  low=mid+1;
              }
              else{
                high=mid-1;
              }
          }
          return false;
    }
    public static void main(String[] args) {
        
          int arr[][]= {
            {1,3,5,7},{10,11,16,20},{ 23,30,34,60}
          };
          
          int target = 20;

        boolean result =  binary_2d(arr , target);
        System.out.println(result);
    }
}