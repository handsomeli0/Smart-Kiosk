package view;

import controller.DataController;
import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealWindow extends JFrame {
    public MealWindow( String passengerID, Booking booking,int seatNum,int seatLevel,double payment) {

        setLayout(null);
        setTitle("Meal");
        setSize(1200, 675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon1 = new ImageIcon("src/images/background1.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(800,20,icon2.getIconWidth(),icon2.getIconHeight());

        Font f = new Font(Font.SERIF, Font.BOLD, 17);
        Font font1=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,50);
        Font font2=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,17);

        JLabel introLabel=new JLabel("Please choose your meal!");
        introLabel.setBounds(120,0,900,70);
        introLabel.setFont(font1);
        introLabel.setForeground(Color.white);

        //picture
        JLabel m1img = new JLabel();//a JLabel with picture
        m1img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image1;
        image1 = new ImageIcon(DataController.getMeal(0).getImage());
        Image img1 = image1.getImage();// get Image
        img1 = img1.getScaledInstance(240, 152, Image.SCALE_AREA_AVERAGING);
        image1.setImage(img1);
        m1img.setIcon(image1);
        m1img.setBounds(200,90,240, 130);
        add(m1img);

        JLabel m2img = new JLabel();
        m2img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image2;
        image2 = new ImageIcon(DataController.getMeal(1).getImage());
        Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(240, 152, Image.SCALE_AREA_AVERAGING);
        image2.setImage(img2);
        m2img.setIcon(image2);
        m2img.setBounds(770,90,240,130);
        add(m2img);

        JLabel m3img = new JLabel();
        m3img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image3;
        image3 = new ImageIcon(DataController.getMeal(2).getImage());
        Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(240, 152, Image.SCALE_AREA_AVERAGING);
        image3.setImage(img3);
        m3img.setIcon(image3);
        m3img.setBounds(200,320,240, 130);
        add(m3img);

        JLabel m4img = new JLabel();
        m4img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image4;
        image4 = new ImageIcon(DataController.getMeal(3).getImage());
        Image img4 = image4.getImage();
        img4 = img4.getScaledInstance(240, 152, Image.SCALE_AREA_AVERAGING);
        image4.setImage(img4);
        m4img.setIcon(image4);
        m4img.setBounds(770,320,240, 130);
        add(m4img);

        String PaD1 = "<html><body>" + "Description: " + DataController.getMeal(0).getDescription() + "<body></html>";
        JLabel lbDes1 = new JLabel(PaD1);// label description1
        lbDes1.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes1.setFont(font2);
        lbDes1.setBounds(30,215,600, 40);
        add(lbDes1);

        String PaD2 = "<html><body>" + "Description: " +DataController.getMeal(1).getDescription() + "<body></html>";
        JLabel lbDes2 = new JLabel(PaD2);
        lbDes2.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes2.setFont(font2);
        lbDes2.setBounds(620,215,600, 40);
        add(lbDes2);

        String PaD3 = "<html><body>" + "Description: " +DataController.getMeal(2).getDescription() + "<body></html>";
        JLabel lbDes3 = new JLabel(PaD3);
        lbDes3.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes3.setFont(font2);
        lbDes3.setBounds(30,443,600, 40);
        add(lbDes3);

        String PaD4 = "<html><body>" + "Description: " +DataController.getMeal(3).getDescription() + "<body></html>";
        JLabel lbDes4 = new JLabel(PaD4);
        lbDes4.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes4.setFont(font2);
        lbDes4.setBounds(620,443,600, 40);
        add(lbDes4);

        //chose meal button
        JRadioButton rb1 = new JRadioButton(DataController.getMeal(0).getName(), true);
        JRadioButton rb2 = new JRadioButton(DataController.getMeal(1).getName(), false);
        JRadioButton rb3 = new JRadioButton(DataController.getMeal(2).getName(), false);
        JRadioButton rb4 = new JRadioButton(DataController.getMeal(3).getName(), false);

        rb1.setFont(f);
        rb1.setBounds(240,260,160, 30);
        add(rb1);
        rb2.setFont(f);
        rb2.setBounds(837,260,112, 30);
        add(rb2);
        rb3.setFont(f);
        rb3.setBounds(203,481,220, 30);
        add(rb3);
        rb4.setFont(f);
        rb4.setBounds(837,481,112, 30);
        add(rb4);


        ButtonGroup group = new ButtonGroup();//button group
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);

        //Remarks and next page
        JLabel remarkLabel = new JLabel("Remarks (etc. Special meals): ");
        remarkLabel.setFont(font2);
        remarkLabel.setBounds(40,535,230, 30);
        add(remarkLabel);

        JTextArea remarkTxt = new JTextArea(2, 70);
        remarkTxt.setFont(f);
        remarkTxt.setBounds(260,535,800, 36);
        add(remarkTxt);

        JButton jbBack = new JButton("Back");
        JButton jbNext = new JButton("Next");

        jbBack.setFont(f);
        jbBack.setBounds(362,586,120, 36);
        add(jbBack);
        jbNext.setFont(f);
        jbNext.setBounds(700,586,120, 36);
        add(jbNext);

        add(label2);
        add(introLabel);
        add(label1);
        setVisible(true);

        //nextPage
        double totalPrice = 0;

        jbBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jbBack) {
                    new Seat(booking);
                    dispose();
                }
            }
        });

        jbNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jbNext) {
                    new GourmetMenu(passengerID,booking,totalPrice,seatNum,seatLevel,payment);
                    dispose();
                }
            }
        });
    }
}