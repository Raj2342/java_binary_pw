/* ***********************************************************
 polymorphis = method overloading and method overriding 
 **************************************************************/

class  animal {
      
    public void eat(){
        System.out.println("animal is  eat");
    }

    public void sleep(){
        System.out.println("animal is  sleep");
    }
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

class  grassland 
 {
          
        public void poly( animal an) {
               // animal an = new tiger();
               // animal an = new Elephent();
               // animal an = new goat();
               an.eat();
               an.sleep();
               System.out.println("----------");
        }
}


public class polymorphism_2 {
        
         public static void main(String[] args) {
            tiger t = new tiger();
             Elephent E =  new Elephent();
             goat g = new goat();
             grassland an = new grassland();
                an.poly(t);
                an.poly(E);
                an.poly(g);
              
         }
}
