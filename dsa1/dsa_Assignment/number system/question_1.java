/*Problem 1: given a number, print its binary representation. [easy]
Input 1: number = 5
Output 1: 101
Input 2: number = 10
Output 2: 1010
*/
public class question_1{
    public static void main(String[] args) {
    
           String b= " ";
           int n=10;
           int t=n;
           while(t>0)
           {
            int r=t%2;
            t=t/2;
            b= r+b;
           }
           System.out.println(b);
           System.out.println(n);
    }
}
