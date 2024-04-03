import java.util.Scanner;
//  How to create Threads

class mythread extends Thread 
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

public class create_Threads {
    public static void main(String[] args) {
      mythread t = new mythread();
      t.start();
      t.run();
          

    }
}
