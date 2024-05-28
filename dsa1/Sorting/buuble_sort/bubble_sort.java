import java.util.Arrays;

public class bubble_sort {
        
       public static void  play(int arr[] ) 
       {
               for(int i=0; i<arr.length; i++){
                      boolean swapped = false;
                     for(int j=0; j<arr.length-i-1; j++){
                             if (arr[j]>arr[j+1]) {
                              int  temp = arr[j+1];
                                arr[j+1]= arr[j];
                                arr[j]= temp;

                                swapped = true;

                             }
                     }

                     if (!swapped) {
                        break; // go out of for loop 
                     }
                 } 
              
       }
       
       public static void main(String[] args) {
                  
              int arr[] = { 7,8,3,1,2 , 4 ,6 ,3 };
             //function calling  
              play(arr);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(arr));

                
        }
}
