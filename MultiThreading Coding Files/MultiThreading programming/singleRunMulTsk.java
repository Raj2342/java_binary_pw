import java.util.Scanner;

class animal  extends Thread
{ 
       public void run(){
           String str = Thread.currentThread().getName();
            if (str.equals("meme")) {
              calculation();
            }
            else{
               meassage();
            }
       }

       public void meassage(){
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

       

       public void calculation(){
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("****************************************************");
        sc.close();    
       }
  }
 
 
 public class singleRunMulTsk {
     public static void main(String[] args) {
          animal an1 = new animal();
          animal an2 = new animal();
          an1.setName("meme");
          an2.setName("calu");

          an1.start();
          an2.start();
        
     }
}