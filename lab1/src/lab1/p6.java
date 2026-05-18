/*
p6:
Write a Java program to create a LinkedList of colors and iterate
through the elements starting from a specified position using
ListIterator.
*/

package lab1;

import java.util.*;

public class p6 {
    public static void main(String[] args) {

        // Creating a List using LinkedList
        List<String> ls = new LinkedList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Creating a ListIterator starting from index 2
        ListIterator<String> iterator = ls.listIterator(2);

        // Iterating from index 2 to end
        System.out.println("Elements from index 2:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}