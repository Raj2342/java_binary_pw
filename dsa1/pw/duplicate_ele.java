import java.util.Arrays;

public class duplicate_ele {
    public static void main(String[] args) {
          int  arr[] = { 1,2,3,5,3,2,4,7,1,10};
          Arrays.sort(arr);
          for(int i=0;i<arr.length-1;i++)
          {
            if (arr[i]==arr[i+1]) {
                System.out.println(arr[i]);
             
            }
          }
          
    }
}
