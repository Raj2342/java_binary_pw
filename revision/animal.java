   import java.util.*;
    class tiger{
       int age ;
       String name ;
      
       tiger(int age , String name ){
            this.age = age;
            this.name = name;

        }
   }
   
   public class  animal {
     public static void main(String[] args) {
      tiger an = new  tiger(18,"mohan");
          System.out.println(an.name+" "+an.age);
          
     }
   }