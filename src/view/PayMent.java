package view;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayMent extends JFrame{
    public PayMent(Flight flight, Passenger passenger, Booking booking) {
        setLayout(new BorderLayout());
        setTitle("Payment");
        setSize(1200,675);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add logo
        JPanel north=new JPanel();
        north.setLayout(new GridLayout(1,1,0,0));
//        JLabel logo = new JLabel();
//        ImageIcon logo1;
//        logo1 = new ImageIcon("src/images/Logo.png");
//        Image logoimg = logo1.getImage();
//        logoimg = logoimg.getScaledInstance(340, 80, Image.SCALE_AREA_AVERAGING);
//        logo1.setImage(logoimg);
//        logo.setIcon(logo1);
//        north.add(logo);
        add(north,BorderLayout.NORTH);



        //center
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(2,1,0,0));
        add(center,BorderLayout.CENTER);

        JPanel south=new JPanel();
        south.setLayout(new GridLayout(1,1,0,0));

        Font f=new Font (Font.DIALOG, Font.BOLD, 14);
        Font ff=new Font (Font.DIALOG, Font.BOLD, 20);



        JPanel intro=new JPanel();
        JLabel introlabel=new JLabel("Please check your credit card to pay the extra fee");
        introlabel.setHorizontalAlignment(SwingConstants.CENTER);
        introlabel.setFont(ff);
        intro.add(introlabel);
        north.add(intro);


        //description
//        JPanel intro=new JPanel();
//        JLabel introlabel=new JLabel("Please fill in your bank account and pin to pay the extra fee");
//        introlabel.setHorizontalAlignment(SwingConstants.CENTER);
//        introlabel.setFont(ff);
//        intro.add(introlabel);
//        center.add(intro);

        //total price
        Double Totalprice = 0.0;
        String TP = "<html><body>" + "Total Price: "+ Totalprice + "<body></html>";
        JPanel panTP=new JPanel();
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(ff);
        lbTP.setHorizontalAlignment(SwingConstants.CENTER);
        panTP.add(lbTP);
        center.add(panTP);

        //account
        JPanel account=new JPanel();
        JTextField acctxt=new JTextField(50);    //创建account文本框
        acctxt.setFont(f);
        JLabel acclabel=new JLabel("Account: ");
        acclabel.setFont(f);
        acclabel.setHorizontalAlignment(SwingConstants.CENTER);
        account.add(acclabel);
        account.add(acctxt);
        center.add(account);

        //south: check and page change
        JPanel button=new JPanel();
        JButton jbback=new JButton("Back");
        JButton jbnext=new JButton("Next");
//        JButton jbclear=new JButton("Clear");

        jbback.setFont(f);
        jbnext.setFont(f);
//        jbclear.setFont(f);

        button.add(jbback);
        button.add(jbnext);
//        button.add(jbclear);

        south.add(button);
        add(south,BorderLayout.SOUTH);

        setVisible(true);
//        this.setLocationRelativeTo(null);

        jbback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbback)
                {
                    new GourmetMenu(flight,passenger,booking);
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Flight flight = new Flight();
        Passenger passenger = new Passenger();
        Booking booking = new Booking();
        new PayMent(flight, passenger, booking);
    }

}
