/* 
Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.
Input 1:
 1 2 -3 4
 0 0 -4 2
 1 -1 2 3
 -4 -5 -7 0
Output :
number of positive numbers = 7
number of negative numbers = 6
number of odd numbers = 7
number of even numbers = 9
number of 0 = 3

*/
import java.util.*;
import java.io.*;
public class  question_1 {

    public static void   NatureOfNumber(int arr[][] )
    {      
           
             int m = arr.length;
           int n = arr[0].length;
           int PositiveCount =0;
            int NegativeCount =0;
            int ZeroCount =0;
            
           for(int i=0;i<m;i++)
           {
            for(int j=0;j<n;j++)
            {
              
                
                if (arr[i][j]>0) {
                    PositiveCount++;
                }
                else if(arr[i][j]==0)
                {
                    ZeroCount++;
                }
                else if(arr[i][j]<0){
                    NegativeCount++;
                }
              

            }
           }
          
           System.out.println("number of positive number "+ PositiveCount);
           System.out.println("number of negative number "+ NegativeCount);
           System.out.println("number of zero number "+ ZeroCount);

    }

    public static void   oddEven(int arr[][] ){
        int m = arr.length;
        int n = arr[0].length;
        int EvenCount =0;
            int OddCount =0;
            for(int i=0;i<m;i++)
           {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2==0){
                    EvenCount++;
                }
                else if(arr[i][j]%2!=0){
                    OddCount++;
                }
                
              
            }
           }
           System.out.println("number of even number "+ EvenCount);
           System.out.println("number of odd number "+ OddCount);
          

    }

     
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER ROW OF MATRIX ");
         int m = sc.nextInt();
         System.out.println("Enter coloumn of matrix");
         int n = sc.nextInt();
         System.out.println("Enter element of matrix");
         int arr[][] = new int[m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
         }

        
     NatureOfNumber(arr);
     oddEven(arr);
    }
}