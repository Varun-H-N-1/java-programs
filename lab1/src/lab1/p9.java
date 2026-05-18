/*
p9:
Write a Java program to create a LinkedList of colors and display
each element along with its index using a for loop.
*/


package lab1;
import java.util.*;

public class p9 {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> ls = new LinkedList<>();

        // Adding colors to the list
        ls.add("Orange");
        ls.add("Green");
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Iterating using for loop and displaying index with value
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Index: " + i + " Value: " + ls.get(i));
        }
    }
}