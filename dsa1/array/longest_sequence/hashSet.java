/*

  hashset remove dublicate  elemnt   and automataically sort array generate 

 */

import java.util.Arrays;
import java.util.HashSet;




class  hashSet {
    public static void main(String[] args) {
        int a[] = { 3,3,9,1,10,4,20,2};
        HashSet<Integer> h = new HashSet<>();
         for(int i=0; i<a.length;i++)
         {
            h.add(a[i]);
         }
         
         for(int n : h)
         {
            System.out.println(n);
         }
      
    }
}