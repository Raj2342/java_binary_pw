interface a {
      void show();
      default  void play()
      {
      System.out.println(" it is play , it is non- static method ");
      }

      static void cut(){
         System.out.println("it is static method");
      }
}

class  b implements a 
{
  public void show(){
    System.out.println("it is show method");
  }

}


public class java8_features {
     public static void main(String[] args)
      {
         a.cut();
        //  b bro = new b();
        //  bro.show();
     }
}
