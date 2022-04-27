package view;

import javax.swing.*;

public class FinalPage {
    public FinalPage()
    {
        JFrame frame=new JFrame("Smart-Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon=new ImageIcon("src/images/FinalPage.png");
        JLabel label=new JLabel(icon);
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        frame.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        frame.add(label);
        frame.setVisible(true);

    }

    public static void main(String args[])
    {
        new FinalPage();
    }
}
