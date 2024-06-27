
// n=5--> 1-2+3-4+5
public class alternate_sign{

    public  static int  alternate(int n)
    {
           // base condituion 
            if (n==0 || n==1) {
                return n;
            }
            else if (n%2==0) {
                return  alternate(n-1)-n;

            }
            else {
                return alternate(n-1)+n;
            }

            


           // recursion  call
    }
    public static void main(String[] args) {
          
           int n=7;
       int result =  alternate(n);
       System.out.println(result);
    }
}