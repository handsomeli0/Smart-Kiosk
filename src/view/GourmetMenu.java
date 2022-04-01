package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GourmetMenu extends JFrame{
    Double Totalprice = 0.0;
    public GourmetMenu()
    {
        setLayout(new BorderLayout());
        setTitle("GourmetMenu");
        setSize(1280,960);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //add logo
        JPanel north=new JPanel();
        north.setLayout(new GridLayout(1,1,0,0));
        JLabel logo = new JLabel();
        ImageIcon logo1;
        logo1 = new ImageIcon("src/images/Logo.png");
        Image logoimg = logo1.getImage();
        logoimg = logoimg.getScaledInstance(400, 90, Image.SCALE_AREA_AVERAGING);
        logo1.setImage(logoimg);
        logo.setIcon(logo1);
        north.add(logo);
        add(north,BorderLayout.NORTH);


        // center and south
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(1,1,0,0));

        JPanel menu=new JPanel();
        menu.setLayout(new GridLayout(3,3,0,0));
        center.add(menu);


        JPanel m1=new JPanel();
        m1.setLayout(new GridLayout(3,1,0,0));
        JPanel m2=new JPanel();
        m2.setLayout(new GridLayout(3,1,0,0));
        JPanel m3=new JPanel();
        m3.setLayout(new GridLayout(3,1,0,0));
        JPanel m4=new JPanel();
        m4.setLayout(new GridLayout(3,1,0,0));
        JPanel m5=new JPanel();
        m5.setLayout(new GridLayout(3,1,0,0));
        JPanel m6=new JPanel();
        m6.setLayout(new GridLayout(3,1,0,0));
        JPanel m7=new JPanel();
        m7.setLayout(new GridLayout(3,1,0,0));
        JPanel m8=new JPanel();
        m8.setLayout(new GridLayout(3,1,0,0));


        JPanel south=new JPanel();
        south.setLayout(new GridLayout(2,1,0,0));

        Font f=new Font (Font.DIALOG, Font.BOLD, 14);
        Font ff=new Font (Font.DIALOG, Font.BOLD, 20);



        //show pictures
        JLabel m1img = new JLabel();
        m1img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image1;
        image1 = new ImageIcon("src/images/11.jpg");
        Image img1 = image1.getImage();// 获得此图标的Image
        img1 = img1.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image1.setImage(img1);
        m1img.setIcon(image1);
        m1.add(m1img);

        JLabel m2img = new JLabel();
        m2img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image2;
        image2 = new ImageIcon("src/images/12.jpg");
        Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image2.setImage(img2);
        m2img.setIcon(image2);
        m2.add(m2img);

        JLabel m3img = new JLabel();
        m3img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image3;
        image3 = new ImageIcon("src/images/13.jpg");
        Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image3.setImage(img3);
        m3img.setIcon(image3);
        m3.add(m3img);

        JLabel m4img = new JLabel();
        m4img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image4;
        image4 = new ImageIcon("src/images/14.jpg");
        Image img4 = image4.getImage();
        img4 = img4.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image4.setImage(img4);
        m4img.setIcon(image4);
        m4.add(m4img);

        JLabel m5img = new JLabel();
        m5img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image5;
        image5 = new ImageIcon("src/images/15.jpg");
        Image img5 = image5.getImage();
        img5 = img5.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image5.setImage(img5);
        m5img.setIcon(image5);
        m5.add(m5img);

        JLabel m6img = new JLabel();
        m6img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image6;
        image6 = new ImageIcon("src/images/16.jpg");
        Image img6 = image6.getImage();
        img6 = img6.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image6.setImage(img6);
        m6img.setIcon(image6);
        m6.add(m6img);

        JLabel m7img = new JLabel();
        m7img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image7;
        image7 = new ImageIcon("src/images/17.jpg");
        Image img7 = image7.getImage();
        img7 = img7.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image7.setImage(img7);
        m7img.setIcon(image7);
        m7.add(m7img);

        JLabel m8img = new JLabel();
        m8img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image8;
        image8 = new ImageIcon("src/images/18.jpg");
        Image img8 = image8.getImage();
        img8 = img8.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image8.setImage(img8);
        m8img.setIcon(image8);
        m8.add(m8img);



        //price and description
        GourmetFood food1=new GourmetFood();
        food1.name="Drink1";
        food1.desc="Sweet!!";
        food1.price=1.9;
        GourmetFood food2=new GourmetFood();
        food2.name="Drink2";
        food2.desc="Sweet!!";
        food2.price=1.3;
        GourmetFood food3=new GourmetFood();
        food3.name="Drink3";
        food3.desc="Sweet!!";
        food3.price=1.4;
        GourmetFood food4=new GourmetFood();
        food4.name="Drink4";
        food4.desc="Sweet!!";
        food4.price=2.2;
        GourmetFood food5=new GourmetFood();
        food5.name="Drink5";
        food5.desc="Sweet!!";
        food5.price=1.6;
        GourmetFood food6=new GourmetFood();
        food6.name="Drink6";
        food6.desc="Sweet!!";
        food6.price=1.7;
        GourmetFood food7=new GourmetFood();
        food7.name="Drink7";
        food7.desc="Sweet!!";
        food7.price=1.3;
        GourmetFood food8=new GourmetFood();
        food8.name="Drink8";
        food8.desc="Sweet!!";
        food8.price=2.1;


        String PaD1 = "<html><body>" + "Price: "+ food1.price + "<br>" + food1.desc + "<body></html>";
        JLabel lbdes1=new JLabel(PaD1);// label description1
        lbdes1.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes1.setFont(f);
        m1.add(lbdes1);

        String PaD2 = "<html><body>" + "Price: "+ food2.price + "<br>" + food2.desc + "<body></html>";
        JLabel lbdes2=new JLabel(PaD2);
        lbdes2.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes2.setFont(f);
        m2.add(lbdes2);

        String PaD3 = "<html><body>" + "Price: "+ food3.price + "<br>" + food3.desc + "<body></html>";
        JLabel lbdes3=new JLabel(PaD3);
        lbdes3.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes3.setFont(f);
        m3.add(lbdes3);

        String PaD4 = "<html><body>" + "Price: "+ food4.price + "<br>" + food4.desc + "<body></html>";
        JLabel lbdes4=new JLabel(PaD4);
        lbdes4.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes4.setFont(f);
        m4.add(lbdes4);

        String PaD5 = "<html><body>" + "Price: "+ food5.price + "<br>" + food5.desc + "<body></html>";
        JLabel lbdes5=new JLabel(PaD5);
        lbdes5.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes5.setFont(f);
        m5.add(lbdes5);

        String PaD6 = "<html><body>" + "Price: "+ food6.price + "<br>" + food6.desc + "<body></html>";
        JLabel lbdes6=new JLabel(PaD6);
        lbdes6.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes6.setFont(f);
        m6.add(lbdes6);

        String PaD7 = "<html><body>" + "Price: "+ food7.price + "<br>" + food7.desc + "<body></html>";
        JLabel lbdes7=new JLabel(PaD7);
        lbdes7.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes7.setFont(f);
        m7.add(lbdes7);

        String PaD8 = "<html><body>" + "Price: "+ food8.price + "<br>" + food8.desc + "<body></html>";
        JLabel lbdes8=new JLabel(PaD8);
        lbdes8.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes8.setFont(f);
        m8.add(lbdes8);



        //choose button
        JRadioButton rb1=new JRadioButton(food1.name, false);
        JRadioButton rb2=new JRadioButton(food2.name, false);
        JRadioButton rb3=new JRadioButton(food3.name, false);
        JRadioButton rb4=new JRadioButton(food4.name, false);
        JRadioButton rb5=new JRadioButton(food5.name, false);
        JRadioButton rb6=new JRadioButton(food6.name, false);
        JRadioButton rb7=new JRadioButton(food7.name, false);
        JRadioButton rb8=new JRadioButton(food8.name, false);

        rb1.setHorizontalAlignment(SwingConstants.CENTER);
        rb2.setHorizontalAlignment(SwingConstants.CENTER);
        rb3.setHorizontalAlignment(SwingConstants.CENTER);
        rb4.setHorizontalAlignment(SwingConstants.CENTER);
        rb5.setHorizontalAlignment(SwingConstants.CENTER);
        rb6.setHorizontalAlignment(SwingConstants.CENTER);
        rb7.setHorizontalAlignment(SwingConstants.CENTER);
        rb8.setHorizontalAlignment(SwingConstants.CENTER);

        rb1.setFont(f); rb2.setFont(f); rb3.setFont(f); rb4.setFont(f);
        rb5.setFont(f); rb6.setFont(f); rb7.setFont(f); rb8.setFont(f);

        m1.add(rb1); m2.add(rb2); m3.add(rb3); m4.add(rb4);
        m5.add(rb5); m6.add(rb6); m7.add(rb7); m8.add(rb8);

        add(center,BorderLayout.CENTER);

        menu.add(m1); menu.add(m2); menu.add(m3); menu.add(m4);
        menu.add(m5); menu.add(m6); menu.add(m7); menu.add(m8);


        //total price and change page
//        Double Totalprice = 0.0;
        String TP = "<html><body>" + "Total Price: "+ Totalprice + "<body></html>";
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(ff);
        lbTP.setHorizontalAlignment(SwingConstants.CENTER);
        south.add(lbTP);


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
        this.setLocationRelativeTo(null);


        setVisible(true);
        this.setLocationRelativeTo(null);

        jbback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbback)
                {
                    dispose();
                    new Meal();
                }
            }
        });

        jbnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbnext)
                {
                    dispose();
                    new PayMent();
                }
            }
        });
    }
    public static void main(String[] agrs)
    {
        new GourmetMenu();
    }
}
