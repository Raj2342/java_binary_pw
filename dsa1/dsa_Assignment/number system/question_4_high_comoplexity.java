// tc-o(n)
//sc-o(n)-store in string 
import java.util.ArrayList;

public class question_4_high_comoplexity {
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

           int count=0;
           char[] store = b.toCharArray();
           for(int i=0;i<store.length;i++){
             if (store[i]=='1') {
                count++;
             }
           }
           System.out.println("Number of set bits: "+count);



    }
}
