    // CUSTOME  exception 

import java.util.Scanner;

class rajException extends Exception
{
    rajException(){

    }
    rajException(String s){
        super(s);
    }
}

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first no.");
     int num1=sc.nextInt();
     System.out.println("enter second no.");
     int num2=sc.nextInt() ;
     int result=0 ;
     
     try{
     if (num2<=0) {
         System.out.println("negative and zero value not acceptable ");
     }
      else
      {
         result =   num1/num2;
         System.out.println(result);
      }
    
    }
    catch(Exception e)
    {
        System.out.println("cannot by zero");
    }

    }
}
