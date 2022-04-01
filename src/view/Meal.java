package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Meal extends JFrame{
        public Meal()
        {
            setLayout(new BorderLayout());
            setTitle("Meal");    //设置显示窗口标题
            setSize(1280,960);    //设置窗口显示尺寸
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭

//            ImageIcon background;
//            background = new ImageIcon("D:/Mealimage/background.png");
//            JLabel lbBg = new JLabel(background);
//            lbBg.setBounds(0, 0, 1280, 960);
//            this.add(lbBg);

            //添加logo
            JPanel north=new JPanel();
            north.setLayout(new GridLayout(1,1,0,0));
            JLabel logo = new JLabel();
            ImageIcon logo1;
            logo1 = new ImageIcon("D:/Mealimage/Logo.png");
            Image logoimg = logo1.getImage();
            logoimg = logoimg.getScaledInstance(400, 90, Image.SCALE_AREA_AVERAGING);
            logo1.setImage(logoimg);
            logo.setIcon(logo1);
            north.add(logo);
            add(north,BorderLayout.NORTH);


            JPanel center=new JPanel();
            center.setLayout(new GridLayout(1,1,0,0));

            JPanel menu=new JPanel();
            menu.setLayout(new GridLayout(2,2,0,0));
            center.add(menu);


            JPanel m1=new JPanel();//第一道菜的Panel,meal1
            m1.setLayout(new GridLayout(3,1,0,0));
            JPanel m2=new JPanel();
            m2.setLayout(new GridLayout(3,1,0,0));
            JPanel m3=new JPanel();
            m3.setLayout(new GridLayout(3,1,0,0));
            JPanel m4=new JPanel();
            m4.setLayout(new GridLayout(3,1,0,0));


            JPanel south=new JPanel();
            south.setLayout(new GridLayout(2,1,0,0));




            Font f=new Font (Font.DIALOG, Font.BOLD, 14);

            //展示图片
            JLabel m1img = new JLabel();//创建一个带图片的 JLabel
            m1img.setHorizontalAlignment(SwingConstants.CENTER);
            ImageIcon image1;
            image1 = new ImageIcon("D:/Mealimage/Steak with Onion.jpg");// 加载图片资源
            Image img1 = image1.getImage();// 获得此图标的Image
            img1 = img1.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);// 将image压缩后得到压缩后的img
            image1.setImage(img1);// 将图标设置为压缩后的图像
            m1img.setIcon(image1);
            m1.add(m1img);

            JLabel m2img = new JLabel();
            m2img.setHorizontalAlignment(SwingConstants.CENTER);
            ImageIcon image2;
            image2 = new ImageIcon("D:/Mealimage/Halal meal.jfif");
            Image img2 = image2.getImage();
            img2 = img2.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
            image2.setImage(img2);
            m2img.setIcon(image2);
            m2.add(m2img);

            JLabel m3img = new JLabel();
            m3img.setHorizontalAlignment(SwingConstants.CENTER);
            ImageIcon image3;
            image3 = new ImageIcon("D:/Mealimage/Vegetarian Oriental Meal.jpg");
            Image img3 = image3.getImage();
            img3 = img3.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
            image3.setImage(img3);
            m3img.setIcon(image3);
            m3.add(m3img);

            JLabel m4img = new JLabel();
            m4img.setHorizontalAlignment(SwingConstants.CENTER);
            ImageIcon image4;
            image4 = new ImageIcon("D:/Mealimage/Kid's meal.jpg");
            Image img4 = image4.getImage();
            img4 = img4.getScaledInstance(270, 170, Image.SCALE_AREA_AVERAGING);
            image4.setImage(img4);
            m4img.setIcon(image4);
            m4.add(m4img);



            //价格和描述
//            double price1=6.9; double price2=5.9; double price3=5.7; double price4=5.9;

            Mealinfo meal1=new Mealinfo();
            meal1.name="Steak with Onion";
            meal1.desc="Includes Steak, Onions, fruit, side dishes, dessert...";
            Mealinfo meal2=new Mealinfo();
            meal2.name="Halal Meal";
            meal2.desc="Includes bread, fruit, vegetables and other halal certified foods";
            Mealinfo meal3=new Mealinfo();
            meal3.name="Vegetarian Oriental Meal";
            meal3.desc="Includes grains, breads, fruits, vegetables, desserts, drinks...";
            Mealinfo meal4=new Mealinfo();
            meal4.name="Kid's meal";
            meal4.desc="Suitable for children and easy to digest";

            String PaD1 = "<html><body>" + "Description: " + meal1.desc + "<body></html>";
            JLabel lbdes1=new JLabel(PaD1);// label description1
            lbdes1.setHorizontalAlignment(SwingConstants.CENTER);
            lbdes1.setFont(f);
            m1.add(lbdes1);

            String PaD2 = "<html><body>" + "Description: " + meal2.desc + "<body></html>";
            JLabel lbdes2=new JLabel(PaD2);
            lbdes2.setHorizontalAlignment(SwingConstants.CENTER);
            lbdes2.setFont(f);
            m2.add(lbdes2);

            String PaD3 = "<html><body>" + "Description: " + meal3.desc + "<body></html>";
            JLabel lbdes3=new JLabel(PaD3);
            lbdes3.setHorizontalAlignment(SwingConstants.CENTER);
            lbdes3.setFont(f);
            m3.add(lbdes3);

            String PaD4 = "<html><body>" + "Description: " + meal4.desc + "<body></html>";
            JLabel lbdes4=new JLabel(PaD4);
            lbdes4.setHorizontalAlignment(SwingConstants.CENTER);
            lbdes4.setFont(f);
            m4.add(lbdes4);




            //选择餐按钮
            JRadioButton rb1=new JRadioButton(meal1.name, true);
            JRadioButton rb2=new JRadioButton(meal2.name, false);
            JRadioButton rb3=new JRadioButton(meal3.name, false);
            JRadioButton rb4=new JRadioButton(meal4.name, false);

            rb1.setHorizontalAlignment(SwingConstants.CENTER);
            rb2.setHorizontalAlignment(SwingConstants.CENTER);
            rb3.setHorizontalAlignment(SwingConstants.CENTER);
            rb4.setHorizontalAlignment(SwingConstants.CENTER);

            rb1.setFont(f); rb2.setFont(f); rb3.setFont(f); rb4.setFont(f);


            m1.add(rb1); m2.add(rb2); m3.add(rb3); m4.add(rb4);//在meal1，2，3，4的Panel中添加按钮
            ButtonGroup group=new ButtonGroup();//按钮组
            group.add(rb1); group.add(rb2); group.add(rb3); group.add(rb4);//按钮组中添加meal1，2，3，4

            add(center,BorderLayout.CENTER);

            menu.add(m1); menu.add(m2); menu.add(m3); menu.add(m4);


            //Remarks 和 换页按钮
            JPanel remark=new JPanel();
            JTextArea remarktxt=new JTextArea(3,70);    //创建文本框
            remarktxt.setFont(f);

            JLabel remarklabel=new JLabel("Remarks (etc. Special meals): ");
            remarklabel.setFont(f);
            remark.add(remarklabel);
            remark.add(remarktxt);

            south.add(remark);

            JPanel button=new JPanel();
            JButton jbback=new JButton("Back");
            JButton jbnext=new JButton("Next");

            jbback.setFont(f); jbnext.setFont(f);

            button.add(jbback);
            button.add(jbnext);

            south.add(button);
            add(south,BorderLayout.SOUTH);

            setVisible(true);    //设置窗口是否可见
            this.setLocationRelativeTo(null);

            jbnext.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==jbnext)
                    {
                        dispose();
                        new GourmetMenu();
                    }
                }
            });
        }
        public static void main(String[] agrs)
        {
            new Meal();    //创建一个实例化对象
        }
}