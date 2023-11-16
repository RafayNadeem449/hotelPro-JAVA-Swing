package org.hotelPro.ui;

import org.hotelPro.services.AuthenticationService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

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

            AuthenticationService authenticationService = new AuthenticationService();

            try {
                if(authenticationService.checkLogin(emailTF.getText(), Integer.valueOf(passwordTF.getText())))
                {
                    frame.dispose();
                    new HomeUI();
                    System.out.println("Login Successful!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "Wrong Credentials, Try Again!",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Not Successful!");
                    new LoginUI();
                }


            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
