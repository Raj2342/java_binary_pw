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
          int count =0;
          int posivecount = 0;
          for(int i=0; i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                if (arr[i][j]%2==0) {
                    count++;
                }
                else if(arr[i][j]%2 !=0){
                    posivecount++;
                }
            }
          }
          System.out.println(count);
          System.out.println(posivecount);
    }
}
