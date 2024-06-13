

public class rough {

    public static int recursion_Array(int a,int b)
    {
         int result=0;
         int finalresult=0;
          if(b==1)
          {
            return a;
          }
          else{
             result = recursion_Array(a,b/2);
             finalresult = result*result;
            if (b%2!=0) {
                  return a*finalresult;
                  
            }
            else{
                  return finalresult;
            }
          }
          
    }
    public static void main(String[] args) {
         int a=2;
         int b=32;
       int ka=  recursion_Array(a,b);
       System.out.println(ka);
           
         
      

    }
}
