package view;

import model.Meal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealWindow extends JFrame {
    public MealWindow() {
        setLayout(new BorderLayout());
        setTitle("Meal");
        setSize(1280, 960);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add logo
        JPanel north = new JPanel();
        north.setLayout(new GridLayout(1, 1, 0, 0));
        JLabel logo = new JLabel();
        ImageIcon logo1;


        logo1 = new ImageIcon("src/images/Logo.png");
        Image logoimg = logo1.getImage();
        logoimg = logoimg.getScaledInstance(400, 90, Image.SCALE_AREA_AVERAGING);
        logo1.setImage(logoimg);
        logo.setIcon(logo1);
        north.add(logo);
        add(north, BorderLayout.NORTH);


        JPanel center = new JPanel();
        center.setLayout(new GridLayout(1, 1, 0, 0));

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(2, 2, 0, 0));
        center.add(menu);


        JPanel m1 = new JPanel();//first meal's Panel,meal1
        m1.setLayout(new GridLayout(3, 1, 0, 0));
        JPanel m2 = new JPanel();
        m2.setLayout(new GridLayout(3, 1, 0, 0));
        JPanel m3 = new JPanel();
        m3.setLayout(new GridLayout(3, 1, 0, 0));
        JPanel m4 = new JPanel();
        m4.setLayout(new GridLayout(3, 1, 0, 0));


        JPanel south = new JPanel();
        south.setLayout(new GridLayout(2, 1, 0, 0));


        Font f = new Font(Font.DIALOG, Font.BOLD, 14);

        Meal meal1 = new Meal();
        Meal meal2 = new Meal();
        Meal meal3 = new Meal();
        Meal meal4 = new Meal();


        //picture
        JLabel m1img = new JLabel();//a JLabel with picture
        m1img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image1;
        image1 = new ImageIcon("src/images/Steak with Onion.jpg");
        meal1.setImage(image1);
        Image img1 = image1.getImage();// get Image
        img1 = img1.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
        image1.setImage(img1);
        m1img.setIcon(image1);
        meal1.setImage(image1);
        m1.add(m1img);


        JLabel m2img = new JLabel();
        m2img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image2;
        image2 = new ImageIcon("src/images/Halal meal.jpg");
        Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
        image2.setImage(img2);
        m2img.setIcon(image2);
        meal2.setImage(image2);
        m2.add(m2img);


        JLabel m3img = new JLabel();
        m3img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image3;
        image3 = new ImageIcon("src/images/Vegetarian Oriental Meal.jpg");
        Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
        image3.setImage(img3);
        m3img.setIcon(image3);
        meal3.setImage(image3);
        m3.add(m3img);


        JLabel m4img = new JLabel();
        m4img.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image4;
        image4 = new ImageIcon("src/images/Kid's meal.jpg");
        Image img4 = image4.getImage();
        img4 = img4.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
        image4.setImage(img4);
        m4img.setIcon(image4);
        meal4.setImage(image4);
        m4.add(m4img);


        //price and description
//            double price1=6.9; double price2=5.9; double price3=5.7; double price4=5.9;

//        Meal meal1 = new Meal();
        meal1.setName("Steak with Onion");
        meal1.setDescription("Includes Steak, Onions, fruit, side dishes, dessert...");
//        Meal meal2 = new Meal();
        meal2.setName("Halal Meal");
        meal2.setDescription("Includes bread, fruit, vegetables and other halal certified foods");
//        Meal meal3 = new Meal();
        meal3.setName("Vegetarian Oriental Meal");
        meal3.setDescription("Includes grains, breads, fruits, vegetables, desserts, drinks...");
//        Meal meal4 = new Meal();
        meal4.setName("Kid's meal");
        meal4.setDescription("Suitable for children and easy to digest");

        String PaD1 = "<html><body>" + "Description: " + meal1.getDescription() + "<body></html>";
        JLabel lbdes1 = new JLabel(PaD1);// label description1
        lbdes1.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes1.setFont(f);
        m1.add(lbdes1);

        String PaD2 = "<html><body>" + "Description: " + meal2.getDescription() + "<body></html>";
        JLabel lbdes2 = new JLabel(PaD2);
        lbdes2.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes2.setFont(f);
        m2.add(lbdes2);

        String PaD3 = "<html><body>" + "Description: " + meal3.getDescription() + "<body></html>";
        JLabel lbdes3 = new JLabel(PaD3);
        lbdes3.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes3.setFont(f);
        m3.add(lbdes3);

        String PaD4 = "<html><body>" + "Description: " + meal4.getDescription() + "<body></html>";
        JLabel lbdes4 = new JLabel(PaD4);
        lbdes4.setHorizontalAlignment(SwingConstants.CENTER);
        lbdes4.setFont(f);
        m4.add(lbdes4);


        //chose meal button
        JRadioButton rb1 = new JRadioButton(meal1.getName(), true);
        JRadioButton rb2 = new JRadioButton(meal2.getName(), false);
        JRadioButton rb3 = new JRadioButton(meal3.getName(), false);
        JRadioButton rb4 = new JRadioButton(meal4.getName(), false);

        rb1.setHorizontalAlignment(SwingConstants.CENTER);
        rb2.setHorizontalAlignment(SwingConstants.CENTER);
        rb3.setHorizontalAlignment(SwingConstants.CENTER);
        rb4.setHorizontalAlignment(SwingConstants.CENTER);

        rb1.setFont(f);
        rb2.setFont(f);
        rb3.setFont(f);
        rb4.setFont(f);


        m1.add(rb1);
        m2.add(rb2);
        m3.add(rb3);
        m4.add(rb4);//add button in meal 1,2,3,4
        ButtonGroup group = new ButtonGroup();//button group
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);

        add(center, BorderLayout.CENTER);

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);


        //Remarks and next page
        JPanel remark = new JPanel();
        JTextArea remarktxt = new JTextArea(3, 70);
        remarktxt.setFont(f);

        JLabel remarklabel = new JLabel("Remarks (etc. Special meals): ");
        remarklabel.setFont(f);
        remark.add(remarklabel);
        remark.add(remarktxt);

        south.add(remark);

        JPanel button = new JPanel();
        JButton jbback = new JButton("Back");
        JButton jbnext = new JButton("Next");

        jbback.setFont(f);
        jbnext.setFont(f);

        button.add(jbback);
        button.add(jbnext);

        south.add(button);
        add(south, BorderLayout.SOUTH);

        setVisible(true);
        this.setLocationRelativeTo(null);

        jbnext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jbnext) {
                    dispose();
                    new GourmetMenu();
                }
            }
        });
    }

    public static void main(String[] agrs) {
        new MealWindow();
    }
}