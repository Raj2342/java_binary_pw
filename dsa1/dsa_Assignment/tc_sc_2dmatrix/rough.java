public class rough {
    public static void main(String[] args) {
          int arr[][] = {
            {1, 2, -3, 4},
            { 0, 0, -4 ,2},
             {1, -1 ,2, 3},
            {-4 ,-5 ,-7 ,0}
          };
          int m = arr.length;
          int n= arr[0].length;

          int PositiveCount =0;
          int NegativeCount =0;
          int ZeroCount =0;
          int EvenCount =0;
          int OddCount =0;
          for(int i=0; i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2==0){
                    EvenCount++;
                }
                else if(arr[i][j]%2!=0){
                    OddCount++;
                }
                
               else if (arr[i][j]>0) {
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
         
          System.out.println("number of even number "+ EvenCount);
           System.out.println("number of odd number "+ OddCount);
           System.out.println("number of positive number "+ PositiveCount);
           System.out.println("number of negative number "+ NegativeCount);
           System.out.println("number of zero number "+ ZeroCount);
    }
}
