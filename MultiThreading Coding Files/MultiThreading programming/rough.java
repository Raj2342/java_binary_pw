import java.util.Scanner;

class  Mythread  extends Thread
{
      public void run(){
       String s =   Thread.currentThread().getName();
       System.out.println(s);
       if (s.equals("CALC")) {
           calc();
       }
       else{
          meaasage();
       }
      }

      public void calc(){
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");
        sc.close();
      }

      public void meaasage(){
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
       

        System.out.println("Displaying import message task ended");

      }
}


public class rough {
  public static void main(String[] args) {
    // Mythread t = new Mythread(); //it is  equivalent to Thread 
    Thread t1 = new Thread();

    Thread t2 = new Thread();
  
      // give name of thread 
    t1.setName("CALC");
    t2.setName("meaasage");



  }
}