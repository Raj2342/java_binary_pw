public class home {
    public static void main(String[] args) {
          String s = "madam";
          String  str = "";
          for(int i=s.length()-1;i>=0;i--)
          {
               str = str + s.charAt(i);
          }
          System.out.println(str);

          if(s.equals(str)){
            System.out.println("it is palindrome ");
          }
          else{
            System.out.println("it is not palindrome");
          }
    }
}
