public class intro2 {
        public static void main(String[] args) {
            //    int  num1 = 10;
            //    int num2 = 0;
            //    int result ;
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
               try{
                    
                   System.out.println(10/0);
                   System.out.println("hi this is try");
               }
            //    catch(Exception e )
               catch(ArithmeticException e ){
                    System.out.println("value have some error " + e); // show  real errot yo user using e
               }
             
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
        }
}
