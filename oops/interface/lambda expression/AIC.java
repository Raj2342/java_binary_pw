interface animal {
    void show();
    // void play();
 }

 interface human {
   void eat();
 }


public class AIC {
    public static void main(String[] args) {
         animal a = new animal() {
            public void show(){
                System.out.println("it is show method");
            }
         };

         a.show();
     // wrong - annonmous use only one time 
        //  animal a = new animal()  {
        //     System.out.println("play");
        //  };
        //  a.play();

        human h =  new human() {
           public void eat(){
            System.out.println("human eat food ");
           }
        };
        h.eat();
    }
}
