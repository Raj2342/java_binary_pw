import java.util.*;
public class duplicate_find {
    public  static void main(String[] args){
        ArrayList<Integer> store = new ArrayList<>();
           int arr[] = { 1,3,2,5,1,3,2,9};
           //sort 
           Arrays.sort(arr);
           for(int i=0;i<arr.length-1;i++)
           {
              
            if (arr[i]==arr[i+1]) {
                store.add(arr[i]);
            }
          }
           System.out.println(store);
    } 
}
