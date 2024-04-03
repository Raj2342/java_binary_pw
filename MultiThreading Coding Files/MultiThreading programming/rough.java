/*
 * thread by implementing runnable interface 
 */

import java.util.Scanner;
 class  calc  implements Runnable
 {
     public void run(){
      System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");
     }
 }

 class message  implements Runnable
 {
       public void run(){
        System.out.println("Displaying important message task");
        try{
          for(int i=0;i<3;i++)
          {
              System.out.println("Focus is important to master skills");
              Thread.sleep(5);
          }

        }
        catch(Exception e)
        {
          System.out.println("error");
        }
       

        System.out.println("Displaying import message task ended");
       }
 }


public class rough {
  public static void main(String[] args) {
       calc t1 = new calc();
       message t2 = new message();

       Thread c1 = new Thread(t1);
       Thread c2 = new Thread(t2);
       c1.start();
       c2.start();

  }
}