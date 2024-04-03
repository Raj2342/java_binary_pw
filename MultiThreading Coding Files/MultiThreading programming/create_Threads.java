//  How to create Threads

class mythread extends Thread 
{
   public void run(){
    System.out.println("you are run ");
   }
}

public class create_Threads {
    public static void main(String[] args) {
      mythread t = new mythread();
      t.start();
      t.run();
          

    }
}
