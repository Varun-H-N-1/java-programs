/*
p3:
Write a Java program to create an ArrayList of colors and sort
the elements in ascending order using Collections.sort().
*/


package lab1;

import java.util.*;

public class p3 {
    public static void main(String[] args) {

        // Creating a List using ArrayList
        List<String> ls = new ArrayList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Display list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the list
        Collections.sort(ls);

        // Display list after sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}