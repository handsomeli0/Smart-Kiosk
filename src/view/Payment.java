package view;

import model.*;
import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Payment extends JFrame{
    public Payment(String flightID, String passengerID, Booking booking, double totalPrice) {
        setLayout(new BorderLayout());
        setTitle("Payment");
        setSize(1200,675);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add logo
        JPanel north=new JPanel();
        north.setLayout(new GridLayout(1,1,0,0));
        add(north,BorderLayout.NORTH);

        //center
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(3,1,0,0));
        add(center,BorderLayout.CENTER);

        JPanel south=new JPanel();
        south.setLayout(new GridLayout(1,1,0,0));

        Font f=new Font (Font.SERIF, Font.BOLD, 14);
        Font ff=new Font (Font.SERIF, Font.BOLD, 20);


        JPanel intro=new JPanel();
        JLabel introlabel=new JLabel("Please check your credit card to pay the extra fee");
        introlabel.setHorizontalAlignment(SwingConstants.CENTER);
        introlabel.setFont(ff);
        intro.add(introlabel);
        north.add(intro);


        //total price
        DecimalFormat format = new DecimalFormat("0.00");
        String TP = "<html><body>" + "Total Price: "+ format.format(new BigDecimal(totalPrice)) + "<body></html>";
        JPanel panTP=new JPanel();
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(ff);
        lbTP.setHorizontalAlignment(SwingConstants.CENTER);
        panTP.add(lbTP);
        center.add(panTP);

        //account
        JPanel account=new JPanel();
        JTextField acctxt=new JTextField(30);    //创建account文本框
        acctxt.setFont(f);


        JLabel acclabel=new JLabel("CreditCardID: ");
        acclabel.setFont(f);
        acclabel.setHorizontalAlignment(SwingConstants.CENTER);
        account.add(acclabel);
        account.add(acctxt);
        center.add(account);

        //south: check and page change
        JPanel button=new JPanel();
        JButton jbback=new JButton("Cancel");
        JButton jbnext=new JButton("Confirm");

        jbback.setFont(f);
        jbnext.setFont(f);

        button.add(jbback);
        button.add(jbnext);

        south.add(button);
        add(south,BorderLayout.SOUTH);

        setVisible(true);

        jbback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbback) {
                        new MealWindow(flightID, passengerID, booking);
                        dispose();
                }
            }
        });

//        jbnext.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(e.getSource()==jbnext) {
//                    if (Integer.parseInt(acctxt.getText()) == passenger.getCreditCardID()) {
//                        JOptionPane.showMessageDialog(null,"Payment Successful!");
//                        new MealWindow(flight, passenger, booking);
//                        dispose();
//                    }
//                    else {
//                        JOptionPane.showMessageDialog(null,"Payment False: The credit card information is incorrect!");
//                    }
//                }
//            }
//        });

        jbnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbnext) {
                    int Card = Integer.parseInt(acctxt.getText());
                    if (DataController.checkPayment(passengerID,Card) == true) {
                        JOptionPane.showMessageDialog(null,"Payment Successful!");
                        new Confirm(flightID, passengerID, booking);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Payment False: The credit card information is incorrect!");
                    }
                }
            }
        });
    }

}
