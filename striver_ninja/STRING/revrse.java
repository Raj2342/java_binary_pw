public class  revrse{
public static void main(String[] args) {
         String s = "PW SKILLS";
         String rever = " ";
         for(int i=s.length()-1; i>=0; i--)
         {
             rever = rever + s.charAt(i);
         }
         System.out.println(rever);
}

}