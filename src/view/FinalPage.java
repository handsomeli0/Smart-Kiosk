package view;

import javax.swing.*;

/**
 * The class is the UI of final page
 *
 * @author Song Yan
 * @version 2.0
 */

public class FinalPage {
    public FinalPage()
    {
        JFrame frame=new JFrame("Smart-Kiosk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        ImageIcon icon=new ImageIcon("src/images/FinalPage.png");
        JLabel label=new JLabel(icon);
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        JButton button = new JButton("return to first page");
        button.setBounds(520,630,300,50);
        button.addActionListener(e -> {
            new BookingNumberCheckIn();
            frame.setVisible(false);
        });

        frame.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
//    public static void main(String args[]) {
//        new FinalPage();
//    }

}
