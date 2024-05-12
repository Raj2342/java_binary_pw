import java.util.Arrays;
import java.util.*;
import java.util.stream.*;
public class sorted {
     public static void main(String[] args) {
         List<Integer>  s1 = Arrays.asList(1,2,3,4,5,6,7);
         Stream<Integer> sortedValue = s1.stream()
           // parallelstream  use for create multi-thread and complex data  
                      .filter(i->i%2==0)
                      .sorted();
         sortedValue.forEach(i->System.out.println(i));
     }
}
