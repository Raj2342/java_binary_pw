import java.util.HashSet;

/**
 * find common element using hash set 
 */
public class hash_set {

       public static void main(String[] args) {
           
        int a[] = { 4,3,5,7,9,2,4};
        int b[] = { 5,1,4,8,3,5};
        HashSet<Integer>  h = new HashSet<>();
        for(int i=0; i<a.length-1; i++){
               for(int j=0;j<b.length-1;j++){
                   if (a[i]==b[j]) {
                   h.add(a[i]);
                }
               }
           }

           for(int val:h){
            System.out.println(val);
           }
       }
    
}