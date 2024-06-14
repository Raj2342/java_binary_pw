public class brutforce {

      public static void multiple(int num,int kth)
      {

         int result =0;
          for(int i=1;i<=5;i++)
          {
            result= num*i;
            System.out.println(result);
          }
        
      }
      public static void main(String[] args) {
            int num = 10;
            int kth = 5;
         multiple(num,kth);
      }
}
