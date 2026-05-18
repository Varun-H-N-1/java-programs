

/*
Q8. Write a Java Program for verifying if a string contains only numeric characters
using user-defined function isNumeric().
*/
package lab3;
public class k3c3 {

    // User-defined function
    public static boolean isNumeric(String str) {

        // Check if string is null or empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input1 = "12345";
        String input2 = "123a5";

        // Calling function
        System.out.println("Is Numeric (" + input1 + "): " + isNumeric(input1));
        System.out.println("Is Numeric (" + input2 + "): " + isNumeric(input2));
    }
}