import java.util.*;
import java.util.function.Function;
import java.util.stream.*;;
public class map_stream_api {
     public static void main(String[] args) {
        //   Function<Integer ,Integer > func = new Function<Integer,Integer>(){
               
        //       public Integer  apply(Integer  n){
        //            return 2*n;
        //       }
        //   };

        Function<Integer,Integer>   func = (n) ->  2*n;

          List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);
        int  result = al.stream()
                     .map(func)
                     .reduce(0, (a,b)-> a+b ); 
        System.out.println(result);                      
     }
}
