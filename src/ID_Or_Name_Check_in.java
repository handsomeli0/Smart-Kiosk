import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ID_Or_Name_Check_in {
    public ID_Or_Name_Check_in(){
        JFrame jFrame = new JFrame("Smart-Kiosk");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

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

        JLabel label3 = new JLabel("Or you can input ID number:");
        label3.setFont(new Font("微软雅黑",Font.BOLD,30));
        label3.setBounds(300,300,800,50);

        JTextField textField1 = new JTextField();
        textField1.setFont(new Font("微软雅黑",Font.BOLD,30));
        textField1.setBounds(300 ,400,600,50);

        JButton button = new JButton("Confirm");
        button.setFont(new Font("微软雅黑",Font.BOLD,20));
        button.setBounds(300,500,200,50);

        JButton button1 = new JButton("cancel");
        button1.setFont(new Font("微软雅黑",Font.BOLD,20));
        button1.setBounds(700,500,200,50);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Booking_Number_Check_in a = new Booking_Number_Check_in();
                jFrame.setVisible(false);
            }
        });

        jFrame.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        jFrame.add(button1);
        jFrame.add(button);
        jFrame.add(textField1);
        jFrame.add(label3);
        jFrame.add(label2);
        jFrame.add(textField);
        jFrame.add(label1);
        jFrame.add(label);
        jFrame.setVisible(true);
    }
}
