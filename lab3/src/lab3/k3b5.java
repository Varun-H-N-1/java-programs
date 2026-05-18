

/*
Q5. Write a Java Program for eliminating all whitespace characters
from a string using user-defined function removeWhitespace().
*/
package lab3;
public class k3b5 {

    // User-defined function
    public static String removeWhitespace(String str) {

        // Remove all whitespace characters (spaces, tabs, etc.)
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        String input = "  Java   Programming   Language  ";

        // Calling function
        String result = removeWhitespace(input);

        // Display result
        System.out.println("Original String: " + input);
        System.out.println("After Removing Whitespace: " + result);
    }
}