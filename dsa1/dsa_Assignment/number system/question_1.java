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
