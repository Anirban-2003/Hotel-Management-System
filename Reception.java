import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reception extends JFrame implements ActionListener {

    JButton newcustomer,rooms,department,employees,customerinfo,managerinfo,checkout,updatestatus,updateroom,pickupservice,searchroom,logout;

    Reception(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel head=new JLabel("HOTEL RECEPTION");
        head.setBounds(220,0,400,30);
        head.setFont(new Font("Montserrat",Font.BOLD,25));
        add(head);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Image/7.jpeg"));
        Image i2= i1.getImage().getScaledInstance(370,440,Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(280,90,370,440);
        add(image);

        newcustomer= new JButton("New Customer Form");
        newcustomer.setFont(new Font("Arial",Font.BOLD,14));
        newcustomer.setBounds(40,50,200,35);
        newcustomer.setBackground(Color.BLACK);
        newcustomer.setForeground(Color.WHITE);
        newcustomer.addActionListener(this);
        add(newcustomer);

        rooms= new JButton("Rooms");
        rooms.setFont(new Font("Arial",Font.BOLD,14));
        rooms.setBounds(40,95,200,35);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department= new JButton("Department");
        department.setFont(new Font("Arial",Font.BOLD,14));
        department.setBounds(40,140,200,35);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        employees= new JButton("All Employees");
        employees.setFont(new Font("Arial",Font.BOLD,14));
        employees.setBounds(40,185,200,35);
        employees.setBackground(Color.BLACK);
        employees.setForeground(Color.WHITE);
        employees.addActionListener(this);
        add(employees);

        customerinfo= new JButton("Customer Info");
        customerinfo.setFont(new Font("Arial",Font.BOLD,14));
        customerinfo.setBounds(40,230,200,35);
        customerinfo.setBackground(Color.BLACK);
        customerinfo.setForeground(Color.WHITE);
        customerinfo.addActionListener(this);
        add(customerinfo);

        managerinfo= new JButton("Manager Info");
        managerinfo.setFont(new Font("Arial",Font.BOLD,14));
        managerinfo.setBounds(40,275,200,35);
        managerinfo.setBackground(Color.BLACK);
        managerinfo.setForeground(Color.WHITE);
        managerinfo.addActionListener(this);
        add(managerinfo);

        checkout= new JButton("Checkout");
        checkout.setFont(new Font("Arial",Font.BOLD,14));
        checkout.setBounds(40,320,200,35);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);

        updatestatus= new JButton("Update Status");
        updatestatus.setFont(new Font("Arial",Font.BOLD,14));
        updatestatus.setBounds(40,365,200,35);
        updatestatus.setBackground(Color.BLACK);
        updatestatus.setForeground(Color.WHITE);
        updatestatus.addActionListener(this);
        add(updatestatus);

        updateroom= new JButton("Update Room Status");
        updateroom.setFont(new Font("Arial",Font.BOLD,14));
        updateroom.setBounds(40,410,200,35);
        updateroom.setBackground(Color.BLACK);
        updateroom.setForeground(Color.WHITE);
        updateroom.addActionListener(this);
        add(updateroom);

        pickupservice= new JButton("Pickup Service");
        pickupservice.setFont(new Font("Arial",Font.BOLD,14));
        pickupservice.setBounds(40,455,200,35);
        pickupservice.setBackground(Color.BLACK);
        pickupservice.setForeground(Color.WHITE);
        pickupservice.addActionListener(this);
        add(pickupservice);

        searchroom= new JButton("Search Room");
        searchroom.setFont(new Font("Arial",Font.BOLD,14));
        searchroom.setBounds(40,500,200,35);
        searchroom.setBackground(Color.BLACK);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);

        logout= new JButton("Logout");
        logout.setFont(new Font("Arial",Font.BOLD,14));
        logout.setBounds(40,545,200,35);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);




        setBounds(330,50,700,670);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("New Customer Form")) {
            setVisible(false);
            new NewCustomer();
        } else if (ae.getActionCommand().equals("Search Room")) {
            setVisible(false);
            new SearchRoom();
        } else if (ae.getActionCommand().equals("Rooms")) {
            setVisible(false);
            new Rooms();
        } else if (ae.getActionCommand().equals("Department")) {
            setVisible(false);
            new Department();
        } else if (ae.getActionCommand().equals("Checkout")) {
            setVisible(false);
            new Checkout();
        } else if (ae.getActionCommand().equals("Logout")) {
            System.exit(0);
        } else if (ae.getActionCommand().equals("Manager Info")) {
            setVisible(false);
            new ManagerInfo();
        } else if (ae.getActionCommand().equals("All Employees")) {
            setVisible(false);
            new Employee();
        } else if (ae.getActionCommand().equals("Customer Info")) {
            setVisible(false);
            new CustomerInfo();
        }else if (ae.getActionCommand().equals("Pickup Service")) {
            setVisible(false);
            new Pickup();
        }else if (ae.getActionCommand().equals("Update Status")) {
            setVisible(false);
            new UpdateCheck();
        }else if (ae.getActionCommand().equals("Update Room Status")) {
            setVisible(false);
            new UpdateRoom();
        }
    }

    public static void main(String[] args){
        new Reception();
    }
}