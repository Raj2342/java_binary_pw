  class animal implements Runnable
  {
       public void run(){
        try{

        
           System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
           Thread.sleep(2000);
           System.out.println(Thread.currentThread().getName() + " got into car to drive");
           Thread.sleep(2000);
           System.out.println(Thread.currentThread().getName() + " started to drive the car");
           Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
           
       }
  }
 
 
 public class problem {
    public static void main(String[] args){
              animal an = new animal();

              Thread t1 = new Thread(an);
              Thread t2 = new Thread(an);
              Thread t3 = new Thread(an);
              t1.setName("son1");
              t2.setName("son2");
              t3.setName("son3");
              t1.start();
              t2.start();
              t3.start();
    }
 }