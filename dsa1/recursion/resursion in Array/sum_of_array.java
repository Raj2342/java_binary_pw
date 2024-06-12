public class sum_of_array {

    public static int sum_array(int arr[], int i){
        if (i==arr.length-1) {
            return arr[i];   
        }
        else{
            return arr[i]+ sum_array(arr,i+1);
        } 
    }
    public static void main(String[] args) {
          
          int arr[]= { 10,20,30}; 
        int a=  sum_array(arr,0);
        System.out.println(a);
    }
}
