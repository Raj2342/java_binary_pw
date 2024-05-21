public class missing_number {
    public static void main(String[] args) {
          
           int arr[] = { 1,2,4,5,6,7};
           int n=arr.length+1;
           int sum=0;
           //  sum of original+missing no.
            int sum_natural_no = n*(n+1)/2;
           
          // sum of original array 
          for(int i=0;i<arr.length;i++)
          {
               sum = sum + arr[i];
          }
          

          //missing no. 
         int result =  sum_natural_no - sum;
         System.out.println(result);
    }
}
