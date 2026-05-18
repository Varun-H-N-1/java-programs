/*
p7:
Write a Java program to create a LinkedList of colors and iterate
the elements in reverse order using descendingIterator().
*/

package lab1;

import java.util.*;

public class p7 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> ls = new LinkedList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Using descendingIterator to traverse in reverse order
        Iterator<String> iterator = ls.descendingIterator();

        // Printing elements in reverse order
        System.out.println("Elements in reverse order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}