//  final  methid : no one can  override in child class 
 class animal {
      int a =45;
     final void eat(){
        a=33;
        System.out.println("animal eating");
    }
}

class cat extends animal
 {
      void eat(){
        System.out.println("animal eating");
      }
}


public class final_method {
        public static void main(String[] args) {
            cat c = new cat();
            c.eat();
        }
}
