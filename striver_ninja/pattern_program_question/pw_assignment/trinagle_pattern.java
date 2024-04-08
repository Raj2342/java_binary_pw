/*
   triange based patter use my sir ji technique 
 */

public class trinagle_pattern {
    public static void main(String[] args) {
        // concept-1
        // * * * * 
        // * * * *
        // * * * *
        // * * * *
        //     int n=4;
        //    for(int i=0; i<n;i++)
        //    {
        //     for(int j=0; j<n;j++)
        //     {
        //        System.out.print("* ");
        //     }
        //     System.out.println();
        //    }

        //  concept-2
        // *     
        // * *
        // * * *
        // * * * *
        // * * * * *
        // int n=5;
        // for(int i=0; i<n; i++)
        // {
        //     for(int j=0; j<n; j++)
        //     {
        //         if (j<=i) {
                    
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // *****
        //  ****
        //   ***
        //    **
        //     *
        // obsrervation - j>=i

        // concept-3
//           * 
//         * *
//       * * *
//     * * * *
//   * * * * *                                                
    //  int n=5; 
    //    for(int i=1; i<=n; i++)
    //    {
    //     for(int j=1; j<=n; j++)
    //     {
    //         if (j>=6-i) {
    //         System.out.print("* ");
                
    //         } 
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    //    }
    
    // *****
    // ****
    // ***
    // **
    // *
    // observation : j<=6-i

//       concept-4
  int n=4;
  for(int i=1; i<=n; i++)
  {
    for(int j=1; j<=(2*n-1) ;j++)
    {
        if (j>=(n+1)-i && j<=(n-1)+i) {
            System.out.print("*");
             
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
  }





    }
}
