public class question_5 {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4,5},
            {3,4,5,6,7},
            {7,6,5,4,3},
            {8,7,6,5,4},
            {1,2,37,8,0}
        };
      int m = arr.length-1;
      
      int n = arr[0].length-1;
     
      
      
      for(int i=0;i<=m;i++)
         {
            
                 System.out.print(arr[i][(arr.length-1)/2] + " ");
         
    
         }

         for(int i=0;i<=m;i++)
         { 
            if (i != (arr.length-1)/2) {
               
               System.out.print(+arr[(arr.length-1)/2][i]+ " ");
            }
         }
    }
}
