/**
 * ================================================
 * UseCase2PalindromeCheckerApp
 * ================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Goal:
 * - Display whether a hardcoded string is a palindrome.
 *
 * Flow:
 * - Program starts
 * - Hardcoded string is checked
 * - Result is printed
 * - Program exits
 *
 * Concepts:
 * - String manipulation
 * - Conditional statements
 * - Console output
 * MAIN CLASS - UseCase1PalindromeApp
 * ================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";  // hardcoded string

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

public class PalindromeCheckerApp {
    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" Welcome to the Palindrome Checker Management System");
        System.out.println(" Version : 1.0");
        System.out.println(" System initialized successfully.");
        System.out.println("==============================================");
    }
}