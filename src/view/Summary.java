package view;

import javax.swing.*;
import java.awt.*;

public class Summary
{
    public Summary(){

        ImageIcon icon1 = new ImageIcon("src\\image\\123.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());
        JFrame frame=new JFrame("summary.Summary");
        JButton B1=new JButton("Confirm and order food.");
        B1.setBounds(450,550,200,40);
//        B1.addActionListener(e ->{ Seat seat=new Seat(); });
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
        JLabel label_2=new JLabel("Last Name:");
        label_2.setBounds(600,120,400,30);
        label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_3=new JLabel("Passenger ID:");
        label_3.setBounds(20,220,400,30);
        label_3.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_4=new JLabel("All staff from British Airways sincerely wish you have a good trip!");
        label_4.setBounds(200,600,1200,30);
        label_4.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_5=new JLabel("Flight Number:");
        label_5.setBounds(20,320,400,30);
        label_5.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_6=new JLabel("summary.Seat:");
        label_6.setBounds(600,220,400,30);
        label_6.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_7=new JLabel("Boarding Time:");
        label_7.setBounds(600,320,400,30);
        label_7.setFont(new Font("微软雅黑", Font.BOLD, 25));
        JLabel label_8=new JLabel("FROM");
        label_8.setBounds(200,420,400,40);
        label_8.setFont(new Font("微软雅黑", Font.BOLD, 40));
        JLabel label_9=new JLabel("TO");
        label_9.setBounds(600,420,400,40);
        label_9.setFont(new Font("微软雅黑", Font.BOLD, 40));
        frame.add(label_1);
        frame.add(label_2);
        frame.add(label_3);
        frame.add(label_4);
        frame.add(label_5);
        frame.add(label_6);
        frame.add(label_7);
        frame.add(label_8);
        frame.add(label_9);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(icon1.getIconWidth(),icon1.getIconHeight());
        frame.setLayout(null);
        frame.add(label1);
        frame.setVisible(true);

    }

}