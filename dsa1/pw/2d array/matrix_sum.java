public class matrix_sum {
    public static void main(String[] args) {
          int arr[][] = {
               {1,1,1},
               {1,1,1},
               {1,1,1},
               {1,1,1}
          };
        int m= arr.length;
        System.out.println(m);
        int n = arr[0].length;
        System.out.println(n);
        int sum =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                   sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
         
    }
}
