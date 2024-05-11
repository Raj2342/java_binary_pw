import java.util.*;
import java.util.stream.*;
public class newStream_Api {
    public static void main(String[] args) {
        
         List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);
         // stream api
        //  Stream<Integer> s1 = al.stream(); // Stream<Integer> i am writing becoz it return Stream 
         
        // Stream<Integer> s2 = s1.filter(i->i%2==0);
        // Stream<Integer> s3 = s2.map(i->2*i);
        // int result = s3.reduce(0, (a,b)-> a+b);
        //   System.out.println(result);
        // s3.forEach(i->System.out.println(i));

        // **********moderen  method********************** :
        int result = al.stream()
                   .filter(i-> i%2==0)
                   .map(i->2*i)
                   .reduce(0,(a,b)->a+b);
     System.out.println(result);


    }
}
