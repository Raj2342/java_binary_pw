public class rough {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
      int m = arr.length-1;
      
      int n = arr[0].length-1;
      
      for(int i=0;i<=m;i++)
         {
            for(int j=0; j<=n;j++)
            {
                 if (i==j ) {
                    System.out.println(arr[i][j]);
                 }
                 else if (i+j==m){
                    System.out.println(arr[i][j]);
                 }
            }
         }
    }
}
