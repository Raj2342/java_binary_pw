import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public  class max_min {
    public static void main(String[] args) {
           ArrayList<Integer>  store = new ArrayList<>();
        int arr[] = { 2,-4,5,6,7,-11};
           Arrays.sort(arr);

           for(int i: arr){
            store.add(i);
           }
           System.out.println(store);

           // print first elemnt  
           System.out.println(store.get(1));
           // print last element 
           System.out.println(store.get(store.size()-2));
        



    }
}