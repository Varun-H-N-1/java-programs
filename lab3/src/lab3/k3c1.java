

/*
Q6. Write a Java Program for capitalizing the first letter of each word
using user-defined function capitalizeWords().
*/
package lab3;
public class k3c1 {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split(" ");
        String result = "";

        // Capitalize each word
        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                          + word.substring(1).toLowerCase() + " ";
            }
        }

        return result.trim(); // remove trailing space
    }

    public static void main(String[] args) {

        String input = "java programming language";

        // Calling function
        String output = capitalizeWords(input);

        // Display result
        System.out.println("Original String: " + input);
        System.out.println("Capitalized String: " + output);
    }
}