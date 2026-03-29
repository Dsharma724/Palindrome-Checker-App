import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose algorithm (you can reuse from UC12)
        PalindromeStrategy strategy = new TwoPointerStrategy();

        // Start time
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean isPalindrome = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Two-Pointer Strategy (Fast)
 */
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        input = input.toLowerCase();

        int start = 0;
        int end = input.length() - 1;

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