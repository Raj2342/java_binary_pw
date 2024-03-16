abstract class  animal {
      
   abstract public void eat();

   abstract public void sleep();
}

class tiger extends animal
{
    public void eat(){
        System.out.println("tiger is  eat");
    }

    public void sleep(){
        System.out.println("animal is  sleep");
    }
}

class Elephent  extends animal
{
    public void eat(){
        System.out.println("Elephent  is  eat");
    }
    public void sleep(){
        System.out.println("elephent  is  sleep");
    }
}

class goat  extends animal
{
    public void eat(){
        System.out.println("goat  is  eat");
    }
    public void sleep(){
        System.out.println("goat  is  sleep");
    }
}




public class abstract1 {
        
         public static void main(String[] args) {
            animal t = new tiger();
            animal E =  new Elephent();
            animal g = new goat();
            
            // but  we cannot create object where  is abstract class- it has no body , it is incomplete class
            // animal an = new animal();
              
         }
}
