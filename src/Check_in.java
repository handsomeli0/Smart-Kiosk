import java.awt.*;
import javax.swing.*;
public class Check_in
{
    public Check_in(){
        ImageIcon icon=new ImageIcon("src/images/rectangle.png");
        JLabel label=new JLabel(icon);
        label.setBounds(46,30,300,400);

        ImageIcon icon1 = new ImageIcon("src/images/789.jpg");
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,icon1.getIconWidth(),icon1.getIconHeight());

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(icon1.getIconWidth(),icon1.getIconHeight());
        frame.setLayout(null);
        frame.add(label);
        frame.add(label1);
        frame.setVisible(true);

    }
    public static void main(String[] args)
    {
        new Check_in();
    }
}
