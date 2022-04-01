package view;

import controller.DataController;
import model.Flight;
import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat{
    int selected = 0,bus=0,mov=0,leg=0,sum,k;
    int[] passenger=new int[32];

    String flightID="flight1";
    boolean[] seatnum= DataController.getSeatsByFlightID(flightID);

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

    ImageIcon image=new ImageIcon("src/image/B.jpg");//背景图片
    JLabel im=new JLabel(image);
    ImageIcon plane=new ImageIcon("src/image/plane.png");
    JLabel pl=new JLabel(plane);

    JButton[] x=new JButton[100];
    JButton con=new JButton("Confirm");
    JButton con1=new JButton("Confirm");

    public int formpay(int bus,int mov,int leg){
        JLabel id=new JLabel("Credit Card ID:");
        JTextField ID=new JTextField(20);

        jp2.setLayout(null);
        JLabel lable1=new JLabel("You need to pay " + (bus*100+mov*20+leg*60)+" dollars extra!", JLabel.CENTER);
        lable1.setFont(font2);
        lable1.setForeground(Color.white);
        jp2.add(lable1);
        lable1.setBounds(0,0,900,100);

        jp2.add(id);
        jp2.add(ID);
        id.setBounds(210,180,90,40);
        ID.setBounds(295,180,300,30);

        im.setBounds(0,0,900,590);
        jp2.add(im);

        con1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                closeThis();
            }
        });
        con1.setBounds(370, 500, 120, 30);
        jp2.add(con1);

        frame1.add(jp2);
        frame1.setBounds(300, 100, 900, 585);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return 0;
    }

    public int form() {
        jp.setLayout(null);

        for(int i=0;i<32;i++)
        {
            if(seatnum[i]==true) //座位被其他用户选择
             {
                 passenger[i]=1;
                 x[i].setBackground(Color.RED);
             }
            x[i] = new JButton();
            if(i/4==0)
            {
                x[i].setBounds(215,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==1)
            {
                x[i].setBounds(260,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==2)
            {
                x[i].setBounds(345,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==3)
            {
                x[i].setBounds(390,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==4)
            {
                x[i].setBounds(435,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==5)
            {
                x[i].setBounds(480,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==6)
            {
                x[i].setBounds(525,205+(i%4)*21+(i%4)/2*8,20,20);
            }
            else if(i/4==7)
            {
                x[i].setBounds(570,205+(i%4)*21+(i%4)/2*8,20,20);
            }

            jp.add(x[i]);
        }
        x[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (selected == 0 && passenger[0] != 1) {
                        JButton x = Seat.this.x[0];
                        x.setBackground(Color.RED);
                        selected = 1;
                        bus = 1;
                        seatnum[0] = true;
                        DataController.updateSeat(flightID, 0);
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
                    if (selected == 0 && passenger[1] != 1) {
                        JButton x = Seat.this.x[1];
                        x.setBackground(Color.RED);
                        selected = 1;
                        bus = 1;
                        seatnum[1] = true;
                        DataController.updateSeat(flightID, 1);
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
                    if (selected == 0 && passenger[2] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[2];
                        x.setBackground(Color.RED);
                        bus = 1;
                        seatnum[2] = true;
                        DataController.updateSeat(flightID, 2);
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
                    if (selected == 0 && passenger[3] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[3];
                        x.setBackground(Color.RED);
                        bus = 1;
                        seatnum[3] = true;
                        DataController.updateSeat(flightID, 3);
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
                    if (selected == 0 && passenger[4] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[4];
                        x.setBackground(Color.RED);
                        seatnum[4] = true;
                        DataController.updateSeat(flightID, 4);
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
                    if (selected == 0 && passenger[5] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[5];
                        x.setBackground(Color.RED);
                        seatnum[5] = true;
                        DataController.updateSeat(flightID, 5);
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
                    if (selected == 0 && passenger[6] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[6];
                        x.setBackground(Color.RED);
                        seatnum[6] = true;
                        DataController.updateSeat(flightID, 6);
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
                    if (selected == 0 && passenger[7] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[7];
                        x.setBackground(Color.RED);
                        seatnum[7] = true;
                        DataController.updateSeat(flightID, 7);
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
                    if (selected == 0 && passenger[8] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[8];
                        x.setBackground(Color.RED);
                        seatnum[8] = true;
                        DataController.updateSeat(flightID, 8);
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
                    if (selected == 0 && passenger[9] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[9];
                        x.setBackground(Color.RED);
                        seatnum[9] = true;
                        DataController.updateSeat(flightID, 9);
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
                    if (selected == 0 && passenger[10] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[10];
                        x.setBackground(Color.RED);
                        seatnum[10] = true;
                        DataController.updateSeat(flightID, 10);
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
                    if (selected == 0 && passenger[11] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[11];
                        x.setBackground(Color.RED);
                        seatnum[11] = true;
                        DataController.updateSeat(flightID, 11);
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
                    if (selected == 0 && passenger[12] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[12];
                        x.setBackground(Color.RED);
                        seatnum[12] = true;
                        DataController.updateSeat(flightID, 12);
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
                    if (selected == 0 && passenger[13] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[13];
                        x.setBackground(Color.RED);
                        seatnum[13] = true;
                        DataController.updateSeat(flightID, 13);
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
                    if (selected == 0 && passenger[14] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[14];
                        x.setBackground(Color.RED);
                        seatnum[14] = true;
                        DataController.updateSeat(flightID, 14);
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
                    if (selected == 0 && passenger[15] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[15];
                        x.setBackground(Color.RED);
                        seatnum[15] = true;
                        DataController.updateSeat(flightID, 15);
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
                    if (selected == 0 && passenger[16] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[16];
                        x.setBackground(Color.RED);
                        seatnum[16] = true;
                        DataController.updateSeat(flightID, 16);
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
                    if (selected == 0 && passenger[17] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[17];
                        x.setBackground(Color.RED);
                        seatnum[17] = true;
                        DataController.updateSeat(flightID, 17);
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
                    if (selected == 0 && passenger[18] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[18];
                        x.setBackground(Color.RED);
                        seatnum[18] = true;
                        DataController.updateSeat(flightID, 18);
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
                    if (selected == 0 && passenger[19] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[19];
                        x.setBackground(Color.RED);
                        seatnum[19] = true;
                        DataController.updateSeat(flightID, 19);
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
                    if (selected == 0 && passenger[20] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[20];
                        x.setBackground(Color.RED);
                        seatnum[20] = true;
                        DataController.updateSeat(flightID, 20);
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
                    if (selected == 0 && passenger[21] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[21];
                        x.setBackground(Color.RED);
                        seatnum[21] = true;
                        DataController.updateSeat(flightID, 21);
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
                    if (selected == 0 && passenger[22] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[22];
                        x.setBackground(Color.RED);
                        seatnum[22] = true;
                        DataController.updateSeat(flightID, 22);
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
                    if (selected == 0 && passenger[23] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[23];
                        x.setBackground(Color.RED);
                        seatnum[23] = true;
                        DataController.updateSeat(flightID, 23);
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
                    if (selected == 0 && passenger[24] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[24];
                        x.setBackground(Color.RED);
                        seatnum[24] = true;
                        DataController.updateSeat(flightID, 24);
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
                    if (selected == 0 && passenger[25] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[25];
                        x.setBackground(Color.RED);
                        seatnum[25] = true;
                        DataController.updateSeat(flightID, 25);
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
                    if (selected == 0 && passenger[26] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[26];
                        x.setBackground(Color.RED);
                        seatnum[26] = true;
                        DataController.updateSeat(flightID, 26);
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
                    if (selected == 0 && passenger[27] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[27];
                        x.setBackground(Color.RED);
                        seatnum[27] = true;
                        DataController.updateSeat(flightID, 27);
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
                    if (selected == 0 && passenger[28] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[28];
                        x.setBackground(Color.RED);
                        seatnum[28] = true;
                        DataController.updateSeat(flightID, 28);
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
                    if (selected == 0 && passenger[29] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[29];
                        x.setBackground(Color.RED);
                        seatnum[29] = true;
                        DataController.updateSeat(flightID, 29);
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
                    if (selected == 0 && passenger[30] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[30];
                        x.setBackground(Color.RED);
                        seatnum[30] = true;
                        DataController.updateSeat(flightID, 30);
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
                    if (selected == 0 && passenger[31] != 1) {
                        selected = 1;
                        JButton x = Seat.this.x[31];
                        x.setBackground(Color.RED);
                        seatnum[31] = true;
                        DataController.updateSeat(flightID, 31);
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
                if(bus==0&&mov==0&&leg==0) {
                    closeThis();
                }
                else{
                    closeThis();
                    formpay(bus,mov,leg);
                }
            }
        });

        con.setBounds(370, 500, 120, 30);
        jp.add(con);

        lable.setFont(font1);
        lable.setForeground(Color.white);
        jp.add(lable);
        lable.setBounds(0,0,900,100);
        lable2.setFont(font3);
        lable2.setForeground(Color.white);
        jp.add(lable2);
        lable2.setBounds(150,170,200,20);
        lable3.setFont(font3);
        lable3.setForeground(Color.white);
        jp.add(lable3);
        lable3.setBounds(370,170,200,20);

        ne.setBounds(200,400,110,20);
        jp.add(ne);
        fm.setBounds(530,400,100,20);
        jp.add(fm);

        im.setBounds(0,0,900,590);
        jp.add(pl);
        pl.setBounds(0,100,900,300);
        jp.add(im);

        frame.add(jp);
        frame.setBounds(300, 100, 900, 585);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sum=bus+mov+leg;
        return sum;
    }

    public void closeThis(){
        frame.dispose();
        frame1.dispose();
    }
    public Seat()
    {
        form();
    }
    public static void main (String[] args)
    {
        Seat seat=new Seat();
    }
}

