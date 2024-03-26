// canot create a  object 
abstract class animal {
    
      abstract void eat();
      abstract void sleep();
  
      void play(){
          System.out.println("animal is play");
      }
      
  }
  
  class tiger  extends animal
   {
      void eat(){
          System.out.println("tiger is eating ");
      }
      void sleep(){
          System.out.println("tiger is sleeping ");
      }
  }
  
  class dog   extends animal
   {
      void eat(){
          System.out.println("dog is eating ");
      }
      void sleep(){
          System.out.println("dog is sleeping ");
      }
  }
  
  class cat  extends animal {
      void eat(){
          System.out.println("cat is eating ");
      }
      void sleep(){
          System.out.println("cat is sleeping ");
      }
  }
  
  public class abstraction {
      public static void main(String[] args) {
          
             animal c = new cat();
             c.eat();
      }
  }
  