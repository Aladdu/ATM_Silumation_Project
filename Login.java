package bankingSystem.ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
	JButton login,clear,signup;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	
Login(){
	setTitle("ASBI ATM SERVICES");
	
	setLayout(null);
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
	Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel label=new JLabel(i3);
	label.setBounds(70,10,100,100);
	add(label);
	
	JLabel text=new JLabel("WELLCOME TO ATM");
	text.setFont(new Font("osward",Font.BOLD,38));
	text.setBounds(200, 40, 400, 40);
	add(text);
	
	JLabel CardNO=new JLabel("Card NO:");
    CardNO.setFont(new Font("Raleway",Font.BOLD,28));
	CardNO.setBounds(120, 150, 150, 30);
	add(CardNO);
	
	cardTextField=new JTextField();
	cardTextField.setFont(new Font("Arial",Font.BOLD,14));
	cardTextField.setBounds(300, 160, 250, 30);
	add(cardTextField);
	
	JLabel Pin=new JLabel("PIN:");
	Pin.setFont(new Font("Raleway",Font.BOLD,28));
	Pin.setBounds(120, 220, 400, 30);
	add(Pin);
	
    pinTextField=new JPasswordField();
    pinTextField.setFont(new Font("Arial",Font.BOLD,14));
	pinTextField.setBounds(300, 230, 250, 30);
	add(pinTextField);
	
    login=new JButton("SIGN IN");
	login.setBackground(Color.BLACK);
	login.setForeground(Color.WHITE);
	login.addActionListener(this);
	login.setBounds(300, 280, 100, 30);
	add(login);
	
    clear=new JButton("CLEAR");
	clear.setBackground(Color.BLACK);
	clear.setForeground(Color.WHITE);
	clear.addActionListener(this);
	clear.setBounds(450, 280, 100, 30);
	add(clear);
	
    signup=new JButton("SIGN UP");
	signup.setBackground(Color.BLACK);
	signup.setForeground(Color.WHITE);
	signup.addActionListener(this);
	signup.setBounds(300, 330, 250, 30);
	add(signup);
	
	
	
	getContentPane().setBackground(Color.WHITE);
	
	setSize(800,480);
	setVisible(true);
	setLocation(350,200);
}

public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==clear){
		cardTextField.setText("");
		pinTextField.setText("");
		}
	if(ae.getSource()==login) {
		Conn conn=new Conn();
		String card_number=cardTextField.getText();
		String pin_number=pinTextField.getText();
	  String qurey="select * from Login where cardnumber='"+card_number+"' and pinnumber='"+pin_number+"'";	
	  try {
		  ResultSet rs=conn.s.executeQuery(qurey);
		  if(rs.next()) {
			  setVisible(false);
			  new Transaction("").setVisible(true);
		  }else {
			  JOptionPane.showMessageDialog(null, "invalid card number or pin");
		  }
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	}
	if(ae.getSource()==signup){
		setVisible(false);
		new Signup().setVisible(true);
	}
	
	
}
	public static void main(String[] args) {
    new Login();

	}

}
