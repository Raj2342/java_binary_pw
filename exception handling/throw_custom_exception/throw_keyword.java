public class throw_keyword {
    public static void main(String[] args) {
          int num1 = 3;
          int num2=-2;
          int result =0;
          try{
            if (num2<0) {
                // Exception e = new Exception();
                Exception e = new ArithmeticException("it is negative number ");
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