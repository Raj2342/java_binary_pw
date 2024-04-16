public class home {
    public static void main(String[] args) {
          String s = "Mohan is good boy";
          int count =1;
          for(int i=0;i<s.length()-1;i++)
          {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                  count = count +1;

            }
          }
          System.out.println(count);
    }
}
