class library implements Runnable
 {
    String res1 = new String("JAVA");
    String res2 = new String("DSA");
    String res3 = new String("SQL");
  
  public void run(){
        
          String  str = Thread.currentThread().getName();
          if (str.equals("student1")) {
            try{
                  Thread.sleep(3000);
                  synchronized(res1){
                    System.out.println("student 1 accuire"+ res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                      System.out.println("student 1  accurie "+res2);
                      Thread.sleep(3000);
                      synchronized(res3){
                        System.out.println("student 1 accurie"+res3);
                      }
                    }
                  }
            }
            catch(Exception e)
            {
              System.out.println("some error");
            }
          }
          else{
            try{
              Thread.sleep(3000);
              synchronized(res3){
                System.out.println("student 2 accuire"+ res3);
                Thread.sleep(3000);
                synchronized(res2){
                  System.out.println("student 2  accurie "+res2);
                  Thread.sleep(3000);
                  synchronized(res1){
                    System.out.println("student 2 accurie"+res1);
                  }
                }
              }
        }
        catch(Exception e)
        {
          System.out.println("some error");
        }
          }
       
    }
     


}



public class rough{
  public static void main(String[] args) {
    library lib = new library();
      Thread t1 = new Thread(lib);
      Thread t2 = new Thread(lib);

      t1.setName("student1");
       t2.setName("student2");

       t1.start();
       t2.start();

  }
}