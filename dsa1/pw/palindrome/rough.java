import java.util.Arrays;

public class rough {
    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5,6,7,8}; 
        
        // Reverse array
        int reversed[] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            reversed[arr.length - 1 - i] = arr[i];
        }

        // Print reversed array (for debugging purposes)
        System.out.println("Reversed Array: " + Arrays.toString(reversed));

        // Check if the array is a palindrome
        boolean isPalindrome = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != reversed[i]) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if(isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
