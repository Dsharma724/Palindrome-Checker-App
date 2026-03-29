import java.util.Stack;

public class   PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        // Execute strategy
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based Strategy Implementation
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        // Normalize input
        input = input.toLowerCase();

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with original string
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}