// cretae own  exception 
class MyException extends Exception
{
     
       public MyException(){

       }

       public MyException(String msg){
          super(msg);
       }
}





public class custom_keyword {
    public static void main(String[] args) {
          int num1 = 3;
          int num2=-2;
          int result =0;
          try{
            if (num2<0) {
                // Exception e = new Exception();
                Exception e = new MyException("it is negative number ");
                throw e;
            }
            else{

                result = num1 /num2 ;
            }
          }
          catch(Exception e)
          {
            System.out.println("error"+ e);
          }
          System.out.println(result);
    }
}