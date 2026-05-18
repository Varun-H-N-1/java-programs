/*
p4:
Write a Java program to create an ArrayList of colors and extract
a portion of the list using subList().
*/

package lab1;

import java.util.*;

public class p4 {
    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Display full list
        System.out.println("Original List: " + ls);

        // Using subList (from index 0 to 2, excluding 2)
        System.out.println("Using subList (0 to 2):");
        System.out.println(ls.subList(0, 2));
    }
}