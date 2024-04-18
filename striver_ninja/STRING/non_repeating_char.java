import java.util.HashMap;

public class non_repeating_char {
    public static void main(String[] args) {
        String input = "APPLE"; // Change this to any string you want to check

        // Remove spaces and convert to lowercase for accurate comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charFrequencies = new HashMap<>();

        // Count the frequency of each character
        for (char c : cleanedInput.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Print non-repeating characters
        for (char c : cleanedInput.toCharArray()) {
            if (charFrequencies.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
