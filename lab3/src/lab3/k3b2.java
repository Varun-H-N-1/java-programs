
/*
Q2. Write a Java Program for counting how many times a substring
appears in a main string using user-defined function countOccurrences().
*/
package lab3;
public class k3b2 {

    // User-defined function
    public static int countOccurrences(String mainStr, String subStr) {

        int count = 0;
        int index = 0;

        // Loop to find occurrences
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index = index + subStr.length(); // move forward
        }

        return count;
    }

    public static void main(String[] args) {

        String mainStr = "Java is fun. Java is powerful. Java is popular.";
        String subStr = "Java";

        // Calling function
        int result = countOccurrences(mainStr, subStr);

        // Display result
        System.out.println("Number of occurrences: " + result);
    }
}