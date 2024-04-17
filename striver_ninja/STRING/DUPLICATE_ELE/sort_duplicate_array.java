import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class sort_duplicate_array {
    public static void main(String[] args) {
        String s = "applemmom";
        HashSet<Character> seenchar = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = 0; j < s.length()-1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    seenchar.add(s.charAt(j));
                }
            }
        }
        System.out.println(seenchar);
    }
}
