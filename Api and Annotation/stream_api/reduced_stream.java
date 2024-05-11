import java.util.function.BinaryOperator;
import java.util.*;
import java.util.stream.*;
public class reduced_stream {
    public static void main(String[] args) {
           
        //  BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
        //       int  result =0;
        //      public Integer  apply(Integer c , Integer  e){
        //             return  result+c+e;
        //      }
        //  };   

         // lambda expression 
         int  result =0;
         BinaryOperator<Integer> bo = (c,e)->  result+c+e;
         List<Integer> s1 = Arrays.asList(1,2,3,4,5,6);
         int store = s1.stream()
                    .reduce( result, bo);
        System.out.println(store);


    }
}
