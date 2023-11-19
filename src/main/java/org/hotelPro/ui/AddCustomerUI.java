package org.hotelPro.ui;

import org.hotelPro.services.AuthenticationService;
import org.hotelPro.services.CustomerService;
import org.hotelPro.services.RoomService;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class AddCustomerUI {

    CustomerService customerService = new CustomerService();
    public AddCustomerUI() {
        JFrame frame = new JFrame("HotelPro - Add Customer");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton addCustomerButton = new JButton("ADD");
        JButton backButton = new JButton("Back");


        JLabel nameLabel = new JLabel("Add Customer Name:");
        JTextField nameTF = new JTextField(20);
        JLabel phoneLable = new JLabel("Add Customer Phone Number:");
        JTextField phoneTF = new JTextField(20);
        JLabel emailLabel = new JLabel("Add Customer Email");
        JTextField emailTF = new JTextField(20);


        panel.setBackground(Color.ORANGE);
        panel.add(nameLabel);
        panel.add(nameTF);
        panel.add(phoneLable);
        panel.add(phoneTF);
        panel.add(emailLabel);
        panel.add(emailTF);

        panel.add(addCustomerButton);
        panel.add(backButton);


        addCustomerButton.addActionListener(e->{

            try
            {
                customerService.save(nameTF.getText(),Integer.valueOf(phoneTF.getText()),emailTF.getText());
                System.out.println("Customer Successfully Saved!");
                frame.dispose();
               new CustomerUI();
            }

            catch (Exception exception)
            {
                System.out.println(exception);
                System.out.println("Customer not Saved");
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

