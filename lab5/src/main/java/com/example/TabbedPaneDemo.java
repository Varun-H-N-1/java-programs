
/*
5b. Develop a Swing program in Java to create a Tabbed Pane of
RED, BLUE and GREEN and display the concerned color whenever
the specific tab is selected.
*/
package com.example;
import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Tabbed Pane Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with different background colors
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs with panels
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add tabbedPane to frame
        frame.add(tabbedPane);

        // Center frame
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}