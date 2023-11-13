package org.hotelPro.ui;

import org.hotelPro.ui.LoginUI;

import javax.swing.*;
import java.awt.*;

public class HomeUI {
    public HomeUI() {
        JFrame frame = new JFrame("HotelPro - Home");

        // Use BorderLayout for the frame to organize components
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 3, 80, 80));
        JLabel mainLabel = new JLabel("Welcome To Hotel Pro - Home UI");
        mainLabel.setForeground(Color.BLUE);

        JButton roomButton = new JButton("Room");
        JButton userButton = new JButton("User");
        JButton customerButton = new JButton("Customer");
        JButton reportButton = new JButton("Report");
        JButton bookingButton = new JButton("Booking");
        JButton logoutButton = new JButton("Log Out");

        panel.setBackground(Color.ORANGE);
        mainLabel.setBackground(Color.ORANGE);


        frame.add(mainLabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        panel.add(roomButton);
        panel.add(userButton);
        panel.add(customerButton);
        panel.add(reportButton);
        panel.add(bookingButton);
        panel.add(logoutButton);

        logoutButton.addActionListener((e) -> {
            frame.dispose();
            new LoginUI();
        });

        roomButton.addActionListener((e) -> {
            frame.dispose();
           new RoomUI();
        });

        userButton.addActionListener((e) -> {
            frame.dispose();
            new UserUI();
        });

        customerButton.addActionListener((e) -> {
            frame.dispose();
            new CustomerUI();
        });

        reportButton.addActionListener((e) -> {
            frame.dispose();
            new ReportUI();
        });

        bookingButton.addActionListener((e) -> {
            frame.dispose();
            new BookingUI();
        });


        frame.setSize(800, 1100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
