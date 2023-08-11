import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{


    Dashboard() {


        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Image/3.jpg"));
        Image i2= i1.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1366,768);
        add(image);


        JLabel txt = new JLabel("WELCOME TO THE MiRZAPUR HOTEL ");
        txt.setBounds(330,20,1000,80);
        txt.setFont(new Font("Arial",Font.TRUETYPE_FONT,45));
        txt.setForeground(Color.WHITE);
        image.add(txt);

        JMenuBar mb=new JMenuBar();
        mb.setBounds(0,0,1366,30);
        image.add(mb);


        JMenu hotel= new JMenu("Hotel Management");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem rec= new JMenuItem("Reception");
        rec.addActionListener(this);
        hotel.add(rec);

        JMenu admin=new JMenu("Admin");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addemp=new JMenuItem("Add Employee");
        addemp.addActionListener(this);
        admin.add(addemp);

        JMenuItem addroom=new JMenuItem("Add Rooms");
        addroom.addActionListener(this);
        admin.add(addroom);

        JMenuItem adddvr=new JMenuItem("Add Drivers");
        admin.add(adddvr);
        adddvr.addActionListener(this);

        setBounds(0,0,1366,768);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("Add Rooms")) {
            new AddRooms().setVisible(true);
        } else if (ae.getActionCommand().equals("Add Employee")) {
            new AddEmployee().setVisible(true);
        } else if (ae.getActionCommand().equals("Add Drivers")) {
            new AddDrivers().setVisible(true);
        } else if (ae.getActionCommand().equals("Reception")) {
            new Reception().setVisible(true);
        }
    }

    public static void main(String [] args){
        new Dashboard();
    }
}