package view;

import controller.DataController;
import model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * The class is the UI of GournmetMenu
 * @author Song Yan and Siyu Ming
 * @version 2.0
 */

public class GourmetMenu extends JFrame{
    public GourmetMenu(Booking booking, double totalPrice,int seatNum,int seatLevel,double payment,int business)
    {
        setLayout(null);
        setTitle("Gourmet Menu");
        setSize(1200, 675);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon1 = new ImageIcon("src/images/background1.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        ImageIcon icon2 = new ImageIcon("src/images/logo.png");
        JLabel label2 = new JLabel(icon2);
        label2.setBounds(800,20,icon2.getIconWidth(),icon2.getIconHeight());

        Font font1=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,14);
        Font font2=new Font (Font.SERIF, Font.BOLD, 24);
        Font font3=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,50);

        JLabel introLabel=new JLabel("Gourmet Menu for the flight!");
        introLabel.setBounds(100,0,900,70);
        introLabel.setFont(font3);
        introLabel.setForeground(Color.white);

        //show pictures
        JLabel m1img = new JLabel();
        m1img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image1;
        image1 = new ImageIcon(DataController.getGourmetFood(0).getImage());
        Image img1 = image1.getImage();
        img1 = img1.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image1.setImage(img1);
        m1img.setIcon(image1);
        m1img.setBounds(160,86,87, 78);
        add(m1img);

        JLabel m2img = new JLabel();
        m2img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image2;
        image2 = new ImageIcon(DataController.getGourmetFood(1).getImage());
        Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image2.setImage(img2);
        m2img.setIcon(image2);
        m2img.setBounds(520,86,95, 78);
        add(m2img);

        JLabel m3img = new JLabel();
        m3img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image3;
        image3 = new ImageIcon(DataController.getGourmetFood(2).getImage());
        Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image3.setImage(img3);
        m3img.setIcon(image3);
        m3img.setBounds(900,86,87, 78);
        add(m3img);

        JLabel m4img = new JLabel();
        m4img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image4;
        image4 = new ImageIcon(DataController.getGourmetFood(3).getImage());
        Image img4 = image4.getImage();
        img4 = img4.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image4.setImage(img4);
        m4img.setIcon(image4);
        m4img.setBounds(160,251,95, 78);
        add(m4img);


        JLabel m5img = new JLabel();
        m5img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image5;
        image5 = new ImageIcon(DataController.getGourmetFood(4).getImage());
        Image img5 = image5.getImage();
        img5 = img5.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image5.setImage(img5);
        m5img.setIcon(image5);
        m5img.setBounds(520,251,95, 78);
        add(m5img);

        JLabel m6img = new JLabel();
        m6img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image6;
        image6 = new ImageIcon(DataController.getGourmetFood(5).getImage());
        Image img6 = image6.getImage();
        img6 = img6.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image6.setImage(img6);
        m6img.setIcon(image6);
        m6img.setBounds(900,251,95, 78);
        add(m6img);

        JLabel m7img = new JLabel();
        m7img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image7;
        image7 = new ImageIcon(DataController.getGourmetFood(6).getImage());
        Image img7 = image7.getImage();
        img7 = img7.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image7.setImage(img7);
        m7img.setIcon(image7);
        m7img.setBounds(160,423,95, 78);
        add(m7img);

        JLabel m8img = new JLabel();
        m8img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image8;
        image8 = new ImageIcon(DataController.getGourmetFood(7).getImage());
        Image img8 = image8.getImage();
        img8 = img8.getScaledInstance(130, 120, Image.SCALE_AREA_AVERAGING);
        image8.setImage(img8);
        m8img.setIcon(image8);
        m8img.setBounds(520,423,95, 78);
        add(m8img);

        String PaD1 = "<html><body>" + DataController.getGourmetFood(0).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(0).getPrice() + "<body></html>";
        JLabel lbDes1=new JLabel(PaD1);// label description1
        lbDes1.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes1.setFont(font1);
        lbDes1.setBounds(58,155,300, 50);
        add(lbDes1);

        String PaD2 = "<html><body>" + DataController.getGourmetFood(1).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(1).getPrice() + "<body></html>";
        JLabel lbDes2=new JLabel(PaD2);
        lbDes2.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes2.setFont(font1);
        lbDes2.setBounds(458,155,300, 50);
        add(lbDes2);

        String PaD3 = "<html><body>" + DataController.getGourmetFood(2).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(2).getPrice() + "<body></html>";
        JLabel lbDes3=new JLabel(PaD3);
        lbDes3.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes3.setFont(font1);
        lbDes3.setBounds(842,155,300, 50);
        add(lbDes3);

        String PaD4 = "<html><body>" + DataController.getGourmetFood(3).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(3).getPrice() + "<body></html>";
        JLabel lbDes4=new JLabel(PaD4);
        lbDes4.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes4.setFont(font1);
        lbDes4.setBounds(62,324,300, 50);
        add(lbDes4);

