class PALINDROM_NUMBER {
    public static void main(String[] args) {
          
         String s = "mam";
         String reverse = " ";
         for(int i=s.length()-1;i>=0;i--)
         {
            // char convert into  string 
             reverse  = reverse + s.charAt(i);
         }
        System.out.println(reverse); 

        if (s.equals(reverse)) {
            System.out.println("it is palindrome ");
        }
        else{
            System.out.println("it is not palindrome ");
        }
    }
}