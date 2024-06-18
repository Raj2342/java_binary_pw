public class recursive_approach {

    public static  void  table(int num , int k)
    {
        if (k==1) {
             System.out.println(num);
             return;
        }
        else{
           table(num,k-1);
           System.out.println(num*k);
        }
    }
    public static void main(String[] args) {
        
          int num = 12;
          int k = 5;
          table(num,k);
        // System.out.println(resuklt);
    }
}
