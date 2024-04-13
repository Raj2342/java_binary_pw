class rough {
    public static void main(String[] args) {
        String s = "mam";
        // donot give space in  empaty string otherwise it give wrong oputput 
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            // Convert char to string
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);

        if (s.equals(reverse)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
