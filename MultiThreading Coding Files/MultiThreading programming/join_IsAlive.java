class animal implements  Runnable  
  {
     public void run(){
         try{

           for(int i=0; i<2;i++){
                 System.out.println("i love you ");
                 Thread.sleep(3000);
               }

         } 
         catch(Exception e){
          System.out.println("some problem ");
         }
     }
}



public class join_IsAlive {
  public static void main(String[] args) 
  {
     System.out.println(" start main  thread ");
     animal an = new animal();
    

     Thread t = new Thread(an);
    //  System.out.println(t.isAlive()); // false it is not  alive 
      
     t.start();

     System.out.println(t.isAlive()); // true it is   alive 
     
     try{

       t.join();
     }
     catch(Exception e)
     {
      System.out.println("join error");
     }
     

     System.out.println("end main thread ");
  }
}