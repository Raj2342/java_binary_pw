public class dice{
    public static void printdice(int curr,int dest,String str)
    {
        if (curr>dest) {
            return;
            
        }
        if (curr==dest) {
            System.out.println(str);
            return;
        }

        printdice(curr+1,dest,str+1);
        printdice(curr+2,dest,str+2);
        printdice(curr+3,dest,str+3);
        printdice(curr+4,dest,str+4);
        printdice(curr+5,dest,str+5);
        printdice(curr+6,dest,str+6);
        

    }
    public static void main(String[] args) {
        
         printdice(0,9,"");

    }
}