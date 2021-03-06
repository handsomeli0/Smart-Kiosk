package view;

import controller.DataController;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PeripheralController;
import model.Booking;
import javax.swing.*;

/**
 * The class is the UI of Confirm
 * @author Xiantian Chen and Changming Xu
 */
public class Confirm {
    public Confirm( Booking booking, int seatNum, int seatLevel, double payment, double totalPrice, String mealName) throws IOException {
        JFrame frame = new JFrame("Confirm");
        JLabel jLabel = new JLabel("The meal you have chosen :"+mealName);
        jLabel.setBounds(20,40,600,30);
        jLabel.setFont(new Font("SERIF", 1, 25));

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
        JTextField txtField1 = new JTextField();
        txtField1.setEditable(false);
        txtField1.setText("Put your ID document here and click confirm");
        txtField1.setHorizontalAlignment(0);
        JLabel label_1 = new JLabel("The seat you have chosen:");
        label_1.setBounds(20, 80, 400, 30);
        label_1.setFont(new Font("SERIF", 1, 25));
        JLabel label_3 = new JLabel("Seat number: " + seatNum + " , Class: " + (seatLevel == 0 ? "Economy" : "Business"));
        label_3.setBounds(300, 80, 500, 30);
        label_3.setFont(new Font("SERIF", 1, 25));
        String GF = DataController.showGourmetFood();
        JLabel label_2 = new JLabel("The gourmet food you have chosen: " );
        label_2.setBounds(20, 120, 500, 30);
        label_2.setFont(new Font("SERIF", 1, 25));
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setBounds(20,160,500,300);
        textArea.setText(GF);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        DecimalFormat format = new DecimalFormat("0.00");
        JLabel label_4 = new JLabel("Total payment is:" + format.format(new BigDecimal(totalPrice)));
        label_4.setBounds(20, 400, 400, 30);
        label_4.setFont(new Font("SERIF", 1, 25));
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        jp1.setLayout((LayoutManager)null);
        jp2.setLayout((LayoutManager)null);
        jp3.setLayout((LayoutManager)null);
        jp1.setBounds(0, 0, 1200, 100);
        jp2.setBounds(0, 150, 1200, 400);
        jp3.setBounds(0, 400, 1200, 250);
        imgLabel2.setBounds(650, 0, 700, 100);
        txtField1.setBounds(300, 0, 600, 275);
        confirm.setBounds(550, 150, 100, 50);
        cancel.setBounds(1050, 150, 100, 50);
        back.setBounds(50, 150, 100, 50);
        jp1.setBackground(Color.WHITE);
        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp1.setOpaque(false);
        jp2.setOpaque(false);
        jp3.setOpaque(false);
        txtField1.setBackground(Color.WHITE);
        txtField1.setOpaque(false);
        txtField1.setFont(new Font("SERIF", 1, 20));
        JTextField txtfield2=new JTextField();
        txtfield2.setBounds(200,300,800,50);
        txtfield2.setEditable(false);
        txtfield2.setText("Tips: Please check your flight booking information and put your ID card into the scanning box for check-in.");
        txtfield2.setHorizontalAlignment(JTextField.CENTER);
        txtfield2.setBackground(Color.WHITE);
        txtfield2.setOpaque(false);
        txtfield2.setFont(new Font("SERIF",Font.BOLD,15));
        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        frame.add(textArea);
        frame.add(jLabel);
        jp1.add(imgLabel2);
        jp2.add(txtField1);
        jp2.add(txtfield2);
        jp3.add(confirm);
        jp3.add(cancel);
        jp3.add(back);
        cancel.addActionListener((e) -> {
            new BookingNumberCheckIn();
            DataController.setGournmetFoodListToNull();
            frame.setVisible(false);
        });
        back.addActionListener((e) -> {
            new MealWindow(booking, seatNum, seatLevel, payment);
            DataController.setGournmetFoodListToNull();
            frame.setVisible(false);
        });
        confirm.addActionListener(e -> {
            try {
                if(e.getSource()==confirm) {
                    if (DataController.checkIdDocument(booking) == true) {
                        JOptionPane.showMessageDialog(null,"Check in Successfully!");
                        DataController.updateSeat(booking.getFlightID(), seatNum);
                        PeripheralController.printBoardingPass(booking, seatLevel, seatNum);
                        PeripheralController.printTag(booking);
                        PeripheralController.printTicket(booking);
                        PeripheralController.sendInformation(booking, seatLevel, seatNum, mealName, DataController.showGourmetFood(), format.format(new BigDecimal(totalPrice)));
                        DataController.setFinished(booking);
                        new FinalPage();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Check in False: The ID document is incorrect!");
                        new Confirm(booking,seatNum,seatLevel,payment,totalPrice, mealName);
                    }
                }
                frame.setVisible(false);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        ((JPanel)cp).setOpaque(false);
        frame.setSize(1200, 675);
        frame.setVisible(true);
    }
}