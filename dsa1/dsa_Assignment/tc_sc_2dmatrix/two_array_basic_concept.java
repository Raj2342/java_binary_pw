public class two_array_basic_concept {
    public static void main(String[] args) {
          int arr[][] = {
              {1,2,3},
              {4,5,6},
              {7,8,9}
          };
        int m = arr.length-1;
        
        int n = arr[0].length-1;
        // print below elment of diagonal 
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            { 
                if (i<j) {
                    System.out.println(arr[i][j]);
                }
            }
        }
        // print  anti-diagonal 
        // for(int i=0;i<=m;i++)
        // {
        //     System.out.println(arr[i][m-i]);
        // }

        // diagonal 
        // for(int i=0;i<=m;i++)
        // {
        //     System.out.println(arr[i][i]);
        // }

         // print row and colomun 
        // for(int j=0;j<=n;j++)
        // {
        //   System.out.print(" "+arr[2][j]);
        //   // System.out.print("  "+arr[1][j]);
        // }
        
        // print 2d matrix
        // for(int i=0;i<m;i++)
        // {
        //   for(int j=0;j<n;j++)
        //   {
        //      System.out.println(arr[i][j]);
        //   }
        // }
    }
}
