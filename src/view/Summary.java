package view;

import javax.swing.*;
import java.awt.*;

public class Summary
{
    public Summary(){

        ImageIcon icon1 = new ImageIcon("D:\\ModTheSpireCode\\zxc\\src\\flight.png");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());
        JFrame frame=new JFrame("summary.Summary");
        JButton B1=new JButton("Confirm and order food.");
        B1.setBounds(450,550,200,40);
        B1.addActionListener(e ->{ Seat seat=new Seat(); });
        frame.add(B1);
        JPanel panel = new JPanel();
        panel.add(new JLabel("summary.Summary"));
        JLabel sum=new JLabel("Please do check the information below before going on board .");
        sum.setBounds(20,20,1200,40);
        frame.add(sum);
        sum.setFont(new Font("微软雅黑", Font.BOLD, 35));
        JLabel label_1=new JLabel("First Name:");
        label_1.setBounds(20,120,400,30);
        label_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel FN=new JLabel(IDdocument.getFirstName());
//        FN.setBounds(300,120,400,30);
//        FN.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_2=new JLabel("Last Name:");
        label_2.setBounds(600,120,400,30);
        label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel LN=new JLabel(IDdocument.getLastName());
//        LN.setBounds(750,120,400,30);
//        LN.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_3=new JLabel("Passenger ID:");
        label_3.setBounds(20,220,400,30);
        label_3.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel PID=new JLabel(Booking.getPassengerID());
//        PID.setBounds(300,120,400,30);
//        PID.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_4=new JLabel("All staff from British Airways sincerely wish you have a good trip!");
        label_4.setBounds(200,600,1200,30);
        label_4.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_5=new JLabel("Flight Number:");
        label_5.setBounds(20,320,400,30);
        label_5.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel FID=new JLabel(Booking.getFlightID());
//        FID.setBounds(750,120,400,30);
//        FID.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_6=new JLabel("Seat:");
        label_6.setBounds(600,220,400,30);
        label_6.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel SID=new JLabel( Flight.getSeat());
//        SID.setBounds(750,220,400,30);
//        SID.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_7=new JLabel("Boarding Time:");
        label_7.setBounds(600,320,400,30);
        label_7.setFont(new Font("微软雅黑", Font.BOLD, 25));
//        JLabel BT=new JLabel( Flight.getBoardingTime());
//        BT.setBounds(750,320,400,30);
//        BT.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_8=new JLabel("FROM   LONDON");
        label_8.setBounds(200,420,400,40);
        label_8.setFont(new Font("微软雅黑", Font.BOLD, 40));
        JLabel label_9=new JLabel("TO");
        label_9.setBounds(600,420,400,40);
        label_9.setFont(new Font("微软雅黑", Font.BOLD, 40));
//        JLabel AD=new JLabel( Flight.getDestination());
//        AD.setBounds(750,420,400,30);
//        AD.setFont(new Font("微软雅黑", Font.BOLD, 25));
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        frame.add(label_5);
        frame.add(label_6);
        frame.add(label_7);
        frame.add(label_8);
        frame.add(label_9);
//        frame.add(FN);
//        frame.add(LN);
//        frame.add(PID);
//        frame.add(FID);
//        frame.add(SID);
//        frame.add(BT);
//        frame.add(AD);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(icon1.getIconWidth(),icon1.getIconHeight());
        frame.setLayout(null);
        frame.add(label1);
        frame.setVisible(true);
    }

}