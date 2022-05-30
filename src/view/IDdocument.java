package view;

import controller.DataController;
import model.Booking;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * The class is the UI of ID document check in
 * @author Changming Xu
 */

public class IDdocument  {

    public IDdocument() throws IOException {
        JFrame frame=new JFrame("ID document check-in");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img1 = new ImageIcon("src/images//background1.jpg");
        JLabel imgLabel1 = new JLabel(img1);
        ImageIcon img2 = new ImageIcon("src/images//logo.png");
        JLabel imgLabel2 = new JLabel(img2);

        frame.getLayeredPane().add(imgLabel1, new Integer(Integer.MIN_VALUE));
        imgLabel1.setBounds(0,0,img1.getIconWidth(), img1.getIconHeight());
        Container cp=frame.getContentPane();
        frame.setLayout(null);

        JButton confirm=new JButton("confirm");
        JButton cancel=new JButton("cancel");
        JButton back = new JButton("back");
        JTextField txtfield1=new JTextField();
        txtfield1.setEditable(false);
        txtfield1.setText("Put your ID document here and click confirm");
        txtfield1.setHorizontalAlignment(JTextField.CENTER);

        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();
        jp1.setLayout(null);
        jp2.setLayout(null);
        jp3.setLayout(null);
        jp1.setBounds(0,0,1200,100);
        jp2.setBounds(0,150,1200,300);
        jp3.setBounds(0,400,1200,225);
        imgLabel2.setBounds(650,0,700,100);
        txtfield1.setBounds(300,0,600,300);
        confirm.setBounds(550,150,100,30);
        cancel.setBounds(1050,150,100,30);
        back.setBounds(50,150,100,30);
        jp1.setBackground(Color.WHITE);
        jp2.setBackground(Color.WHITE);
        jp3.setBackground(Color.WHITE);
        jp1.setOpaque(false);
        jp2.setOpaque(false);
        jp3.setOpaque(false);
        txtfield1.setBackground(Color.WHITE);
        txtfield1.setOpaque(false);
        txtfield1.setFont(new Font("SERIF",Font.BOLD,20));

        frame.add(jp1);
        frame.add(jp2);
        frame.add(jp3);
        jp1.add(imgLabel2);
        jp2.add(txtfield1);
        jp3.add(confirm);
        jp3.add(cancel);
        jp3.add(back);
        confirm.addActionListener(e -> {
            model.IDdocument iDdocument = null;
            Booking a = null;
            try {
                iDdocument = DataController.getIDdocument();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            if (iDdocument!=null) {
                a = DataController.getBookingBySurnameIdNum(iDdocument.getLastName(),iDdocument.getIdNum());
            }
            if(a==null){
                JOptionPane.showMessageDialog(null,"Your booking information is not found, please rescan!");
            }
            else{
                if (a.getFinished()) {
                    JOptionPane.showMessageDialog(frame, "Your check-in has been finished!",
                            "error", JOptionPane.ERROR_MESSAGE);
                } else {
                    frame.setVisible(false);
                    new Summary(a);
                }
            }
        });
        cancel.addActionListener(e -> {new BookingNumberCheckIn();
            frame.setVisible(false);
        });
        back.addActionListener(e -> {new BookingNumberCheckIn();
            frame.setVisible(false);
        });

        ((JPanel)cp).setOpaque(false);

        frame.setSize(1200,675);
        frame.setVisible(true);
    }
}