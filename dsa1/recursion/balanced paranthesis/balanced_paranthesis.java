public class balanced_paranthesis {

    public static void balaned_paranthesis(int n , int oc,int cc,String str)
    {
          if(oc==n && cc==n)
          {
            System.out.println(str);
            return;
          }
           if(oc<n){
            balaned_paranthesis(n,oc+1,cc,str+"(");
            
           }
           if (oc>cc) {
            balaned_paranthesis(n,oc,cc+1,str+")");
           }
    }
    public static void main(String[] args) {
          int n=3;
          String  str = " ";
          balaned_paranthesis(n,0,0, str);
    }
}