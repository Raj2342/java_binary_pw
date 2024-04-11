import java.util.Arrays;
 
   
 
public class rough {
    public static void play( int a[] )
    {
        int temp;
        for(int i=0; i<a.length-1;i++)
        {
           for(int j=0;j<a.length-1-i;j++)
           {
               if (a[j]>a[j+1]) {
                   temp = a[j+1];
                   a[j+1]= a[j];
                   a[j]=temp;
               }
           
           }
        }
        
    }
    public static void main(String[] args) {
        int n=5;
         int a[] = {7,8,3,1,2};
        
        play(a);
        System.out.println(Arrays.toString(a));


         
    }
}