 /**
  * constructor executionin case of inheritance 
  */
  class Animal 
  {
      int x ,y;
    Animal()
    {
          System.out.println("animal sleep");  
    }
   
    Animal(int x , int y)
    {
        System.out.println("animal parametrr");
    }
 }

 class tiger  extends Animal
 {
      int m , n;
      tiger()
      {
        this(10,23);// this call int this construtor 
        System.out.println("tiger sleep");
      } 
      
      tiger(int m, int n){
        super(2,4);
        System.out.println("tiger parameter");
      }
 }
 
 
 public class constructor_inheritance

 {
      public static void main(String[] args) {
        tiger t = new tiger(3,4);
        
      }
 }