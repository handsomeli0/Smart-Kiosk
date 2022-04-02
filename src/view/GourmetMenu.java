package view;

import model.GourmetFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GourmetMenu extends JFrame{
    Double TotalPrice = 0.0;
    public GourmetMenu()
    {
        setLayout(new BorderLayout());
        setTitle("GourmetMenu");
//        setSize(1280,960);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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



        GourmetFood food1=new GourmetFood();
        GourmetFood food2=new GourmetFood();
        GourmetFood food3=new GourmetFood();
        GourmetFood food4=new GourmetFood();
        GourmetFood food5=new GourmetFood();
        GourmetFood food6=new GourmetFood();
        GourmetFood food7=new GourmetFood();
        GourmetFood food8=new GourmetFood();

        //show pictures
        JLabel m1img = new JLabel();
        m1img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image1;
        image1 = new ImageIcon("src/images/Drink1.png");
        Image img1 = image1.getImage();// 获得此图标的Image
        img1 = img1.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image1.setImage(img1);
        m1img.setIcon(image1);
        food1.setImage(image1);
        m1.add(m1img);

        JLabel m2img = new JLabel();
        m2img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image2;
        image2 = new ImageIcon("src/images/Drink2.png");
        Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image2.setImage(img2);
        m2img.setIcon(image2);
        food2.setImage(image2);
        m2.add(m2img);

        JLabel m3img = new JLabel();
        m3img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image3;
        image3 = new ImageIcon("src/images/Drink3.png");
        Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image3.setImage(img3);
        m3img.setIcon(image3);
        food3.setImage(image3);
        m3.add(m3img);

        JLabel m4img = new JLabel();
        m4img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image4;
        image4 = new ImageIcon("src/images/Food1.png");
        Image img4 = image4.getImage();
        img4 = img4.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image4.setImage(img4);
        m4img.setIcon(image4);
        food4.setImage(image4);
        m4.add(m4img);

        JLabel m5img = new JLabel();
        m5img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image5;
        image5 = new ImageIcon("src/images/Food2.png");
        Image img5 = image5.getImage();
        img5 = img5.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image5.setImage(img5);
        m5img.setIcon(image5);
        food5.setImage(image5);
        m5.add(m5img);

        JLabel m6img = new JLabel();
        m6img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image6;
        image6 = new ImageIcon("src/images/Food3.png");
        Image img6 = image6.getImage();
        img6 = img6.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image6.setImage(img6);
        m6img.setIcon(image6);
        food6.setImage(image6);
        m6.add(m6img);

        JLabel m7img = new JLabel();
        m7img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image7;
        image7 = new ImageIcon("src/images/Snack1.png");
        Image img7 = image7.getImage();
        img7 = img7.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image7.setImage(img7);
        m7img.setIcon(image7);
        food7.setImage(image7);
        m7.add(m7img);

        JLabel m8img = new JLabel();
        m8img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image8;
        image8 = new ImageIcon("src/images/Snack2.png");
        Image img8 = image8.getImage();
        img8 = img8.getScaledInstance(210, 130, Image.SCALE_AREA_AVERAGING);
        image8.setImage(img8);
        m8img.setIcon(image8);
        food8.setImage(image8);
        m8.add(m8img);



        //price and description
//        GourmetFood food1=new GourmetFood();
        food1.setName("Drink1");
        food1.setDescription("Remedy Kombucha Ginger Lemon 250ml");
        food1.setPrice(2.50);
//        GourmetFood food2=new GourmetFood();
        food2.setName("Drink2");
        food2.setDescription("CRU Kafe Fresh Roasted Organic Coffee");
        food2.setPrice(2.70);
//        GourmetFood food3=new GourmetFood();
        food3.setName("Drink3");
        food3.setDescription("Jimmy's Iced Coffee Original BottleCan 275ml");
        food3.setPrice(2.50);
//        GourmetFood food4=new GourmetFood();
        food4.setName("Food1");
        food4.setDescription("Tom Kerridge - Ham Hock and Smoked Cheddar Sandwich");
        food4.setPrice(4.10);
//        GourmetFood food5=new GourmetFood();
        food5.setName("Food2");
        food5.setDescription("Tom Kerridge - Soft Brie and Apple Chutney Ploughmans Sandwich");
        food5.setPrice(4.20);
//        GourmetFood food6=new GourmetFood();
        food6.setName("Food3");
        food6.setDescription("Savoursmiths Desert Salt & Vinegar Potato Crisps 35g");
        food6.setPrice(1.35);
//        GourmetFood food7=new GourmetFood();
        food7.setName("Snack1");
        food7.setDescription("Cadbury Mini Eggs Tube 96g");
        food7.setPrice(3.00);
//        GourmetFood food8=new GourmetFood();
        food8.setName("Snack2");
        food8.setDescription("Pullin`s Blueberry Muffin 110g");
        food8.setPrice(2.50);


        String PaD1 = "<html><body>" + food1.getDescription() + "<br>" + "Price: "+ food1.getPrice() + "<body></html>";
        JLabel lbdes1=new JLabel(PaD1);// label description1
        lbdes1.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes1.setFont(f);
        m1.add(lbdes1);

        String PaD2 = "<html><body>" + food2.getDescription() + "<br>" + "Price: "+ food2.getPrice() + "<body></html>";
        JLabel lbdes2=new JLabel(PaD2);
        lbdes2.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes2.setFont(f);
        m2.add(lbdes2);

        String PaD3 = "<html><body>" + food3.getDescription() + "<br>" + "Price: "+ food3.getPrice() + "<body></html>";
        JLabel lbdes3=new JLabel(PaD3);
        lbdes3.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes3.setFont(f);
        m3.add(lbdes3);

        String PaD4 = "<html><body>" + food4.getDescription() + "<br>" + "Price: "+ food4.getPrice() + "<body></html>";
        JLabel lbdes4=new JLabel(PaD4);
        lbdes4.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes4.setFont(f);
        m4.add(lbdes4);

        String PaD5 = "<html><body>" + food5.getDescription() + "<br>" + "Price: "+ food5.getPrice() + "<body></html>";
        JLabel lbdes5=new JLabel(PaD5);
        lbdes5.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes5.setFont(f);
        m5.add(lbdes5);

        String PaD6 = "<html><body>" + food6.getDescription() + "<br>" + "Price: "+ food6.getPrice() + "<body></html>";
        JLabel lbdes6=new JLabel(PaD6);
        lbdes6.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes6.setFont(f);
        m6.add(lbdes6);

        String PaD7 = "<html><body>" + food7.getDescription() + "<br>" + "Price: "+ food7.getPrice() + "<body></html>";
        JLabel lbdes7=new JLabel(PaD7);
        lbdes7.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes7.setFont(f);
        m7.add(lbdes7);

        String PaD8 = "<html><body>" + food8.getDescription() + "<br>" + "Price: "+ food8.getPrice() + "<body></html>";
        JLabel lbdes8=new JLabel(PaD8);
        lbdes8.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes8.setFont(f);
        m8.add(lbdes8);



        //choose button
        JButton addRB1=new JButton("Add"); JButton removeRB1=new JButton("Remove");
        JButton addRB2=new JButton("Add"); JButton removeRB2=new JButton("Remove");
        JButton addRB3=new JButton("Add"); JButton removeRB3=new JButton("Remove");
        JButton addRB4=new JButton("Add"); JButton removeRB4=new JButton("Remove");
        JButton addRB5=new JButton("Add"); JButton removeRB5=new JButton("Remove");
        JButton addRB6=new JButton("Add"); JButton removeRB6=new JButton("Remove");
        JButton addRB7=new JButton("Add"); JButton removeRB7=new JButton("Remove");
        JButton addRB8=new JButton("Add"); JButton removeRB8=new JButton("Remove");
//        JRadioButton rb2=new JRadioButton(food2.getName(), false);
//        JRadioButton rb3=new JRadioButton(food3.getName(), false);
//        JRadioButton rb4=new JRadioButton(food4.getName(), false);
//        JRadioButton rb5=new JRadioButton(food5.getName(), false);
//        JRadioButton rb6=new JRadioButton(food6.getName(), false);
//        JRadioButton rb7=new JRadioButton(food7.getName(), false);
//        JRadioButton rb8=new JRadioButton(food8.getName(), false);

//        rb1.setHorizontalAlignment(SwingConstants.CENTER);
//        rb2.setHorizontalAlignment(SwingConstants.CENTER);
//        rb3.setHorizontalAlignment(SwingConstants.CENTER);
//        rb4.setHorizontalAlignment(SwingConstants.CENTER);
//        rb5.setHorizontalAlignment(SwingConstants.CENTER);
//        rb6.setHorizontalAlignment(SwingConstants.CENTER);
//        rb7.setHorizontalAlignment(SwingConstants.CENTER);
//        rb8.setHorizontalAlignment(SwingConstants.CENTER);

//        rb1.setFont(f); rb2.setFont(f); rb3.setFont(f); rb4.setFont(f);
//        rb5.setFont(f); rb6.setFont(f); rb7.setFont(f); rb8.setFont(f);


        JPanel buyButton1 = new JPanel();
        buyButton1.add(addRB1);
        buyButton1.add(removeRB1);

        JPanel buyButton2 = new JPanel();
        buyButton2.add(addRB1);
        buyButton2.add(removeRB1);

        JPanel buyButton3 = new JPanel();
        buyButton3.add(addRB1);
        buyButton3.add(removeRB1);

        JPanel buyButton4 = new JPanel();
        buyButton4.add(addRB1);
        buyButton4.add(removeRB1);

        JPanel buyButton5 = new JPanel();
        buyButton5.add(addRB1);
        buyButton5.add(removeRB1);

        JPanel buyButton6 = new JPanel();
        buyButton6.add(addRB1);
        buyButton6.add(removeRB1);

        JPanel buyButton7 = new JPanel();
        buyButton7.add(addRB1);
        buyButton7.add(removeRB1);

        JPanel buyButton8 = new JPanel();
        buyButton8.add(addRB1);
        buyButton8.add(removeRB1);

        m1.add(buyButton); m2.add(rb2); m3.add(rb3); m4.add(rb4);
        m5.add(rb5); m6.add(rb6); m7.add(rb7); m8.add(rb8);

        add(center,BorderLayout.CENTER);

        menu.add(m1); menu.add(m2); menu.add(m3); menu.add(m4);
        menu.add(m5); menu.add(m6); menu.add(m7); menu.add(m8);


        //total price and change page
//        Double Totalprice = 0.0;
        String TP = "<html><body>" + "Total Price: "+ TotalPrice + "<body></html>";
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
                    new MealWindow();
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
