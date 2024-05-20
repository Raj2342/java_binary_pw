/*
 *  concept use revese a number 
 */

public class palindrom_prog {
      public static void main(String[] args) {
             int n = 543 ;
             int r ;
             while (n>0) {
               r=n%10;
               System.out.println(r);
               n=n/10;
             }
             
      }
}