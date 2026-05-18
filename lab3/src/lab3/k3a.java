

/*
Write a Java program to perform various string operations including:
String Creation and Basic Operations, Length and Character Access,
String Comparison, String Searching, Substring Operations,
String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting,
and Email Validation using contains(), startsWith(), and endsWith().
*/
package lab3;
import java.util.*;

public class k3a{
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);

        // 2. Length and Character Access
        String str = "Java Programming";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 3: " + str.charAt(3));

        // 3. String Comparison
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));

        // 4. String Searching
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0-4): " + str.substring(0, 4));

        // 6. String Modification
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace: " + str.replace("Java", "Python"));

        // 7. Whitespace Handling
        String ws = "   Hello Java   ";
        System.out.println("Trimmed: '" + ws.trim() + "'");

        // 8. String Concatenation
        String concat = s1.concat(" " + s2);
        System.out.println("Concatenated: " + concat);

        // 9. String Splitting
        String langs = "Java,Python,C++";
        String[] arr = langs.split(",");
        System.out.println("Split result:");
        for (String lang : arr) {
            System.out.println(lang);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String name = "Koushik";
        int age = 20;
        System.out.printf("Formatted Output -> Name: %s, Age: %d\n", name, age);

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}