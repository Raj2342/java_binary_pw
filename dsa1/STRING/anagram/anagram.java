import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
         String s1 = "listen";
         String s2 = "silent";
        char s1arr[] =  s1.toCharArray();
        char s2arr[] =  s2.toCharArray();
        char temp1;
        char temp2;
         
        //  sorting  of s1
        for(int i=0;i<s1arr.length-1;i++)
        {
            for(int j=0;j<s1arr.length-1;j++)
            {
                if (s1arr[j]>s1arr[j+1]) {
                    temp1 = s1arr[j+1];
                    s1arr[j+1] = s1arr[j];
                    s1arr[j] = temp1;

                }
            }
        }
        System.out.println(s1arr);
       

        // sort of s2
        for(int i=0; i<s2arr.length-1;i++)
        {
            for(int j=0;j<s2arr.length-1;j++)
            {
                  if (s2arr[j] > s2arr[j+1]) {
                      temp2 = s2arr[j+1];
                      s2arr[j+1] = s2arr[j];
                      s2arr[j]= temp2;

                  }
            }
        }
        System.out.println(s2arr);
      

         if (Arrays.equals(s1arr, s2arr)) {
            System.out.println("it is anagram");
         }
         else{
            System.out.println("it is not anagram");
         }
    }
}
