

/*Write a java program for getting different colors through ArrayList interface and search
whether the color &quot;Red&quot; is available or not
( Hint : Use ArrayListObj.contains() ) */

package lab1;
import java.util.*;   // Import required package

public class k1 {
 public static void main(String[] args) {

     // Creating an ArrayList to store colors
     ArrayList<String> colors = new ArrayList<>();

     // Adding colors to the list
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Red");
     colors.add("Black");

     // Displaying the list of colors
     System.out.println("Colors in the list: " + colors);

     // Checking if "Red" is present using contains()
     if (colors.contains("Red")) {
         System.out.println("Red color is available in the list.");
     } else {
         System.out.println("Red color is NOT available in the list.");
     }
 }
}