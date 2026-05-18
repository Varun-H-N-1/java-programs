
/*
p5:
Write a Java program to create an ArrayList of colors and remove
a specific element (Green) using remove() method.
*/


package lab1;

import java.util.*;

public class p5 {
    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Element to remove
        String str = "Green";

        // Display original list
        System.out.println("Original List: " + ls);

        // Removing the specified element (returns true if removed)
        System.out.println("Removing the element: " + ls.remove(str));

        // Display updated list
        System.out.println("Updated List: " + ls);
    }
}