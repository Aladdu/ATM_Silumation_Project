package bankingSystem.ATM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener {
	JRadioButton r1,r2,r3,r4;
	JLabel c1,c2,c3,s1;
	JCheckBox s2,s3,s4,s5,s6,s7,s8;
	JButton b1,b2,b3;
	private String formno;

	Signup3(String formno){
		this.formno=formno;
		setLayout(null);
		setTitle("page.3");
		
		JLabel title=new JLabel("Page.3 Account Details");
		title.setBounds(280, 40, 400, 40);
		title.setFont(new Font("Releway",Font.BOLD,20));
		add(title);
		
		JLabel type=new JLabel("Account type:");
		type.setBounds(100,140,200,30);
		type.setFont(new Font("Releway",Font.BOLD,18));
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setBounds(110, 180, 200, 30);
		r1.setBackground(Color.white);
		r1.setFont(new Font("Releway",Font.BOLD,15));
		add(r1);
		
    	r2=new JRadioButton("Currant Account");
		r2.setBounds(350, 180, 200, 30);
		r2.setBackground(Color.white);
		r2.setFont(new Font("Releway",Font.BOLD,15));
		add(r2);
		
		r3=new JRadioButton("Fixed Deposite Account");
		r3.setBounds(110, 220, 200, 30);
		r3.setBackground(Color.white);
		r3.setFont(new Font("Releway",Font.BOLD,15));
		add(r3);
		
		r4=new JRadioButton("Recurring Account");
		r4.setBounds(350, 220, 200, 30);
		r4.setBackground(Color.white);
		r4.setFont(new Font("Releway",Font.BOLD,15));
		add(r4);
		
		ButtonGroup Rgroup=new ButtonGroup();
		Rgroup.add(r1);
		Rgroup.add(r2);
		Rgroup.add(r3);
		Rgroup.add(r4);
		
	    c1=new JLabel("Card Number:");
		c1.setBounds(100,280,200,30);
		c1.setFont(new Font("Releway",Font.BOLD,18));
		add(c1);
		
		c2=new JLabel("XXXX-XXXX-XXXX-4852");
		c2.setBounds(350,280,250,30);
		c2.setFont(new Font("Releway",Font.BOLD,18));
		add(c2);
		
	    c3=new JLabel("(your 12 digits cardnumber)");
		c3.setBounds(100,300,200,30);
		c3.setFont(new Font("Releway",Font.BOLD,10));
		add(c3);
		

	    c1=new JLabel("PIN NUMBER:");
		c1.setBounds(100,340,200,30);
		c1.setFont(new Font("Releway",Font.BOLD,18));
		add(c1);
		
		c2=new JLabel("XXXX");
		c2.setBounds(350,340,250,30);
		c2.setFont(new Font("Releway",Font.BOLD,18));
		add(c2);
		
		s1=new JLabel("Services Requied:");
		s1.setBounds(100, 400, 200, 30);
		s1.setFont(new Font("Releway",Font.BOLD,18));
		add(s1);
		
		s2=new JCheckBox("ATM CARD");
		s2.setBounds(100, 450, 200, 30);
		s2.setBackground(Color.white);
		s2.setFont(new Font("Releway",Font.BOLD,15));
		add(s2);
		
		s3=new JCheckBox("Internet Banking ");
		s3.setBounds(300, 450, 200, 30);
		s3.setBackground(Color.white);
		s3.setFont(new Font("Releway",Font.BOLD,15));
		add(s3);
		
		s4=new JCheckBox("Phone Banking");
		s4.setBounds(100, 500, 200, 30);
		s4.setBackground(Color.white);
		s4.setFont(new Font("Releway",Font.BOLD,15));
		add(s4);
		
		s5=new JCheckBox("Email& SMS alerts");
		s5.setBounds(300, 500, 200, 30);
		s5.setBackground(Color.white);
		s5.setFont(new Font("Releway",Font.BOLD,15));
		add(s5);
		
		s6=new JCheckBox("Check book");
		s6.setBounds(100, 550, 200, 30);
		s6.setBackground(Color.white);
		s6.setFont(new Font("Releway",Font.BOLD,15));
		add(s6);
		
		s7=new JCheckBox("E-statment");
		s7.setBounds(300, 550, 200, 30);
		s7.setBackground(Color.white);
		s7.setFont(new Font("Releway",Font.BOLD,15));
		add(s7);
		
		s8=new JCheckBox("I hereby declares that the above details are correct to the best of my knowledge");
		s8.setBounds(100, 600, 600, 20);
		s8.setFont(new Font("Releway",Font.BOLD,13));
		s8.setBackground(Color.white);
		add(s8);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(180,640,80,30);
		b1.setFont(new Font("Releway",Font.BOLD,10));
		b1.setBackground(Color.black);
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		add(b1);
		
		b2=new JButton("CANCAL");
		b2.setBounds(450, 640, 80, 30);
		b2.setFont(new Font("Releway",Font.BOLD,10));
		b2.setBackground(Color.black);
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		add(b2);
		
		b3=new JButton("BACK");
		b3.setBounds(320,640,80,30);;
		b3.setFont(new Font("Releway",Font.BOLD,10));
		b3.setBackground(Color.black);
		b3.addActionListener(this);
		b3.setForeground(Color.white);
		add(b3);
		
		
		getContentPane().setBackground(Color.white);
		setSize(800,750);
		setVisible(true); 
		setLocation(350,10);  
	}
	public void actionPerformed(ActionEvent ae) {
		String accounttype ="";
		if(ae.getSource()==b1) {
			
			if(r1.isSelected()) {
				accounttype="Saving account";
			}
			else if(r2.isSelected()) {
				accounttype="Currunt Account";
			}
			else if(r3.isSelected()) {
				accounttype="Fixed Deposite Account";
			}
			else if(r4.isSelected()) {
				accounttype="Recurring Account";
			}
			Random random=new Random();
			String cardnumber=""+ Math.abs((random.nextLong()%90000000L)+5040936000000000L);
			
			String pin_number=""+ Math.abs((random.nextLong()%9000L)+1000L);
			
			String facility="";
			if(s2.isSelected()) {
				facility=facility+"ATM Card";
			}
			else if(s3.isSelected()) {
				facility=facility+"Internet Banking";
			}
			else if(s4.isSelected()) {
				facility=facility+"Phone banking";
			}
			else if(s5.isSelected()) {
				facility=facility+"Email & SMS ALERT";
			}
			else if(s6.isSelected()) {
				facility=facility+"check book";
			}
			else if(s7.isSelected()) {
				facility=facility+"E-Statment";
			}
			try {
				if(accounttype.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is requied");
				}
				else {
					Conn conn=new Conn();
					String query1="Insert into Signup3 values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pin_number+"','"+facility+"')";
					String query2="Insert into Login values('"+formno+"','"+cardnumber+"','"+pin_number+"')";
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card number :"+cardnumber +"\n Pin :"+pin_number);
					
					setVisible(false);
					new Login().setVisible(true);
				}
			}catch(Exception e){
				
			}
		}else if(ae.getSource()==b3) {
			setVisible(false);
			new Signup2("").setVisible(true);
		}
		else if(ae.getSource()==b2) {
			System.exit(0);
		}
	}

public static void main(String args[]) {
	new Signup3("");
		
	
}
}

