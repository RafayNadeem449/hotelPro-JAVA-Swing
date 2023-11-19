package org.hotelPro.ui;

import org.hotelPro.services.AuthenticationService;
import org.hotelPro.services.RoomService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AddRoomUI {

    RoomService roomService = new RoomService();
    public AddRoomUI() {
        JFrame frame = new JFrame("HotelPro - Add Room");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton addRoomButton = new JButton("ADD");
        JButton backButton = new JButton("Back");


        JLabel noLabel = new JLabel("Add Room No");
        JTextField noTF = new JTextField(20);
        JLabel typeLable = new JLabel("Add Room Type");
        JTextField typeTF = new JTextField(20);
        JLabel priceLabel = new JLabel("Add Room Price");
        JTextField priceTF = new JTextField(20);


        panel.setBackground(Color.ORANGE);
        panel.add(noLabel);
        panel.add(noTF);
        panel.add(typeLable);
        panel.add(typeTF);
        panel.add(priceLabel);
        panel.add(priceTF);

        panel.add(addRoomButton);
        panel.add(backButton);


        addRoomButton.addActionListener(e->{

            try {
                roomService.save(Integer.valueOf(noTF.getText()),typeTF.getText(),Integer.valueOf(priceTF.getText()));
                System.out.println("Room Data Successfully Added!");
                frame.dispose();
                new RoomUI();

            }catch (Exception ex){
                JOptionPane.showMessageDialog(frame,"Data Cannot be Saved");
            }

        });


        backButton.addActionListener((el)->
        {
            frame.dispose();
            new RoomUI();
        });


        frame.setSize(380, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}

