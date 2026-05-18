

/*
Q1. Write a Java Program for checking if a given string is null
or contains only whitespace using user-defined function isNullOrEmpty().
*/
package lab3;
public class k3b1 {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {

        // Check if string is null
        if (str == null) {
            return true;
        }

        // Check if string contains only whitespace
        if (str.trim().isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String str1 = null;
        String str2 = "   ";
        String str3 = "Hello";

        // Checking strings
        System.out.println("str1 is null/empty: " + isNullOrEmpty(str1));
        System.out.println("str2 is null/empty: " + isNullOrEmpty(str2));
        System.out.println("str3 is null/empty: " + isNullOrEmpty(str3));
    }
}