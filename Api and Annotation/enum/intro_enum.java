import java.util.*;

enum week {
     MON, TUES , WED , THURS , FRI , SAT , SUN;
}


public class  intro_enum {
    
    enum  Result {
        PASS , FAIL , NR;
    }

    public static void main(String[] args) {
          
         week w = week.MON;
         System.out.println(w); 

         int  index = week.MON.ordinal();
         System.out.println(index);

         Result r = Result.PASS;
         System.out.println(r);

         // create array of contants 
         week arr[] = week.values();
         for(week n : arr){
            System.out.println(n);
         }

    }
}