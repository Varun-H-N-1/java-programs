
/*
5a. Develop a Swing program in Java to add the countries
USA, India, Vietnam, Canada, Denmark, France, Great Britain,
Japan, Africa, Greenland, Singapore into a JList and display
them on console whenever the countries are selected.
*/
package com.example;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Country List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country list
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Add ListSelectionListener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected Country: " + list.getSelectedValue());
                }
            }
        });

        // Add list to scroll pane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add to frame
        frame.add(scrollPane);

        // Center frame
        frame.setLocationRelativeTo(null);

        // Make visible
        frame.setVisible(true);
    }
}