import java.util.Scanner;

public class palindrome_no {
     public static void main(String[] args) {
           
         int n , r=0,s=0 ,c;
         System.out.println("Enter a number ");
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         c=n;
         while (n>0) {
              r = n%10;
              s = (s*10)+r;
              n=n/10;
         }
         if(c==s){
           System.out.println("palindrome number ");
         }
         else {
            System.out.println(" NOT palindrome number ");
         }
     }
}
