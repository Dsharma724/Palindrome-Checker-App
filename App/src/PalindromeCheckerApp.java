import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call method
        boolean isPalindrome = service.checkPalindrome(input);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Optional: normalize (lowercase)
        input = input.toLowerCase();

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}