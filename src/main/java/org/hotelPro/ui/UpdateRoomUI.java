package org.hotelPro.ui;

        import org.hotelPro.services.AuthenticationService;
        import org.hotelPro.services.RoomService;

        import javax.swing.*;
        import java.awt.*;
        import java.sql.SQLException;

public class UpdateRoomUI {

    RoomService roomService = new RoomService();
    public UpdateRoomUI() {
        JFrame frame = new JFrame("HotelPro - Update Room");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 50));
        frame.add(panel);
        JButton editRoomButton = new JButton("UPDATE");
        JButton backButton = new JButton("Back");


        JLabel noLabel = new JLabel("Add Room No to Edit:");
        JTextField noTF = new JTextField(10);
        JLabel typeLable = new JLabel("Add Room Type to Edit:");
        JTextField typeTF = new JTextField(10);
        JLabel priceLabel = new JLabel("Add Room Price to Edit:");
        JTextField priceTF = new JTextField(10);


        panel.setBackground(Color.ORANGE);
        panel.add(noLabel);
        panel.add(noTF);
        panel.add(typeLable);
        panel.add(typeTF);
        panel.add(priceLabel);
        panel.add(priceTF);

        panel.add(editRoomButton);
        panel.add(backButton);


        editRoomButton.addActionListener(e->{

            try {
                roomService.EditRoomInfo(Integer.getInteger(noTF.getText()),typeTF.getText(),Integer.getInteger(priceTF.getText()));
                System.out.println("Room Data Successfully Updated!");
                frame.dispose();
                new RoomUI();

            }catch (Exception ex){
                System.out.println(ex);
                JOptionPane.showMessageDialog(frame,"Data Cannot be Updated");
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

