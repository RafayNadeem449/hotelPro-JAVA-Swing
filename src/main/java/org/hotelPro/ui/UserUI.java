package org.hotelPro.ui;

import org.hotelPro.services.UserService;
import org.hotelPro.ui.HomeUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserUI {

    UserService userService = new UserService();
    public UserUI() {
        JFrame frame = new JFrame("HotelPro - User");
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
        String[] columnNames = {"User Name", "User Phone", "User Email"};

        String[][] data = userService.getAllUserForJTable();

        DefaultTableModel dtm = new DefaultTableModel(data,columnNames);
        JTable jt=new JTable(dtm);

        JScrollPane sp=new JScrollPane(jt);



        JScrollPane scrollPane = new JScrollPane(sp);

        scrollPane.setPreferredSize(new Dimension(600, 200));

        backButton.addActionListener((el)->
        {
            frame.dispose();
            new HomeUI();
        });

        addButton.addActionListener((el)->
        {
            frame.dispose();
            new AddUserUI();
        });

        deleteButton.addActionListener((el)->
        {
            frame.dispose();
            new DeleteUserUI();
        });

        mainPanel.add(scrollPane);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setSize(800, 1100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
