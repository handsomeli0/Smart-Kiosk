package view;
import java.awt.*;
import javax.swing.*;
import model.*;
import controller.*;

/**
 * This class is the UI of Booking check in.
 *
 * @author Song Yan
 * @version 1.2
 */

public class BookingNumberCheckIn
{
    public BookingNumberCheckIn(){
        JFrame frame=new JFrame("Smart-Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon=new ImageIcon("src/images/rectangle.png");
        JLabel label=new JLabel(icon);
        label.setBounds(18,87,500,500);

        ImageIcon icon1 = new ImageIcon("src/images/background2.png");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(800,20,icon2.getIconWidth(),icon2.getIconHeight());

        ImageIcon icon3 = new ImageIcon("src/images/girl.jpg");
        JLabel label3 = new JLabel(icon3);
        label3.setBounds(233,133,icon3.getIconWidth(),icon3.getIconHeight());

        JLabel label4 = new JLabel("Booking Number Check In");
        label4.setBounds(160,250,400,50);
        label4.setFont(new Font("SERIF",Font.BOLD,13));

        JTextField textField = new JTextField();
        textField.setBounds(160,300,230,30);

        JButton button = new JButton("Confirm");
        button.setBounds(160,350,80,30);
        button.addActionListener(e -> {
            Booking a = DataController.getBookingByNum(textField.getText());
            if(a==null)
            {
                System.out.println("error!");
                JOptionPane.showMessageDialog(frame, "Your booking number is incorrect!",
                        "error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                frame.setVisible(false);
                new Summary(a);
            }
        });

        JButton button1 = new JButton("Cancel");
        button1.setBounds(310,350,80,30);
        button1.addActionListener(e -> textField.setText(""));

        JLabel label5 = new JLabel("OR You Can Choose");
        label5.setFont(new Font("SERIF", Font.BOLD, 13));
        label5.setBounds(160,400,400,30);

        JButton button2 = new JButton("IDNum and Name");
        button2.setBounds(160,430,230,30);
        button2.addActionListener(e -> {
            new IDAndNameCheckIn();
            frame.setVisible(false);
        });

        JButton button3 = new JButton("ID Document");
        button3.setBounds(160,480,230,30);
        button3.addActionListener(e -> {
            new IDdocument();
            frame.setVisible(false);
        });

        frame.setSize(1200,675);
        frame.add(button3);
        frame.add(button2);
        frame.add(label5);
        frame.add(button);
        frame.add(button1);
        frame.add(textField);
        frame.add(label4);
        frame.add(label3);
        frame.add(label2);
        frame.add(label);
        frame.add(label1);
        frame.setVisible(true);

    }
}
