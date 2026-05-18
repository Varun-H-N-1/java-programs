/*
p8:
Write a Java program to create a LinkedList of colors and add
an element at the end of the list using addLast().
*/


package lab1;
import java.util.*;

public class p8 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> ls = new LinkedList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Display original list
        System.out.println("Original List: " + ls);

        // Adding element at the end using addLast()
        ls.addLast("Pink");

        // Display updated list
        System.out.println("After adding element at last: " + ls);
    }
}