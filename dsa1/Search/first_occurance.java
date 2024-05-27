public class first_occurance {
    public static void  main(String[] args) {
          int result =0;
          int arr[] = { 2,4,7,7,9,9,9};
          int target = 9;
          int li=0;
          int hi = arr.length-1;
          while (li<=hi) {
            int mid = (li+hi)/2;
            if (arr[mid]==target) {
               result = mid;
                hi = mid-1;
            }
            else if(arr[mid]<target)
            {
              li= mid+1;
            }
            else if(arr[mid]>target)
            {
              hi= mid-1;
            }
          }
          
          System.out.println(result);
          
            
          
          
          

    }
}