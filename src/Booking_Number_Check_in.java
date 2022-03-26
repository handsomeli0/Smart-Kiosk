import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Booking_Number_Check_in
{
    public Booking_Number_Check_in(){
        JFrame frame=new JFrame("Smart-Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon=new ImageIcon("src/images/rectangle.png");
        JLabel label=new JLabel(icon);
        label.setBounds(46,30,300,400);

        ImageIcon icon1 = new ImageIcon("src/images/background2.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(600,20,icon2.getIconWidth(),icon2.getIconHeight());

        ImageIcon icon3 = new ImageIcon("src/images/girl.png");
        JLabel label3 = new JLabel(icon3);
        label3.setBounds(148,30,icon3.getIconWidth(),icon3.getIconHeight());

        JLabel label4 = new JLabel("Booking Number Check In");
        label4.setBounds(80,150,400,50);
        label4.setFont(new Font("微软雅黑",Font.BOLD,13));

        JTextField textField = new JTextField();
        textField.setBounds(80,200,230,30);

        JButton button = new JButton("Cofirm");
        button.setBounds(80,250,80,30);

        JButton button1 = new JButton("Cancel");
        button1.setBounds(230,250,80,30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JLabel label5 = new JLabel("OR You Can Choose");
        label5.setFont(new Font("微软雅黑", Font.BOLD, 13));
        label5.setBounds(80,300,400,30);

        JButton button2 = new JButton("IDNum or Name");
        button2.setBounds(80,330,230,30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ID_Or_Name_Check_in b = new ID_Or_Name_Check_in();
                frame.setVisible(false);
            }
        });

        JButton button3 = new JButton("ID Document");
        button3.setBounds(80,380,230,30);

        frame.setSize(icon1.getIconWidth(),icon1.getIconHeight());
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
