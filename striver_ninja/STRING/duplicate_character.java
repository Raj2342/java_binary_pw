import java.util.ArrayList;

public class duplicate_character {
     public static void main(String[] args) {
           String s = "MADAM";

           for(int i=0;i<s.length()-1;i++)
           {
            if (s.charAt(i) == s.charAt(i+1)) {
                System.out.println("otuput"+s.charAt(i));
            }
           }
        //    System.out.println(a);
     }
}
