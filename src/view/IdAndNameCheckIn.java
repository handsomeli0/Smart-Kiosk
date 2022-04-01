package view;
import controller.DataController;
import model.Booking;
import java.awt.*;
import javax.swing.*;

/**
 * This class is the UI of ID and surname check in.
 *
 * @author Song Yan
 * @version 1.1
 */

public class IdAndNameCheckIn {
    public IdAndNameCheckIn(){
        JFrame frame = new JFrame("Smart-Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon=new ImageIcon("src/images/background1.jpg");
        JLabel label=new JLabel(icon);
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label1 = new JLabel(icon2);
        label1.setBounds(660,20,icon2.getIconWidth(),icon2.getIconHeight());

        JLabel label2 = new JLabel("Please input your surname:");
        label2.setFont(new Font("微软雅黑",Font.BOLD,30));
        label2.setBounds(300,100,800,50);

        JTextField textField = new JTextField();
        textField.setFont(new Font("微软雅黑",Font.BOLD,30));
        textField.setBounds(300 ,200,600,50);

        JLabel label3 = new JLabel("Please input ID number:");
        label3.setFont(new Font("微软雅黑",Font.BOLD,30));
        label3.setBounds(300,300,800,50);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("微软雅黑",Font.BOLD,30));
        textField1.setBounds(300 ,400,600,50);

        JButton button = new JButton("Confirm");
        button.setFont(new Font("微软雅黑",Font.BOLD,20));
        button.setBounds(300,500,200,50);
        button.addActionListener(e -> {
            Booking a = DataController.getBookingBySurnameIdNum(textField.getText(),textField1.getText());
            System.out.println(textField.getText()+textField1.getText());
            if(a==null)
            {
                System.out.println("error!");
                JOptionPane.showMessageDialog(frame, "Your booking number is incorrect!",
                        "error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                Summary.setFlight(a);
               frame.setVisible(false);
               new Summary();
            }
        });

        JButton button1 = new JButton("cancel");
        button1.setFont(new Font("微软雅黑",Font.BOLD,20));
        button1.setBounds(700,500,200,50);
        button1.addActionListener(e -> {
            new bookingNumberCheckIn();
            frame.setVisible(false);
        });

        frame.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        frame.add(button1);
        frame.add(button);
        frame.add(textField1);
        frame.add(label3);
        frame.add(label2);
        frame.add(textField);
        frame.add(label1);
        frame.add(label);
        frame.setVisible(true);
    }
}
