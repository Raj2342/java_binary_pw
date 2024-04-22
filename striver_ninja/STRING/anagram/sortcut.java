import java.util.*;
public class sortcut {
     public static void main(String[] args) {
          String st1 = "LISTEN";
          String st2 = "SILENT";

       // string convert into  char array 
       char arr1[] = st1.toCharArray();
       char arr2[] = st2.toCharArray();

       // char array  sort 
       Arrays.sort(arr1);
       Arrays.sort(arr2);

       if (Arrays.equals(arr1, arr2)) {
        System.out.println("it is anagram");
       }
       else{
        System.out.println("it is not anagram ");
       }

     }
}
