   abstract class animal {
       abstract void eat();
         void play(){
            System.out.println("animal are play");
         }
 }
 class tiger  extends animal 
 {
    public void eat(){
        System.out.println("tiger eat food");
    }
 }


public class rough {
    public static void main(String[] args) {
          animal an =  new  tiger();
         an.eat();
    }

    
}
