package view;

import controller.DataController;
import model.Booking;
import model.Passenger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IDdocument  {

    public IDdocument() {

        model.IDdocument iDdocument = DataController.getIDdocument();

        JFrame frame=new JFrame("ID document check-in");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img1 = new ImageIcon("src/image//background.jpg");//这是背景图片1
        JLabel imgLabel1 = new JLabel(img1);//将背景图放在标签里。
        ImageIcon img2 = new ImageIcon("src/image//icon.jpg");//这是背景图片2
        JLabel imgLabel2 = new JLabel(img2);//将背景图放在标签里。


        frame.getLayeredPane().add(imgLabel1, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。
        imgLabel1.setBounds(0,0,img1.getIconWidth(), img1.getIconHeight());//设置背景标签的位置
        Container cp=frame.getContentPane();
        frame.setLayout(null);

        JButton confirm=new JButton("confirm");//创建按钮
        JButton cancel=new JButton("cancel");
        JTextField txtfield1=new JTextField();//创建文本框
        txtfield1.setEditable(false);
        txtfield1.setText("Put your ID document here and click confirm");
        txtfield1.setHorizontalAlignment(JTextField.CENTER);

        JPanel jp1=new JPanel();                 //创建三个面板
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();
        jp1.setLayout(null);                     //将三个面板的布局设置成null
        jp2.setLayout(null);
        jp3.setLayout(null);
        jp1.setBounds(0,0,1200,400);             //设置了图片 文本框 按钮的位置
        jp2.setBounds(0,200,1200,400);
        jp3.setBounds(0,400,1200,500);
        imgLabel2.setBounds(500,0,700,150);
        txtfield1.setBounds(300,0,575,300);
        confirm.setBounds(400,200,100,50);
        cancel.setBounds(700,200,100,50);
        jp1.setBackground(Color.WHITE);           //将三个面板背景色设置成透明
        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp1.setOpaque(false);
        jp2.setOpaque(false);
        jp3.setOpaque(false);
        txtfield1.setBackground(Color.WHITE);     //将文本框区域背景色设置成透明
        txtfield1.setOpaque(false);
        txtfield1.setFont(new Font("楷体",Font.BOLD,20));


        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        jp1.add(imgLabel2);
        jp2.add(txtfield1);
        jp3.add(confirm);
        jp3.add(cancel);
        confirm.addActionListener(e -> {
            Booking a = DataController.getBookingBySurnameIdNum(iDdocument.getLastName(),iDdocument.getIdNum());
            new Summary(a);
            frame.setVisible(false);
        });
        cancel.addActionListener(e -> {new bookingNumberCheckIn();
            frame.setVisible(false);
        });

        ((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。

        frame.setSize(1200,700);
        frame.setVisible(true);
    }
}