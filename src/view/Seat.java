package view;

import controller.DataController;
import model.Booking;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat {
    int cha=-1,bus=0,mov=0,leg=0;
    JButton[] x=new JButton[100];
//    public int payment(int bus,int mov,int leg,Booking A,int cha){
//        Font font2=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,50);
//        JPanel jp2=new JPanel();
//        JButton con1=new JButton("Confirm");
//        JButton back2=new JButton("Back");
//        JButton back3=new JButton("Home Page");
//
//        String flightID=A.getFlightID();
//        String passengerID=A.getPassengerID();
//
//        JLabel id=new JLabel("Credit Card ID:");
//        JTextField ID=new JTextField(20);
//
//        jp2.setLayout(null);
//        JLabel lable1=new JLabel("You need to pay " + (bus*100+mov*20+leg*60)+" dollars extra!", JLabel.CENTER);
//        lable1.setFont(font2);
//        lable1.setForeground(Color.white);
//        jp2.add(lable1);
//        lable1.setBounds(0,0,900,100);
//
//        id.setFont(font3);
//        jp2.add(id);
//        jp2.add(ID);
//        id.setBounds(360,275,300,40);
//        ID.setBounds(500,280,300,30);
//
//        con1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent actionEvent) {
//                try{
//                    if("".equals(ID.getText())){
//                        JOptionPane.showMessageDialog(frame, "Please enter your credit card information. ","Missing information", JOptionPane.ERROR_MESSAGE);
//                    }
//                    else{
//                        int Id= Integer.parseInt(ID.getText().toString());
//                        if(DataController.checkPayment(passengerID,Id)) {
//                            DataController.updateSeat(flightID, cha);
//                            closeThis();
//                        }
//                        else{
//                            JOptionPane.showMessageDialog(frame, "The credit card information you entered is incorrect. ","Missing information", JOptionPane.ERROR_MESSAGE);
//                        }
//                    }
//                }
//                catch (Exception e) {
//                    System.out.println("Exception occoured : " + e);
//                }
//            }
//        });
//        back2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent actionEvent) {
//                try{
//                    new Seat(A);
//                    closeThis();
//                }
//                catch (Exception e) {
//                    System.out.println("Exception occoured : " + e);
//                }
//            }
//        });
//        back3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent actionEvent) {
//                try{
//                    new BookingNumberCheckIn();
//                    closeThis();
//                }
//                catch (Exception e) {
//                    System.out.println("Exception occoured : " + e);
//                }
//
//            }
//        });
//        con1.setBounds(540, 600, 120, 30);
//        jp2.add(con1);
//
//        back2.setBounds(200,600,120,30);
//        back3.setBounds(900,600,120,30);
//        jp2.add(back2);
//        jp2.add(back3);
//
//        lo.setBounds(820,10,350,67);
//        jp2.add(lo);
//        im.setBounds(0,0,1200,675);
//        jp2.add(im);
//
//        frame1.add(jp2);
//        frame1.setBounds(0, 0, 1200, 675);
//        frame1.setVisible(true);
//        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        return 0;
//    }
    public int form(Booking A) {
        int sum;
        JFrame frame=new JFrame("Choosing Seat"); //创建Frame窗口
        JLabel lable=new JLabel("Please select your seat!", JLabel.CENTER);
        Font font1=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,80);
        Font font3=new Font(Font.SERIF, Font.BOLD|Font.ITALIC,20);
        JLabel lable2=new JLabel("Business Class", JLabel.CENTER);
        JLabel lable3=new JLabel("Economy Class", JLabel.CENTER);

        String y[]={"Normal", "Extra legroom"};
        JComboBox<String> ne=new JComboBox<String>(y);
        String z[]={"Free Video", "Paid Movie"};
        JComboBox<String> fm=new JComboBox<String>(z);

        JPanel jp=new JPanel(); //创建JPanel对象

        ImageIcon image=new ImageIcon("src/images/background1.jpg");//背景图片
        JLabel im=new JLabel(image);
        ImageIcon plane=new ImageIcon("src/images/plane.png");
        JLabel pl=new JLabel(plane);
        ImageIcon logo=new ImageIcon("src/images/logo.png");
        JLabel lo=new JLabel(logo);

        JButton con=new JButton("Confirm");
        String flightID=A.getFlightID();
        String passengerID=A.getPassengerID();
        jp.setLayout(null);
        JButton back=new JButton("Back");
        JButton back1=new JButton("Home Page");
        JButton exp=new JButton();
        JButton exp1=new JButton();
        JButton exp2=new JButton();
        exp.setBackground(Color.WHITE);
        exp1.setBackground(Color.RED);
        exp2.setBackground(Color.BLUE);
        JLabel exptext=new JLabel("Unselected seats", JLabel.LEFT);
        JLabel exptext1=new JLabel("Seats chosen by someone else", JLabel.LEFT);
        JLabel exptext2=new JLabel("The seat you have chosen", JLabel.LEFT);
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
                    if (seatnum[0] != true) {
                        if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[0];
                        x.setBackground(Color.BLUE);
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
                    if ( seatnum[1] != true) {
                            if(cha!=-1){
                                x[cha].setBackground(Color.WHITE);
                            }
                        JButton x = Seat.this.x[1];
                        x.setBackground(Color.BLUE);
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
                    if (seatnum[2] != true) {
                        if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                    JButton x = Seat.this.x[2];
                    x.setBackground(Color.BLUE);
                    bus = 1;
                    cha = 2;
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[3];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[4];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[5];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[6];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[7];
                        x.setBackground(Color.BLUE);
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
                    if (  seatnum[8] != true) {
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[8];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[9];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[10];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[11];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[12];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[13];
                        x.setBackground(Color.BLUE);
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
                    if ( seatnum[14] != true) {
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[14];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[15];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[16];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[17];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[18];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[19];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[20];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[21];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[22];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[23];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[24];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[25];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[26];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[27];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[28];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[29];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[30];
                        x.setBackground(Color.BLUE);
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
                          if(cha!=-1){
                            x[cha].setBackground(Color.WHITE);
                        }
                        JButton x = Seat.this.x[31];
                        x.setBackground(Color.BLUE);
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
                    if(cha!=-1) {
                        double payment=bus*100+mov*20+leg*60;
 //                       if (bus == 0 && mov == 0 && leg == 0) {
                            frame.setVisible(false);
                            new MealWindow(flightID,passengerID,A,cha,bus,payment);
 //                       }
//                        else {
//                            closeThis();
//                            formpay(bus, mov, leg, flightID,passengerID,A,cha);
//                        }
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
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                new Summary(A);
                frame.setVisible(false);
            }
        });
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                new BookingNumberCheckIn();
                frame.setVisible(false);
            }
        });


        con.setBounds(520, 600, 120, 30);
        jp.add(con);
        back.setBounds(200,600,120,30);
        back1.setBounds(800,600,120,30);
        jp.add(back);
        jp.add(back1);
        exp.setBounds(880, 100, 20, 20);
        exp1.setBounds(880, 130, 20, 20);
        exp2.setBounds(880, 160, 20, 20);
        jp.add(exp);
        jp.add(exp1);
        jp.add(exp2);

        lable.setFont(font1);
        lable.setForeground(Color.white);
        jp.add(lable);
        lable.setBounds(0,0,850,100);
        lable2.setFont(font3);
        lable2.setForeground(Color.BLACK);
        jp.add(lable2);
        lable2.setBounds(300,220,200,20);
        lable3.setFont(font3);
        lable3.setForeground(Color.BLACK);
        jp.add(lable3);
        lable3.setBounds(530,220,200,20);
        exptext.setFont(font3);
        exptext1.setFont(font3);
        exptext2.setFont(font3);
        jp.add(exptext);
        jp.add(exptext1);
        jp.add(exptext2);
        exptext.setBounds(910,100,200,20);
        exptext1.setBounds(910,130,300,20);
        exptext2.setBounds(910,160,300,20);

        ne.setBounds(350,450,110,20);
        jp.add(ne);
        fm.setBounds(680,450,100,20);
        jp.add(fm);

        lo.setBounds(820,10,350,67);
        jp.add(lo);
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

    public Seat(Booking A)
    {
        form(A);
    }
}

