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
                    //       *   
                    //      ***
                    //     *****
                    //    *******
//   int n=4;
//   for(int i=1; i<=n; i++)
//   {
//     for(int j=1; j<=(2*n-1) ;j++)
//     {
//         if (j>=(n+1)-i && j<=(n-1)+i) {
//             System.out.print("*");
             
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
//   }

//    concept-5

// complex structure
// * * * * * 
// * *   * *
// *   *   *
// * *   * *
// * * * * *
  
// int n=5;
// for(int i=0; i<n; i++)
// {
//   for(int j=0; j<n ;j++)
//   {
//       if (i==0 || i==(n-1) || j==0 || j==(n-1) || i==j || i+j==(n-1)) {
//           System.out.print("* ");
           
//       }
//       else{
//           System.out.print("  ");
//       }
//   }
//   System.out.println();
// }

//   concept-6
// * * * * * * * * * * 
// * * * *   * * * * *
// * * *       * * * *
// * *           * * *
// *               * *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// int n=10;
// for(int i=0; i<n; i++)
// {
//   for(int j=0; j<n ;j++)
//   {
//       if (i==0 || i==(n-1) || j==0 || j==(n-1) || i+j<=(n-1)/2  ||i-j>=(n-1)/2 ||j-i>=(n-1)/2 || j+i>=(n-1)+(n-1)/2 ) {
//           System.out.print("* ");
           
//       }
//       else{
//           System.out.print("  ");
//       }
//   }
//   System.out.println();
// }


    //   concept-11
    // * * * * * * * * * * 
    // *     * * *       *
    // *   * * * * *     *
    // * * * * * * * *   *
    // * * * * * * * * * *
    // * * * * * * * * * *
    // *   * * * * * *   *
    // *     * * * *     *
    // *       * *       *
    // * * * * * * * * * *
//     int n=10;
// for(int i=0; i<n; i++)
// {
//   for(int j=0; j<n ;j++)
//   {
//       if (i==0 || i==(n-1) || j==0 || j==(n-1) || i+j>=(n-1)/2 &&  i<=(n-1)/2 &&  j-i<=(n-1)/2  ||i-j<=(n-1)/2 && i>=(n-1)/2 && j+i<=(n-1)+(n-1)/2 ||j-i==(n-1)/2 || j+i==(n-1)+(n-1)/2 ) {
//           System.out.print("* ");
           
//       }
//       else{
//           System.out.print("  ");
//       }
//   }
//   System.out.println();
// }


    // concept-12
//     int n=10;
// for(int i=0; i<n; i++)
// {
//   for(int j=0; j<n ;j++)
//   {
//       if (j==0 || j==(n-1) || i==(n-1) || ) {
//           System.out.print("* ");
           
//       }
//       else{
//           System.out.print("  ");
//       }
//   }
//   System.out.println();
// }

// concept-13
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// int n=5;
// for(int i=1; i<=n; i++)
// {
//   for(int j=1; j<=2*n ;j++)
//   { 
//       if (j<=i || j>=(2*n+1)-i  ) {
//           System.out.print("*");
           
//       }
//       else{
//           System.out.print(" ");
//       }
//   }
  
  
//   System.out.println();
// }

//   CONCEPT-14 
// 1    
// 12
// 123
// 1234
// 12345
//    int n =5;
//    for(int i=1; i<=n;i++)
//    {
//       for(int j=1; j<=n;j++)
//      {
//         if (j<=i) {
//             System.out.print(j);
//         }
//         else{
//             System.out.print(" ");
//         }
//       }
//       System.out.println();
//    }

    //   concept-15
    // 12345
    // 1234
    // 123
    // 12
    // 1
    int n =5;
    for(int i=1; i<=n;i++)
    {
       for(int j=1; j<=n;j++)
      {
         if (j<=(n+1)-i) {
             System.out.print(j);
         }
         else{
             System.out.print(" ");
         }
       }
       System.out.println();
    }


        
    }
}
