

/*
Q7. Write a Java Program for shortening a string to a specified length
and adding an ellipsis using user-defined function truncate().
*/
package lab3;
public class k3c2 {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        // Check if string is null
        if (str == null) {
            return null;
        }

        // If length is within limit, return as it is
        if (str.length() <= maxLength) {
            return str;
        }

        // Otherwise, shorten and add ellipsis
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {

        String input = "Java Programming Language";
        int length = 10;

        // Calling function
        String result = truncate(input, length);

        // Display result
        System.out.println("Original String: " + input);
        System.out.println("Truncated String: " + result);
    }
}