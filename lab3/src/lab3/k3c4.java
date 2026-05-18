

/*
Q9. Write a Java Program for creating a random string of a specified length
using user-defined function generateRandomString().
*/
package lab3;
import java.util.Random;

public class k3c4 {

    // User-defined function
    public static String generateRandomString(int length) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = "";

        Random random = new Random();

        // Generate random string
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            result += chars.charAt(index);
        }

        return result;
    }

    public static void main(String[] args) {

        int length = 8;

        // Calling function
        String randomString = generateRandomString(length);

        // Display result
        System.out.println("Random String: " + randomString);
    }
}