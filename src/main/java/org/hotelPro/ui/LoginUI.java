package org.hotelPro.ui;

import javax.swing.*;
import java.awt.*;

public class LoginUI {
    public LoginUI() {
        JFrame frame = new JFrame("HotelPro - Login");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton submitButton = new JButton("Submit Details");

        JLabel emailLabel = new JLabel("Email");
        JTextField emailTF = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password");
        JTextField passwordTF = new JPasswordField(20);

        submitButton.setBackground(Color.RED);
        panel.setBackground(Color.ORANGE);
        panel.add(emailLabel);
        panel.add(emailTF);
        panel.add(passwordLabel);
        panel.add(passwordTF);
        panel.add(submitButton);


        submitButton.addActionListener((el)->
        {
            frame.dispose();
            new HomeUI();
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
