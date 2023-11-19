package org.hotelPro.ui;

import org.hotelPro.dao.RoomDAO;
import org.hotelPro.services.AuthenticationService;
import org.hotelPro.services.RoomService;
import org.hotelPro.services.UserService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class DeleteUserUI {

   UserService userService = new UserService();
    public DeleteUserUI() {
        JFrame frame = new JFrame("HotelPro - Delete User");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton deleteRoomButton = new JButton("DELETE");
        JButton backButton = new JButton("Back");


        JLabel idLabel = new JLabel("Insert User Id To Delete:");
        JTextField idTF = new JTextField(20);



        panel.setBackground(Color.ORANGE);
        panel.add(idLabel);
        panel.add(idTF);


        panel.add(deleteRoomButton);
        panel.add(backButton);


        deleteRoomButton.addActionListener(e->{


            userService.deleteUserById(Integer.valueOf(idTF.getText()));
            System.out.println("User Delete Successfull!");
            frame.dispose();
            new HomeUI();

        });


        backButton.addActionListener((el)->
        {
            frame.dispose();
            System.out.println("User Delete Not Successfull!");
            new RoomUI();
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

