public class  Assignment_patter {
    public static void main(String[] args) {
      
      //  concept-1
      // *****
      // *****
      // *****
      // *****
      // *****
      //  for(int i=0; i<5;i++)
      //  {
      //     for(int j=0; j<5; j++)
      //     {
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //  }

      //   concept-2
      // *****
      // *   *
      // *   *
      // *   *
      // *****
      // int n =5;
      // for(int i=0; i<5;i++)
      // {
      //    for(int j=0; j<5; j++)
      //    {
      //       if (i==0 || i==(n-1) || j==0 || j==(n-1) ) {
               
      //          System.out.print("*");
      //       }
      //       else{
      //          System.out.print(" ");
      //       }
      //    }
      //    System.out.println();
      // }
       
   //   concept-3
   // *****
   // *   *
   // *****
   // *   *
   // *   *
   //     int n=5;
   //  for(int i=0;i<n;i++)
   //  {
   //    for(int j=0; j<n;j++)
   //    {
   //      if (j==0 || j==(n-1) || i==0 || i==(n-1)/2) {
         
   //         System.out.print("*");
   //      }
   //      else{
   //       System.out.print(" ");
   //      }
   //    }
    
   //    System.out.println();
   //  }

   /***********************************************************************
                     PW ASSIGNMENT PATTERN BASED QUESTION 

    **********************************************************************/
   // Q-1 DRAW A 
         // int n=5;
         //  for(int i=0;i<n;i++)
         //  {
         //    for(int j=0; j<n;j++)
         //    {
         //      if (i==0  || i==(n-1)/2 || j==0 || j==(n-1) ) {
               
         //         System.out.print("* ");
         //      }
         //      else{
         //       System.out.print("  ");
         //      }
         //    }
          
         //    System.out.println();
         //  }

      // q-2: draw B
      // * * * *   
      // *       *
      // * * * * *
      // *       *
      // * * * *
      // int n=5;
      //     for(int i=0;i<n;i++)
      //     {
      //       for(int j=0; j<n;j++)
      //       {
      //         if (i==0 && j<(n-1) || i==(n-1) &&  j<(n-1)|| i==(n-1)/2  || j==0  || j==(n-1) && i>0 && i!=(n-1)) {
               
      //            System.out.print("* ");
      //         }
      //         else{
      //          System.out.print("  ");
      //         }
      //       }
          
      //       System.out.println();
      //     }

      // Q-3: c
      //   * * * * 
      // *
      // *
      // *
      //   * * * *      
                                        
      // int n=5;
      // for(int i=0;i<n;i++)
      // {
      //   for(int j=0; j<n;j++)
      //   {
      //     if (i==0 && j!=0 || j==0 && i>0 && i<(n-1) || i==(n-1) && j!=0 ) {
           
      //        System.out.print("* ");
      //     }
      //     else{
      //      System.out.print("  ");
      //     }
      //   }
      
      //   System.out.println();
      // }
       
      // Q-4: D  
      // * * * *   
      // *       *
      // *       *
      // *       *
      // * * * *        
      // int n=5;
      // for(int i=0;i<n;i++)
      // {
      //   for(int j=0; j<n;j++)
      //   {
      //     if (j==0 || j==(n-1) && i>0 && i<(n-1) || i==0 && j!=(n-1) || i==(n-1) && j!=(n-1) ) {
           
      //        System.out.print("* ");
      //     }
      //     else{
      //      System.out.print("  ");
      //     }
      //   }
      
      //   System.out.println();
      // }

    // Q-5: E 
    // int n=5;
    // for(int i=0;i<n;i++)
    // {
    //   for(int j=0; j<n;j++)
    //   {
    //     if(j==0 || i==0 || i==(n-1)/2 ||  i==(n-1)  ) {
         
    //        System.out.print("* ");
    //     }
    //     else{
    //      System.out.print("  ");
    //     }
    //   }
    
    //   System.out.println();
    // }
   
  //  Q-6: F
  // int n=5;
  // for(int i=0;i<n;i++)
  // {
  //   for(int j=0; j<n;j++)
  //   {
  //     if(j==0 || i==0 || i==(n-1)/2   ) {
       
  //        System.out.print("* ");
  //     }
  //     else{
  //      System.out.print("  ");
  //     }
  //   }
  
  //   System.out.println();
  // }
   
  //  Q-7: G
  // int n=5;
  // for(int i=0;i<n;i++)
  // {
  //   for(int j=0; j<n;j++)
  //   {
  //     if(j==0 || i==(n-1)  && j<(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || j==(n-1) && i>=(n-1)/2  || i==(n-1)/2 && j>(n-1)/2) {
       
  //        System.out.print("* ");
  //     }
  //     else{
  //      System.out.print("  ");
  //     }
  //   }
  
  //   System.out.println();
  // }
   
   // Q-8 : H
   int n=5;
   for(int i=0;i<n;i++)
   {
     for(int j=0; j<n;j++)
     {
       if(j==0 || j==(n-1) || i==(n-1)/2) {
        
          System.out.print("* ");
       }
       else{
        System.out.print("  ");
       }
     }
   
     System.out.println();
   }
   
   
   
   
   
   
   
   
   }
}