import java.io.*;

  class animal {
        
     String  name;
     int age ;
    
     animal(String name , int age )
     {
         this.name = name;
         this.age= age;
     }

    
  }
public class bro {
     public static void main(String[] args) {
        animal an = new animal("RAJ",28);
        System.out.println(an.name+" "+ an.age);

            
     }
}
