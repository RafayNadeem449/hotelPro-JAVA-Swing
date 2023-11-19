package org.hotelPro.ui;

import org.hotelPro.dao.RoomDAO;
import org.hotelPro.services.AuthenticationService;
import org.hotelPro.services.RoomService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class DeleteRoomUI {

    RoomService roomService = new RoomService();
    public DeleteRoomUI() {
        JFrame frame = new JFrame("HotelPro - Delete Room");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton deleteRoomButton = new JButton("DELETE");
        JButton backButton = new JButton("Back");


        JLabel idLabel = new JLabel("Insert Room Id To Delete:");
        JTextField idTF = new JTextField(20);



        panel.setBackground(Color.ORANGE);
        panel.add(idLabel);
        panel.add(idTF);


        panel.add(deleteRoomButton);
        panel.add(backButton);


        deleteRoomButton.addActionListener(e->{

           roomService.DeleteRoomById(Integer.valueOf(idTF.getText()));
            System.out.println("Delete Successfull!");
            frame.dispose();
            new HomeUI();

        });


        backButton.addActionListener((el)->
        {
            frame.dispose();
            System.out.println("Delete Not Successfull!");
            new RoomUI();
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

