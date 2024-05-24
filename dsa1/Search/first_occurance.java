public class first_occurance {
    public static void  main(String[] args) {
          
          int arr[] = { 2,4,7,7,9,11,12};
          int li=0;
          int hi = arr.length-1;
          while (li<hi) {
            int mid = (li+hi)/2;
            if (arr[mid]==7) {
                hi = mid-1;
                System.out.println(hi);
            }
            li++;
            
          }
          
          

    }
}