        String PaD5 = "<html><body>" + DataController.getGourmetFood(4).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(4).getPrice() + "<body></html>";
        JLabel lbDes5=new JLabel(PaD5);
        lbDes5.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes5.setFont(font1);
        lbDes5.setBounds(380,324,420, 58);
        add(lbDes5);

        String PaD6 = "<html><body>" + DataController.getGourmetFood(5).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(5).getPrice() + "<body></html>";
        JLabel lbDes6=new JLabel(PaD6);
        lbDes6.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes6.setFont(font1);
        lbDes6.setBounds(771,324,450, 58);
        add(lbDes6);

        String PaD7 = "<html><body>" + DataController.getGourmetFood(6).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(6).getPrice() + "<body></html>";
        JLabel lbDes7=new JLabel(PaD7);
        lbDes7.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes7.setFont(font1);
        lbDes7.setBounds(35,496,300, 50);
        add(lbDes7);

        String PaD8 = "<html><body>" + DataController.getGourmetFood(7).getDescription() + "<br>" + "Price: "+ DataController.getGourmetFood(7).getPrice() + "<body></html>";
        JLabel lbDes8=new JLabel(PaD8);
        lbDes8.setHorizontalAlignment(SwingConstants.CENTER);
        lbDes8.setFont(font1);
        lbDes8.setBounds(425,496,300, 50);
        add(lbDes8);

        //choose button
        JButton add1=new JButton("Add");
        add1.setBounds(170,205,63, 26);
        add(add1);
        JButton add2=new JButton("Add");
        add2.setBounds(530,205,63, 26);
        add(add2);
        JButton add3=new JButton("Add");
        add3.setBounds(910,205,63, 26);
        add(add3);
        JButton add4=new JButton("Add");
        add4.setBounds(170,380,63, 26);
        add(add4);
        JButton add5=new JButton("Add");
        add5.setBounds(530,380,63, 26);
        add(add5);
        JButton add6=new JButton("Add");
        add6.setBounds(910,380,63, 26);
        add(add6);
        JButton add7=new JButton("Add");
        add7.setBounds(170,544,63, 26);
        add(add7);
        JButton add8=new JButton("Add");
        add8.setBounds(530,544,63, 26);
        add(add8);

        //total price and change page
        DecimalFormat format = new DecimalFormat("0.00");
        String TP = "<html><body>" + "Total Price: "+ format.format(new BigDecimal(totalPrice)) + "<body></html>";
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(font2);
        lbTP.setBounds(853,470,200, 40);
        add(lbTP);


        JButton jbBack=new JButton("Back");
        jbBack.setFont(font1);
        jbBack.setBounds(362,586,120, 36);
        add(jbBack);
        JButton jbNext=new JButton("Next");
        jbNext.setFont(font1);
        jbNext.setBounds(700,586,120, 36);
        add(jbNext);
        JButton jbClear=new JButton("Clear");
        jbClear.setFont(font1);
        jbClear.setBounds(0,586,120, 36);
        add(jbClear);

        add(label2);
        add(introLabel);
        add(label1);
        setVisible(true);

        add1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add1) {
                    double TP = totalPrice + DataController.getGourmetFood(0).getPrice();
                    DataController.chooseGournmet(0);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add2) {
                    double TP = totalPrice + DataController.getGourmetFood(1).getPrice();
                    DataController.chooseGournmet(1);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TP = totalPrice + DataController.getGourmetFood(2).getPrice();
                DataController.chooseGournmet(2);
                new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                dispose();
            }
        });
        add4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add4) {
                    double TP = totalPrice + DataController.getGourmetFood(3).getPrice();
                    DataController.chooseGournmet(3);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add5) {
                    double TP = totalPrice + DataController.getGourmetFood(4).getPrice();
                    DataController.chooseGournmet(4);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add6) {
                    double TP = totalPrice + DataController.getGourmetFood(5).getPrice();
                    DataController.chooseGournmet(5);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add7) {
                    double TP = totalPrice + DataController.getGourmetFood(6).getPrice();
                    DataController.chooseGournmet(6);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });
        add8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==add8) {
                    double TP = totalPrice + DataController.getGourmetFood(7).getPrice();
                    DataController.chooseGournmet(7);
                    new GourmetMenu(booking,TP,seatNum,seatLevel,payment,business);
                    dispose();
                }
            }
        });

        jbBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbBack)
                {
                    new MealWindow(booking,seatNum,seatLevel,payment,business);
                    DataController.setGournmetFoodListToNull();
                    dispose();
                }
            }
        });

        jbNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbNext)
                {
                    if(totalPrice + payment == 0) {
                        try {
                            new Confirm( booking, seatNum, seatLevel, 0, 0,business);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        new Payment(booking, totalPrice, seatNum, seatLevel, payment,business);
                    }
                    dispose();
                }
            }
        });

        jbClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbClear) {
                    new GourmetMenu(booking,0,seatNum,seatLevel,payment,business);
                    DataController.getGournmetFoodNum();
                    dispose();
                }
            }
        });
    }
}
