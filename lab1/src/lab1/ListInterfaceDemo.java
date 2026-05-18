package lab1;

//Program to demonstrate List Interface using ArrayList and LinkedList

import java.util.*;   // Import all required utilities

public class ListInterfaceDemo {
 public static void main(String[] args) {

     // Creating different types of Lists
     List<String> arrayList = new ArrayList<>();
     List<String> linkedList = new LinkedList<>();

     System.out.println("=== ArrayList Demonstrations ===");

     // 1. Adding elements
     arrayList.add("Apple");
     arrayList.add("Banana");
     arrayList.add("Orange");
     System.out.println("After adding elements: " + arrayList);

     // 2. Adding element at specific index
     arrayList.add(1, "Mango");
     System.out.println("After adding Mango at index 1: " + arrayList);

     // 3. Adding multiple elements
     arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
     System.out.println("After adding multiple elements: " + arrayList);

     // 4. Accessing elements
     String firstFruit = arrayList.get(0);
     System.out.println("First fruit: " + firstFruit);

     // 5. Updating elements
     arrayList.set(1, "Kiwi");
     System.out.println("After updating index 1 to Kiwi: " + arrayList);

     // 6. Removing elements
     arrayList.remove("Orange"); // Remove by value
     arrayList.remove(0);        // Remove by index
     System.out.println("After removing elements: " + arrayList);

     // 7. Searching elements
     boolean containsKiwi = arrayList.contains("Kiwi");
     int grapeIndex = arrayList.indexOf("Grape");
     System.out.println("Contains Kiwi? " + containsKiwi);
     System.out.println("Index of Grape: " + grapeIndex);

     // 8. List size
     System.out.println("List size: " + arrayList.size());

     // 9. Iterating using for-each loop
     System.out.println("\nIterating using for-each loop:");
     for (String fruit : arrayList) {
         System.out.println(fruit);
     }

     // 10. Iterating using Iterator
     System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = arrayList.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }

     // 11. Sorting the list
     Collections.sort(arrayList);
     System.out.println("After sorting: " + arrayList);

     // 12. Creating a sublist
     List<String> subList = arrayList.subList(0, 2);
     System.out.println("Sublist (0-2): " + subList);

     // 13. Clearing the list
     arrayList.clear();
     System.out.println("After clearing: " + arrayList);


     // ================= LinkedList Operations =================

     System.out.println("\n=== LinkedList Demonstrations ===");

     LinkedList<String> fruits = new LinkedList<>();

     // Adding elements
     fruits.addFirst("Apple");   // Add at beginning
     fruits.addLast("Banana");   // Add at end
     fruits.add("Orange");       // Add normally

     System.out.println("LinkedList: " + fruits);

     // Accessing elements
     System.out.println("First element: " + fruits.getFirst());
     System.out.println("Last element: " + fruits.getLast());

     // Removing elements
     fruits.removeFirst();
     fruits.removeLast();

     System.out.println("After removing first and last: " + fruits);
 }
}