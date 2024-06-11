public class max_element{

    public static int max_element_print(int arr[],int index)
    {  
         // base case condition
         if (index==arr.length-1) {
            return arr[index];
         }

        // recursion call 
       int smallerArray= max_element_print( arr ,index+1);
       if (smallerArray>arr[index]) {
        return smallerArray;
       }
       else{
        return arr[index];
       }
    }
    public static void main(String[] args) {
    
      int arr[]= {22,33,4,19,7};
      max_element_print(arr ,0);
        
    }

}
