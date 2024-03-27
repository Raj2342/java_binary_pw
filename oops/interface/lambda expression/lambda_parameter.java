@FunctionalInterface
interface animal {
   // for one parameter
 // void show(int a);
 // for two parametr 
 void show(int a , int b );

   
   
}




public class lambda_parameter {
   public static void main(String[] args) {
      
        // lambda expression
        // one parameter 
         // animal an = a -> 
         //   {
         //       System.out.println("it is show method"+a);
         //   };
        
       //  two paramter 
         animal an = (a,b)-> {
           System.out.println("it is two paramter show method"+" "+ a+" "+b);
         };

        an.show(4,4);
    

     
   }
}
