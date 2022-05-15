package view;

import model.*;
import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * The class is the UI of Payment
 * @author Song Yan and Siyu Ming
 * @version 2.0
 */

public class Payment extends JFrame{
    public Payment(Booking booking, double totalPrice,int seatNum,int seatLevel,double payment) {
        setLayout(null);
        setTitle("Payment");
        setSize(1200,675);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon1 = new ImageIcon("src/images/background1.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(800,20,icon2.getIconWidth(),icon2.getIconHeight());

        Font font1 = new Font(Font.SERIF, Font.BOLD, 17);
        Font font2=new Font (Font.SERIF, Font.BOLD, 37);
        Font font3=new Font (Font.SERIF, Font.BOLD, 23);
        Font font4=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,50);

        JLabel introLabel=new JLabel("Payment");
        introLabel.setBounds(100,0,900,70);
        introLabel.setFont(font4);
        introLabel.setForeground(Color.white);


        //total price
        DecimalFormat format = new DecimalFormat("0.00");
        String TP = "<html><body>" + "Seat Price: " + payment + "<br>" + "GourmetMeal Price: " + format.format(new BigDecimal(totalPrice)) + "<body></html>";
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(font2);
        lbTP.setHorizontalAlignment(SwingConstants.CENTER);
        lbTP.setBounds(100,80,1000,80);
        add(lbTP);


        //account
        JLabel accLabel=new JLabel("CreditCardID: ");
        accLabel.setFont(font3);
        accLabel.setBounds(210,213,170,27);
        add(accLabel);

        JTextField accTxt=new JTextField(30);    //创建account文本框
        accTxt.setFont(font1);
        accTxt.setBounds(400,213,600,27);
        add(accTxt);



        //south: check and page change
        JButton jbBack=new JButton("Cancel");
        jbBack.setFont(font1);
        jbBack.setBounds(362,586,120, 36);
        add(jbBack);

        JButton jbConfirm=new JButton("Confirm");
        jbConfirm.setFont(font1);
        jbConfirm.setBounds(700,586,120, 36);
        add(jbConfirm);

        add(label2);
        add(introLabel);
        add(label1);
        setVisible(true);

        jbBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbBack) {
                    new MealWindow(booking,seatNum,seatLevel,payment);
                    DataController.setGournmetFoodListToNull();
                    dispose();
                }
            }
        });

        jbConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(e.getSource()==jbConfirm) {
                        int card = Integer.parseInt(accTxt.getText().toString());
                        double TP = totalPrice + payment;
                        if (DataController.checkPayment(booking.getPassengerID(), card)) {
                            JOptionPane.showMessageDialog(null, "Payment Successful!");
                            try {
                                new Confirm( booking, seatNum, seatLevel, payment, TP);
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Payment False: The credit card information is incorrect!");
                        }
                    }
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Payment False: The credit card information is incorrect!");
//                    System.out.println("Exception Occur: " + exception);
                }
            }
        });
    }
}
