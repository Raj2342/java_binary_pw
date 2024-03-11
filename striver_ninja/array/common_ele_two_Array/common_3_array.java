import java.util.ArrayList;

public class common_3_array {
      public static void main(String[] args) {
        
          int a[] = { 2,3,4,5};
          int b[] = { 3,2,4,8};
          int c[] = { 8,2,4,7};
     ArrayList<Integer> arr = new ArrayList<>();
     // compare btw array a and  b
          for(int i=0; i<a.length-1;i++){
            for(int j=0; j<b.length-1;j++){
                if (a[i]==b[j]) {
                    arr.add(a[i]);
                  
                }
            }
          }
          System.out.println("it is terminal array: "+arr);
          // compare btw array arr and  c
          for(int n:arr){
            for(int n1:c){
                if (n==n1) {
                    System.out.println(n1);
                }
            }
          }
         

          
      }
}
