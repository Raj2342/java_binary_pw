import java.util.*;
import java.util.function.Consumer;
import java.util.*;
public class for_each {
    public static void main(String[] args) {
        //  List<Integer> list1 = new ArrayList<Integer>();
        //  list1.add(10);
        //  list1.add(20);
        //  list1.add(30);
        //  list1.add(40);
        //  System.out.println(list1);

         //  in built method for storeing data in : asList()
         List<Integer> list2 = Arrays.asList(10,20,30,40);
         System.out.println(list2);

        //  for(int i:list2){
        //     System.out.println(i);
        //  }

     // in built method of forEach()
    //  list2.forEach(null);
       
    //    Consumer<Integer> con = (i)->  System.out.println(i);
                

       list2.forEach((i)->  System.out.println(i));     
       

    }
}
