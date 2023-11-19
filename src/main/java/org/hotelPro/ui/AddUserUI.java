package org.hotelPro.ui;

import org.hotelPro.dao.UserDAO;
import org.hotelPro.domain.User;
import org.hotelPro.services.AuthenticationService;
import org.hotelPro.services.RoomService;
import org.hotelPro.services.UserService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AddUserUI {

    UserService userService = new UserService();
    public AddUserUI() {
        JFrame frame = new JFrame("HotelPro - Add User");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton addUserButton = new JButton("ADD");
        JButton backButton = new JButton("Back");


        JLabel nameLabel = new JLabel("Add Name");
        JTextField nameTF = new JTextField(10);
        JLabel phoneLabel = new JLabel("Add Phone");
        JTextField phoneTF = new JTextField(10);
        JLabel emailLabel = new JLabel("Add Email");
        JTextField emailTF = new JTextField(10);
        JLabel passLabel = new JLabel("Add Password");
        JTextField passTF = new JPasswordField(10);



        panel.setBackground(Color.ORANGE);
        panel.add(nameLabel);
        panel.add(nameTF);
        panel.add(phoneLabel);
        panel.add(phoneTF);
        panel.add(emailLabel);
        panel.add(emailTF);
        panel.add(passLabel);
        panel.add(passTF);

        panel.add(addUserButton);
        panel.add(backButton);


        addUserButton.addActionListener(e->{

            try
            {
                userService.save(nameTF.getText(),Integer.valueOf(phoneTF.getText()),emailTF.getText(),passTF.getText());
                System.out.println("User Successfully Saved!");
                frame.dispose();
                new UserUI();
            }

            catch (Exception exception)
            {
                System.out.println(exception);
                System.out.println("User not Saved");
            }



        });


        backButton.addActionListener((el)->
        {
            frame.dispose();
            new UserUI();
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

