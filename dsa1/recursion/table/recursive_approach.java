public class recursive_approach {

    public static  int  table(int num , int k)
    {
        if (k==1) {
            return num;
        }
        else{
           table(num,k-1);
           return num*k;
        }
    }
    public static void main(String[] args) {
        
          int num = 12;
          int k = 5;
        int resuklt=  table(num,k);
        System.out.println(resuklt);
    }
}
