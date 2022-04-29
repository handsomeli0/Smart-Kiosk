//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import controller.DataController;
import controller.PeripheralController;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Booking;
import model.IDdocument;

public class Confirm {
    public Confirm( String passenger, Booking booking, int seatnum, int seatlevel, double payment, double totalPrice) throws IOException {
        IDdocument iDdocument = DataController.getIDdocument();
        JFrame frame = new JFrame("Confirm");
        frame.setDefaultCloseOperation(3);
        ImageIcon img1 = new ImageIcon("src/images//background1.jpg");
        JLabel imgLabel1 = new JLabel(img1);
        ImageIcon img2 = new ImageIcon("src/images//logo.png");
        JLabel imgLabel2 = new JLabel(img2);
        frame.getLayeredPane().add(imgLabel1, new Integer(-2147483648));
        imgLabel1.setBounds(0, 0, img1.getIconWidth(), img1.getIconHeight());
        Container cp = frame.getContentPane();
        frame.setLayout((LayoutManager)null);
        JButton confirm = new JButton("confirm");
        JButton cancel = new JButton("cancel");
        JButton back = new JButton("back");
        JTextField txtfield1 = new JTextField();
        txtfield1.setEditable(false);
        txtfield1.setText("Put your ID document here and click confirm");
        txtfield1.setHorizontalAlignment(0);
        JLabel label_1 = new JLabel("The seat you have chosen:");
        label_1.setBounds(20, 80, 400, 30);
        label_1.setFont(new Font("SERIF", 1, 25));
        JLabel label_3 = new JLabel("Seat number is: " + seatnum + " ,level is:  " + seatlevel);
        label_3.setBounds(300, 80, 400, 30);
        label_3.setFont(new Font("SERIF", 1, 25));

        String GF = DataController.showGourmetFood();
        JLabel label_2 = new JLabel("The gourmet you have chosen: " + GF);
        label_2.setBounds(20, 120, 1200, 30);
        label_2.setFont(new Font("SERIF", 1, 25));
        JLabel label_4 = new JLabel("Total payment is:" + totalPrice);
        label_4.setBounds(20, 400, 400, 30);
        label_4.setFont(new Font("SERIF", 1, 25));
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        jp1.setLayout((LayoutManager)null);
        jp2.setLayout((LayoutManager)null);
        jp3.setLayout((LayoutManager)null);
        jp1.setBounds(0, 0, 1200, 100);
        jp2.setBounds(0, 150, 1200, 300);
        jp3.setBounds(0, 400, 1200, 225);
        imgLabel2.setBounds(650, 0, 700, 100);
        txtfield1.setBounds(300, 0, 600, 300);
        confirm.setBounds(550, 150, 100, 50);
        cancel.setBounds(1050, 150, 100, 50);
        back.setBounds(50, 150, 100, 50);
        jp1.setBackground(Color.WHITE);
        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp1.setOpaque(false);
        jp2.setOpaque(false);
        jp3.setOpaque(false);
        txtfield1.setBackground(Color.WHITE);
        txtfield1.setOpaque(false);
        txtfield1.setFont(new Font("SERIF", 1, 20));
        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        jp1.add(imgLabel2);
        jp2.add(txtfield1);
        jp3.add(confirm);
        jp3.add(cancel);
        jp3.add(back);
        cancel.addActionListener((e) -> {
            new BookingNumberCheckIn();
            frame.setVisible(false);
        });
        back.addActionListener((e) -> {
            new MealWindow( passenger, booking, seatnum, seatlevel, payment);
            frame.setVisible(false);
        });
        ((JPanel)cp).setOpaque(false);
        frame.setSize(1200, 675);
        frame.setVisible(true);
    }
}
