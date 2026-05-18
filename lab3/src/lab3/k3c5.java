

/*
Q10. Write a Java Program for counting the number of words in a string
using user-defined function countWords().
*/
package lab3;
public class k3c5 {

    // User-defined function
    public static int countWords(String str) {

        // Check if string is null or empty
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split string based on whitespace
        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        String input = "Java is a powerful programming language";

        // Calling function
        int count = countWords(input);

        // Display result
        System.out.println("Input String: " + input);
        System.out.println("Word Count: " + count);
    }
}