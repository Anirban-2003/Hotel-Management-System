import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    HotelManagementSystem(){

        //   Background  //
//        setSize(1366,768);
//        setLocation(100,100);
        setBounds(100,100,1024,545);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Image/1.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1366,768);
        add(image);

        //  Text //
        JLabel txt=new JLabel("Hotel Management System");
        txt.setBounds(20,300,1000,100);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("Montserrat", Font.BOLD,50));
        image.add(txt);

        //  Button  //
        JButton begin=new JButton("Next Page");
        begin.setBounds(850,450,150,50);
        begin.setBackground(Color.BLACK);
        begin.setForeground(Color.YELLOW);
        begin.addActionListener(this);
        begin.setFont(new Font("serif",Font.PLAIN,20));
        image.add(begin);

        setVisible(true);

        // Dipper  //

        while(true){
            txt.setVisible(false);
            try{
                Thread.sleep(500);
            }   catch (Exception e){
                e.printStackTrace();
            }
            txt.setVisible(true);
            try{
                Thread.sleep(500);
            }   catch (Exception e){
                e.printStackTrace();
            }
        }



    }


    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args){

        new HotelManagementSystem();


    }

}