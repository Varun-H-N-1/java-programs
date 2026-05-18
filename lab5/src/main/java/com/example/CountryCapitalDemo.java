

/*
5c. Develop a Swing program in Java to add the countries
USA, India, Vietnam, Canada, Denmark, France, Great Britain,
Japan, Africa, Greenland, Singapore into a JList and display
the capital of the countries on console whenever a country is selected.
*/
package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country - Capital List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create mapping of country to capital
        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create JList
        JList<String> list = new JList<>(countries);

        // Add ListSelectionListener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid multiple triggers
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println("Capital of " + selected + ": " + capitalMap.get(selected));
                }
            }
        });

        // Add to scroll pane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add to frame
        frame.add(scrollPane);

        // Center frame
        frame.setLocationRelativeTo(null);

        // Make visible
        frame.setVisible(true);
    }
}