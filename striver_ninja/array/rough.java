import java.util.Arrays;

public class rough {
      
    public static void main(String[] args) {
         int a[] = {1,2,2,3,4,4,5};
         for(int i=0;i<a.length-1;i++)
         {
            if (a[i]==a[i+1]) {
                System.out.println(a[i]);
            }
         }
           

    }
}