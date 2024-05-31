/*Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
Input 1: n = 15
Output 1: False
Input 2: n = 32
Output 2: True
*/
public class question_2 {

        public static boolean  pow2(int n)
        {
            
            if(n==0)
            {
             return false;
            }
            return (n & (n-1) )==0;
        }
     public static void main(String[] args) {
       boolean result = pow2(16);
       System.out.println(result);


     }
}
