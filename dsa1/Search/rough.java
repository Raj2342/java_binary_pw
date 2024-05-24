public class rough {
    public static void main(String[] args) {
         
        int arr[] = { 2,4,7,7,9,11,12};
         int li=0;
         int hi = arr.length-1;
         while (li<hi) {
           int  midI = (li+hi)/2;
           if (arr[midI]==7) {
              System.out.println(midI);
              break; oo           }
            
         }
    }
}
