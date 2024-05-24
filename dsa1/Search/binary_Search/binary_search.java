import java.util.Scanner;

public  class binary_search {
    
         public  static int  binarySearch(int arr[] , int x )
         {      
               int lowIndex =0 , highIndex =arr.length-1;
        
              
              
              while (lowIndex<=highIndex) {
                //step-1
                int midIndex =( lowIndex + highIndex )/2;
                  if(arr[midIndex]==x)
                  {
                       return midIndex;
                }

                  else if(arr[midIndex]<x)
                  {
                    lowIndex = midIndex+1;
                  }
                  else if(arr[midIndex]>x)
                  {
                    highIndex=midIndex-1;
                  }
              }

            return 0;
        


         }
      public static void main(String[] args) {
          Scanner sc  = new Scanner(System.in);
          System.out.println("Enter the size of array");
          int size = sc.nextInt();
          System.out.println("Enter the target value");
          int x = sc.nextInt();
          System.out.println("Enter  sorted array ");
          int arr[] = new int[size];
          for(int i=0;i<size;i++)
          {
            arr[i]=sc.nextInt();
          }

         int result =  binarySearch(arr,x);

         if (result==0) {
            System.out.println("Search element not found ");
         }
         else{
            System.out.println("Search element found"+ result);
         }
      }
}