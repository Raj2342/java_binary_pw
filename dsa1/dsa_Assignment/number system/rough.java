public class rough {
    public static void main(String[] args) {
        String b = ""; // Initialize with an empty string
        int n = 10;
        int t = n;

        // Convert number to binary representation
        while (t > 0) {
            int r = t % 2;
            t = t / 2;
            b = r + b;
        }
        System.out.println(b); // Print the binary representation

        int count = 0;
       

        // Count the number of set bits (1s)
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') { // Compare with character '1'
                count++;
            }
        }
        System.out.println("Number of set bits: " + count);
    }
}
