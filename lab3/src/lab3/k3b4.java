

/*
Q4. Write a Java Program for checking if a string reads the same
backward as forward (ignoring case and punctuation)
using user-defined function isPalindrome().
*/
package lab3;
public class k3b4 {

    // User-defined function
    public static boolean isPalindrome(String str) {

        // Remove punctuation and spaces, convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";

        // Calling function
        boolean result = isPalindrome(input);

        // Display result
        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);
    }
}