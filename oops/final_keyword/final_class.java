//  final : no one can inherit from parents 
 final class animal {
    void eat(){
        System.out.println("animal eating");
    }
}

class cat extends animal
 {
     
}


public class final_class {
        public static void main(String[] args) {
            cat c = new cat();
            c.eat();
        }
}
