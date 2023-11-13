package org.hotelPro.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookingUI {
    public AddBookingUI() {
        JFrame frame = new JFrame("HotelPro - ADD Booking Section");
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField searchField = new JTextField("Search",10);

        JButton searchButton = new JButton("Search");

        JButton addButton = new JButton("Add");
        JButton backButton = new JButton("Back");

        JLabel noOfPersonLabel = new JLabel("No Of Persons:");
        JLabel customerLabel = new JLabel("Customer Label");

        String[] customers = {"Harry", "Ali", "Rafay", "Talha"};
        JComboBox<String> comboBox = new JComboBox<>(customers);

        Integer[] noOfPerson = {1, 2, 3, 4, 5, 6};
        JComboBox<Integer> comboBox2 = new JComboBox<>(noOfPerson);

        Color customColor = new Color(0, 83, 128);

        mainPanel.setBackground(Color.ORANGE);
        buttonPanel.setBackground(Color.ORANGE);

        gbc.gridx = 0;
        gbc.gridy = 0;
        buttonPanel.add(customerLabel, gbc);
        gbc.gridx = 1;
        buttonPanel.add(comboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        buttonPanel.add(noOfPersonLabel, gbc);
        gbc.gridx = 1;
        buttonPanel.add(comboBox2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        buttonPanel.add(searchField, gbc);
        gbc.gridx = 1;
        buttonPanel.add(searchButton, gbc);


        gbc.gridx = 0;
        gbc.gridy = 4;
        buttonPanel.add(addButton, gbc);
        gbc.gridx = 1;
        buttonPanel.add(backButton, gbc);

        mainPanel.add(buttonPanel, BorderLayout.EAST);

        String[] columnNames = {"Room Number", "Room Type", "Status"};
        String[][] data = {
                {"101", "Single", "Occupied"},
                {"102", "Double", "Available"},
                {"103", "Single", "Occupied"},
        };
        JTable dataTable = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(dataTable);

        scrollPane.setPreferredSize(new Dimension(400, 200));

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        backButton.addActionListener((el)->
        {
            frame.dispose();
            new BookingUI();
        });

        frame.add(mainPanel);
        frame.setSize(800, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
