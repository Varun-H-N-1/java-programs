/*
p2:
Write a Java program to create an ArrayList of colors and remove
the 2nd element using index and remove a specific color (Blue)
using object.
*/

package lab1;

import java.util.*;

public class k2 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> ls = new ArrayList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Display original list
        System.out.println(ls);

        // Removing element at index 2 (3rd element)
        ls.remove(2);
        System.out.println(ls);

        // Removing element "Blue" using object
        ls.remove("Blue");
        System.out.println(ls);
    }
}