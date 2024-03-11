class common_ele {
   
    public static void main(String[] args) {
      /*
        find common element  from two array 
      */   
        // int a[] = { 4,3,5,7,9,2};
        // int b[] = { 5,1,4,8,3,5};

        // for(int i=0; i<a.length-1; i++){
        //     for(int j=0;j<b.length-1;j++){
        //         if (a[i]==b[j]) {
        //             System.out.println(a[i]);
        //         }
        //     }
        // }
          
   /*
      find common element  from two array , if  value is double time in same array like 4 a[]
      // int a[] = { 4,3,5,7,9,2 ,4};
        // int b[] = { 5,1,4,8,3,5};
    */

    int a[] = { 4,3,5,7,9,2,4};
     int b[] = { 5,1,8,4,3,5};
     for(int i=0; i<a.length-1; i++){
            for(int j=0;j<b.length-1;j++){
                if (a[i]==b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
            

            


    }
 }