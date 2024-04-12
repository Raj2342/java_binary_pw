import java.util.Arrays;

public class rough {
        public static int  play(int a[]){
            
            int temp;
              for(int i=0; i<a.length-1;i++)
              {
                for(int j=0;j<a.length-1-i;j++)
                {
                    if (a[j]<a[j+1]) {
                        temp=a[j+1];
                        a[j+1]=a[j];
                        a[j]=temp;
                    }
                }
              }
              return a[a.length-2];
        }
    public static void main(String[] args) {
         
            int a[] = { 4,3,5,2,1,6};
            play(a);
            System.out.println(Arrays.toString(a));
            System.out.println(play(a));

    }
}