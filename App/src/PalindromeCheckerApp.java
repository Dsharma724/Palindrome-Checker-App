import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input
        String input = "A man a plan a canal Panama";

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove all non-alphanumeric characters (spaces, punctuation)
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}