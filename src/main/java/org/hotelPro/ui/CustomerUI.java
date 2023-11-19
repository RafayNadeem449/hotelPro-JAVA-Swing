package org.hotelPro.ui;

import org.hotelPro.ui.HomeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerUI {
    public CustomerUI() {
        JFrame frame = new JFrame("HotelPro - Customer");
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        JButton addButton = new JButton("ADD");
        JButton editButton = new JButton("EDIT");
        JButton deleteButton = new JButton("DELETE");
        JButton backButton = new JButton("BACK");

        Color customColor = new Color(0, 83, 128);

        mainPanel.setBackground(Color.ORANGE);
        buttonPanel.setBackground(Color.ORANGE);

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);

        mainPanel.add(buttonPanel, BorderLayout.EAST);

        // Create a JTable with sample data
        String[] columnNames = {"Room Number", "Room Type", "Status"};
        String[][] data = {
                {"101", "Single", "Occupied"},
                {"102", "Double", "Available"},
                {"103", "Single", "Occupied"},
        };
        JTable dataTable = new JTable(data, columnNames);


        JScrollPane scrollPane = new JScrollPane(dataTable);

        scrollPane.setPreferredSize(new Dimension(600, 200));

        backButton.addActionListener((el)->
        {
            frame.dispose();
            new HomeUI();
        });

        addButton.addActionListener((el)->
        {
            frame.dispose();
            new AddCustomerUI();
        });

        deleteButton.addActionListener((el)->
        {
            frame.dispose();
            new DeleteCustomerUI();

        });



        mainPanel.add(scrollPane);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setSize(800, 1100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
