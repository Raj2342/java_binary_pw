import java.util.*;
import java.util.stream.Stream;
public class Stream_API {
     public static void main(String[] args) {
          List<Integer> al =  Arrays.asList(2,4,5,6,7,8);
          System.out.println(al);
          int result =0;
          for(int i : al)
          {
                // two operation perform   double of even number and  addition 
               if(i%2==0){
                   i = 2*i;
                   result = result+i;
               }
          }
          System.out.println(result);
           
     }
}
