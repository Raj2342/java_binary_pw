@FunctionalInterface
interface animal {
   void show();
   
   
}

public class lambda_expression {
   public static void main(String[] args) {
       //  animal a = new animal() {
       //     public void show(){
       //         System.out.println("it is show method");
       //     }
       //  };

       // lambda expression 
         animal a = () -> 
           {
               System.out.println("it is show method");
           };
        
     

        a.show();
    

     
   }
}
