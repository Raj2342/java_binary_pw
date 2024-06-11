public class min_element{

    public static int max_ele(int arr[],int i)
    {  
        if (i==arr.length-1) {
            return arr[i];
        }
          
        else{
            return Math.min(arr[i],max_ele(arr, i+1));
        }
      
    }
    public static void main(String[] args) {
    
      int arr[]= {22,33,4,19,7};
    int result =  max_ele(arr ,0);
    System.out.println(result);
        
    }

}
