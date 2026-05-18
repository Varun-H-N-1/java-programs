

/*
5d. Develop a Swing program in Java to create a Tabbed Pane of
Cyan, Magenta and Yellow and display the concerned color
whenever the specific tab is selected.
*/
package com.example;
import javax.swing.*;
import java.awt.*;

public class TabbedPaneColors {
    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame("Tabbed Pane Colors");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with different colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane);

        // Center frame
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}