package view;
import controller.DataController;
import model.*;
import javax.swing.*;
import java.awt.*;

public class Summary
{
    public Summary(Booking A){
        Flight B=DataController.getFlightByFlightID(A.getFlightID());

        ImageIcon icon1 = new ImageIcon("src\\images\\background1.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());
        ImageIcon icon2 = new ImageIcon("src\\images\\logo.png");
        JLabel label_10 = new JLabel(icon2);
        label_10.setBounds(820,20,icon2.getIconWidth(),icon2.getIconHeight());
        JFrame frame=new JFrame("summary.Summary");
        JButton B1=new JButton("Confirm and order food.");
        B1.setBounds(200,550,200,40);
        B1.addActionListener(e ->{
            frame.setVisible(false);
            Seat seat=new Seat(A.getFlightID(),A.getPassengerID(),A);});
        frame.add(B1);
        JButton B2=new JButton("Return to the last page.");
        B2.setBounds(700,550,200,40);
        B2.addActionListener(e ->{
            frame.setVisible(false);
            BookingNumberCheckIn BookingNumberCheckIn=new BookingNumberCheckIn();});
        frame.add(B2);
        JPanel panel = new JPanel();
        panel.add(new JLabel("summary.Summary"));
        JLabel sum=new JLabel("Summary of the details .");
        sum.setBounds(300,20,1200,40);
        frame.add(sum);
        sum.setFont(new Font("SERIF", Font.BOLD, 35));
        JLabel label_1=new JLabel("Gate:");
        label_1.setBounds(20,120,400,30);
        label_1.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel gate=new JLabel(B.getGate());
        gate.setBounds(300,120,400,30);
        gate.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_2=new JLabel("Date:");
        label_2.setBounds(600,120,400,30);
        label_2.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel date=new JLabel(B.getDate());
        date.setBounds(750,120,400,30);
        date.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_3=new JLabel("Price:");
        label_3.setBounds(20,220,400,30);
        label_3.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel Price=new JLabel(""+B.getPrice());
        Price.setBounds(300,220,400,30);
        Price.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_4=new JLabel("All staff from British Airways sincerely wish you have a good trip!");
        label_4.setBounds(200,600,1200,30);
        label_4.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_5=new JLabel("Flight Number:");
        label_5.setBounds(20,320,400,30);
        label_5.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel FID=new JLabel(A.getFlightID());
        FID.setBounds(300,320,400,30);
        FID.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_6=new JLabel("Passenger ID:");
        label_6.setBounds(600,220,400,30);
        label_6.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel PID=new JLabel( A.getPassengerID());
        PID.setBounds(800,220,400,30);
        PID.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_7=new JLabel("Boarding Time:");
        label_7.setBounds(600,320,400,30);
        label_7.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel BT=new JLabel( B.getBoardingTime());
        BT.setBounds(800,320,400,30);
        BT.setFont(new Font("SERIF", Font.BOLD, 25));
        JLabel label_8=new JLabel("FROM   LONDON");
        label_8.setBounds(200,420,400,40);
        label_8.setFont(new Font("SERIF", Font.BOLD, 40));
        JLabel label_9=new JLabel("TO");
        label_9.setBounds(600,420,400,40);
        label_9.setFont(new Font("SERIF", Font.BOLD, 40));
        JLabel AD=new JLabel( B.getDestination());
        AD.setBounds(750,420,400,30);
        AD.setFont(new Font("SERIF", Font.BOLD, 25));
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        frame.add(label_5);
        frame.add(label_6);
        frame.add(label_7);
        frame.add(label_8);
        frame.add(label_9);
        frame.add(label_10);
        frame.add(date);
        frame.add(gate);
        frame.add(Price);
        frame.add(FID);
        frame.add(PID);
        frame.add(BT);
        frame.add(AD);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(icon1.getIconWidth(),icon1.getIconHeight());
        frame.setLayout(null);
        frame.add(label1);
        frame.setVisible(true);
    }

}