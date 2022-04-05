package view;

import controller.DataController;
import model.Flight;
import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat {
    int selected = 0,bus=0,mov=0,leg=0,sum,cha;
    int[] seatnum=new int[32];

    JFrame frame=new JFrame("Choosing Seat"); //创建Frame窗口
    JFrame frame1=new JFrame("Pay For");

    JLabel lable=new JLabel("Please select your seat!", JLabel.CENTER);
    Font font1=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,80);
    Font font2=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,50);
    Font font3=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,20);
    JLabel lable2=new JLabel("Business Class", JLabel.CENTER);
    JLabel lable3=new JLabel("Economy Class", JLabel.CENTER);

    String y[]={"Normal", "Extra legroom"};
    JComboBox<String> ne=new JComboBox<String>(y);
    String z[]={"Free Video", "Paid Movie"};
    JComboBox<String> fm=new JComboBox<String>(z);

    JPanel jp=new JPanel(); //创建JPanel对象
    JPanel jp2=new JPanel();

    ImageIcon image=new ImageIcon("src/images/background1.jpg");//背景图片
    JLabel im=new JLabel(image);
    ImageIcon plane=new ImageIcon("src/images/plane.png");
    JLabel pl=new JLabel(plane);

    JButton[] x=new JButton[100];
    JButton con=new JButton("Confirm");
    JButton con1=new JButton("Confirm");

    public int formpay(int bus,int mov,int leg,String seatnumID){
        JLabel id=new JLabel("Credit Card ID:");
        JTextField ID=new JTextField(20);

        jp2.setLayout(null);
        JLabel lable1=new JLabel("You need to pay " + (bus*100+mov*20+leg*60)+" dollars extra!", JLabel.CENTER);
        lable1.setFont(font2);
        lable1.setForeground(Color.white);
        jp2.add(lable1);
        lable1.setBounds(0,0,900,100);

        id.setFont(font3);
        jp2.add(id);
        jp2.add(ID);
        id.setBounds(360,275,300,40);
        ID.setBounds(500,280,300,30);

        im.setBounds(0,0,1200,675);
        jp2.add(im);

        con1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                int Id= Integer.parseInt(ID.getText().toString());
                if(DataController.checkPayment(seatnumID,Id)) {
                    closeThis();
                    new Meal();
                }
                else{
                    JOptionPane.showMessageDialog(frame, "The credit card information you entered is incorrect ","Missing information", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        con1.setBounds(540, 600, 120, 30);
        jp2.add(con1);

        frame1.add(jp2);
        frame1.setBounds(0, 0, 1200, 675);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return 0;
    }

    public int form(String flightID,String seatnumID) {
        jp.setLayout(null);
        boolean[] seatnum= DataController.getSeatsByFlightID(flightID);
        for(int i=0;i<32;i++)
        {
            x[i] = new JButton();
            if(seatnum[i]==true) //座位被其他用户选择
            {
                x[i].setBackground(Color.RED);
            }
            else{
                x[i].setBackground(Color.WHITE);
            }
            if(i/4==0)
            {
                x[i].setBounds(370,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==1)
            {
                x[i].setBounds(415,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==2)
            {
                x[i].setBounds(500,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==3)
            {
                x[i].setBounds(545,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==4)
            {
                x[i].setBounds(590,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==5)
            {
                x[i].setBounds(635,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==6)
            {
                x[i].setBounds(680,255+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==7)
            {
                x[i].setBounds(725,255+(i%4)*21+(i%4)/2*8,20,20);
            }

            jp.add(x[i]);
        }
        x[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[0] != true) {
                        x[cha].setBackground(Color.WHITE);
                        JButton x = Seat.this.x[0];
                        x.setBackground(Color.RED);
                        selected = 32;
                        bus = 1;
                        cha=0;
                    }

                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[1] != true) {
                        x[cha].setBackground(Color.WHITE);
                        JButton x = Seat.this.x[1];
                        x.setBackground(Color.RED);
                        selected = 1;
                        bus = 1;
                        cha=1;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[2] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 2;
                        JButton x = Seat.this.x[2];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=2;

                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[3] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 3;
                        JButton x = Seat.this.x[3];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=3;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[4] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 4;
                        JButton x = Seat.this.x[4];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=4;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[5] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 5;
                        JButton x = Seat.this.x[5];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=5;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[6] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 6;
                        JButton x = Seat.this.x[6];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=6;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[7] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 7;
                        JButton x = Seat.this.x[7];
                        x.setBackground(Color.RED);
                        bus = 1;
                        cha=7;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[8] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 8;
                        JButton x = Seat.this.x[8];
                        x.setBackground(Color.RED);
                        cha=8;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[9] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 9;
                        JButton x = Seat.this.x[9];
                        x.setBackground(Color.RED);
                        cha=9;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[10] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 10;
                        JButton x = Seat.this.x[10];
                        x.setBackground(Color.RED);
                        cha=10;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[11] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 11;
                        JButton x = Seat.this.x[11];
                        x.setBackground(Color.RED);
                        cha=11;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[12] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 12;
                        JButton x = Seat.this.x[12];
                        x.setBackground(Color.RED);
                        cha=12;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[13] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 13;
                        JButton x = Seat.this.x[13];
                        x.setBackground(Color.RED);
                        cha=13;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[14] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 14;
                        JButton x = Seat.this.x[14];
                        x.setBackground(Color.RED);
                        cha=14;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[15] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 15;
                        JButton x = Seat.this.x[15];
                        x.setBackground(Color.RED);
                        cha=15;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[16].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[16] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 16;
                        JButton x = Seat.this.x[16];
                        x.setBackground(Color.RED);
                        cha=16;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[17].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[17] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 17;
                        JButton x = Seat.this.x[17];
                        x.setBackground(Color.RED);
                        cha=17;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[18].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[18] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 18;
                        JButton x = Seat.this.x[18];
                        x.setBackground(Color.RED);
                        cha=18;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[19].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[19] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 19;
                        JButton x = Seat.this.x[19];
                        x.setBackground(Color.RED);
                        cha=19;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[20].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[20] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 20;
                        JButton x = Seat.this.x[20];
                        x.setBackground(Color.RED);
                        cha = 20;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[21].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[21] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 21;
                        JButton x = Seat.this.x[21];
                        x.setBackground(Color.RED);
                        cha=21;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[22].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[22] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 22;
                        JButton x = Seat.this.x[22];
                        x.setBackground(Color.RED);
                        cha=22;
                    }

                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[23].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[23] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 23;
                        JButton x = Seat.this.x[23];
                        x.setBackground(Color.RED);
                        cha=23;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[24].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[24] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 24;
                        JButton x = Seat.this.x[24];
                        x.setBackground(Color.RED);
                        cha=24;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[25].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[25] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 25;
                        JButton x = Seat.this.x[25];
                        x.setBackground(Color.RED);
                        cha=25;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[26].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (seatnum[26] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 26;
                        JButton x = Seat.this.x[26];
                        x.setBackground(Color.RED);
                        cha=26;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[27].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (seatnum[27] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 27;
                        JButton x = Seat.this.x[27];
                        x.setBackground(Color.RED);
                        cha=27;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[28].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[28] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 28;
                        JButton x = Seat.this.x[28];
                        x.setBackground(Color.RED);
                        cha=28;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[29].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[29] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 29;
                        JButton x = Seat.this.x[29];
                        x.setBackground(Color.RED);
                        cha=29;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[30].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (   seatnum[30] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 30;
                        JButton x = Seat.this.x[30];
                        x.setBackground(Color.RED);
                        cha=30;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });
        x[31].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (seatnum[31] != true) {
                        x[cha].setBackground(Color.WHITE);
                        selected = 31;
                        JButton x = Seat.this.x[31];
                        x.setBackground(Color.RED);
                        cha=31;
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });

        ne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(ne.getSelectedItem()=="Normal"){
                    leg=0;
                }
                if(ne.getSelectedItem()=="Extra legroom"){
                    leg=1;
                }
            }
        });
        fm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(fm.getSelectedItem()=="Free Video"){
                    mov=0;
                }
                if(fm.getSelectedItem()=="Paid Movie"){
                    mov=1;
                }
            }
        });

        con.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    DataController.updateSeat(flightID, cha);
                    if(selected!=0) {
                        if (bus == 0 && mov == 0 && leg == 0) {
                            closeThis();
                            new Meal();
                        } else {
                            closeThis();
                            formpay(bus, mov, leg, seatnumID);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "You have not chosen a seat！","Missing information", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (Exception e) {
                    System.out.println("Exception occoured : " + e);
                }
            }
        });

        con.setBounds(520, 600, 120, 30);
        jp.add(con);

        lable.setFont(font1);
        lable.setForeground(Color.white);
        jp.add(lable);
        lable.setBounds(150,0,900,100);
        lable2.setFont(font3);
        lable2.setForeground(Color.BLACK);
        jp.add(lable2);
        lable2.setBounds(300,220,200,20);
        lable3.setFont(font3);
        lable3.setForeground(Color.BLACK);
        jp.add(lable3);
        lable3.setBounds(530,220,200,20);

        ne.setBounds(350,450,110,20);
        jp.add(ne);
        fm.setBounds(680,450,100,20);
        jp.add(fm);

        im.setBounds(0,0,1200,675);
        jp.add(pl);
        pl.setBounds(150,150,900,300);
        jp.add(im);

        frame.add(jp);
        frame.setBounds(0, 0, 1200, 675);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sum=bus+mov+leg;
        return sum;
    }

    public void closeThis(){
        frame.dispose();
        frame1.dispose();
    }
    public Seat(String flightID,String seatnumID)
    {
        form(flightID,seatnumID);
    }
}

