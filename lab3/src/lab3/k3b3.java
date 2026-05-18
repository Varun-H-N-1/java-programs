

/*
Q3. Write a Java Program for reversing the characters in a string
using user-defined function reverseString().
*/
package lab3;
public class k3b3 {

    // User-defined function
    public static String reverseString(String str) {

        String reversed = "";

        // Loop to reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String input = "Java Programming";

        // Calling function
        String result = reverseString(input);

        // Display result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}