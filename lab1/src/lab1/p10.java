
/*
p10:
Write a Java program to demonstrate basic operations on LinkedList
such as adding, removing, and displaying elements.
*/

package lab1;

import java.util.*;

public class p10 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements
        ls.add("Orange");
        ls.add("geen");   // typo here (should be "green")
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Before swapping
        System.out.println("Before swapping");
        System.out.println(ls);

        // Swapping elements at index 2 and 3
        Collections.swap(ls, 2, 3);

        // After swapping
        System.out.println("After swapping");
        System.out.println(ls);
    }
}