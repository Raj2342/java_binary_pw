// n=5 --> 1+2-3+4-5
public class Alternatesign {

    public static int sign(int n)
    {
        if (n==1 || n==0) {
            return n;
        }
        else if (n%2 !=0 ) {
              return sign(n-1)-n;
        }
        else{
            return sign(n-1)+n;
        }
    }
    public static void main(String[] args) {
          
          int n =5;
         int result = sign(n);
         System.out.println(result);
    }
}
