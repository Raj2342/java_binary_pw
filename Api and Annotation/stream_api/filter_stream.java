import java.util.*;
import java.util.function.Predicate;
public class filter_stream {
    public static void main(String[] args) {
         
        
          
         // filter- object predicate 
         //predicate is functional interface it use annymous function and  lambda function 

    //  Predicate<Integer> pd = new Predicate<Integer>()
    //    {
        //   public boolean  test(Integer n){
        //          if (n%2==0) 
        //             return true;
        //          else 
        //              return false ;  
                 
        //   }        ↓↓↓↓↓↓↓↓
         
    //     public boolean  test(Integer n){
    //             return  n%2==0 ;
    //     }        
           
    //    };
              
                // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    List<Integer> al = Arrays.asList(1,2,3,4,5,6,7);
    Predicate<Integer> pd = (n)-> n%2 ==0;

    int result =  al.stream()
                 .filter(pd)
                 .reduce(0, (a,b)-> a+b);
                 System.out.println(result);
                 



    
    

    
    
    }
}
