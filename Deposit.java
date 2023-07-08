package bankingSystem.ATM;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
public class Deposit extends JFrame implements ActionListener{
	JButton deposit,back;
	JTextField amount_text;
	String pin_number;
Deposit(String pin_number){
	this.pin_number=pin_number;
	setLayout(null);
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
	Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(0, 0, 900, 900);
	add(image);
	
	JLabel text=new JLabel("Enter the amount you want to deposit");
	text.setBounds(200, 300, 400, 45);
	text.setForeground(Color.white);
	text.setFont(new Font("System",Font.BOLD,16));
	image.add(text);
	
	amount_text=new JTextField("");
	amount_text.setBounds(210, 350, 250, 30);
    amount_text.setFont(new Font("System",Font.BOLD,16));
	image.add(amount_text);
	
	deposit=new JButton("DEPOSIT");
	deposit.setBounds(335, 450, 150, 30);
	deposit.setFont(new Font("System",Font.BOLD,16));
	deposit.setForeground(Color.black);
	deposit.addActionListener(this);
	//deposit.setBackground(Color.black);
	image.add(deposit);
	
	back=new JButton("BACK");
	back.setBounds(335, 500, 150, 30);
	back.setFont(new Font("System",Font.BOLD,16));
	back.setForeground(Color.black);
	back.addActionListener(this);
	//back.setBackground(Color.black);
	image.add(back);
	
	
	getContentPane().setBackground(Color.white);
	setSize(900,900);
	setVisible(true);
	setLocation(300,100);
	
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==deposit) {
		try {
			String amount=amount_text.getText();
			Date date=new Date();
			if(amount.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposte");
			}else {
				try {
				Conn conn=new Conn();
				String query="insert into bank values('"+pin_number+"','"+date+"','deposit','"+amount+"')";
				conn.s.executeUpdate(query);
				setVisible(false);
				new Transaction(pin_number).setVisible(true);
			}catch(Exception e) {
				System.out.println(e);
			}}
		}catch(Exception e) {
			System.out.println(e);
		}
	}else if(ae.getSource()==back) {
		setVisible(false);
		new Transaction(pin_number).setVisible(true);
	}
}

	public static void main(String[] args) {
		new Deposit("");

	
	}
}
