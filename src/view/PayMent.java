package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayMent extends JFrame{
    public PayMent() {
        setLayout(new BorderLayout());
        setTitle("PayMent");    //设置显示窗口标题
        setSize(1280,960);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭

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



        //中部布局
        JPanel center=new JPanel();
        center.setLayout(new GridLayout(4,1,0,0));
        add(center,BorderLayout.CENTER);

        JPanel south=new JPanel();
        south.setLayout(new GridLayout(1,1,0,0));

        Font f=new Font (Font.DIALOG, Font.BOLD, 14);
        Font ff=new Font (Font.DIALOG, Font.BOLD, 20);





        //标语说明
        JPanel intro=new JPanel();
        JLabel introlabel=new JLabel("Please fill in your bank account and pin to pay the extra fee");
        introlabel.setHorizontalAlignment(SwingConstants.CENTER);
        introlabel.setFont(ff);
        intro.add(introlabel);
        center.add(intro);


        //总价
        Double Totalprice = 0.0;
        String TP = "<html><body>" + "Total Price: "+ Totalprice + "<body></html>";
        JPanel panTP=new JPanel();
        JLabel lbTP=new JLabel(TP);// label description1
        lbTP.setFont(ff);
        lbTP.setHorizontalAlignment(SwingConstants.CENTER);
        panTP.add(lbTP);
        center.add(panTP);


        //账户
        JPanel account=new JPanel();
        JTextField acctxt=new JTextField(50);    //创建account文本框
        acctxt.setFont(f);
        JLabel acclabel=new JLabel("Account: ");
        acclabel.setFont(f);
        acclabel.setHorizontalAlignment(SwingConstants.CENTER);
        account.add(acclabel);
        account.add(acctxt);
        center.add(account);


        //密码
        JPanel password=new JPanel();
        JTextField passtxt=new JTextField(50);    //创建account文本框
        passtxt.setFont(f);
        JLabel passlabel=new JLabel("Password: ");
        passlabel.setFont(f);
        password.add(passlabel);
        password.add(passtxt);
        center.add(password);



        //南部布局：确认支付 和 换页按钮
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

        setVisible(true);    //设置窗口是否可见
        this.setLocationRelativeTo(null);

        jbback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jbback)
                {
                    dispose();
                    new GourmetMenu();
                }
            }
        });
    }
    public static void main(String[] agrs)
    {
        new PayMent();    //创建一个实例化对象
    }
}
