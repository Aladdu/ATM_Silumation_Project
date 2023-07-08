
package bankingSystem.ATM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fast_cash extends JFrame implements ActionListener {
	JButton deposit,withdrow,balance_check,fast_cash,mini_statement,exit,pin_change;
	String pin_number;
	Fast_cash(String pin_number){
	this.pin_number=pin_number;
	
	setLayout(null);
	setTitle("");
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
	Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(0, 0, 900, 900);
	add(image);
	
	JLabel text=new JLabel("SELECT THE WITHDROW AMOUNT");
	text.setBounds(200, 300, 400, 45);
	text.setForeground(Color.white);
	text.setFont(new Font("System",Font.BOLD,16));
	image.add(text);
	
	deposit=new JButton("Rs.100");
	deposit.setBounds(180, 400, 120, 20);
	deposit.addActionListener(this);
	deposit.setFont(new Font("System",Font.BOLD,12));
	image.add(deposit);	
	
	
	withdrow=new JButton("Rs.500");
	withdrow.setBounds(180, 440, 120, 20);
	withdrow.addActionListener(this);
	withdrow.setFont(new Font("System",Font.BOLD,12));
	image.add(withdrow);	
	
	balance_check=new JButton("Rs.1000");
	balance_check.setBounds(180, 480, 120, 20);
	balance_check.addActionListener(this);
	balance_check.setFont(new Font("System",Font.BOLD,12));
	image.add(balance_check);	
	

	fast_cash=new JButton("Rs.2000");
	fast_cash.setBounds(380, 400, 120, 20);
	fast_cash.addActionListener(this);
	fast_cash.setFont(new Font("System",Font.BOLD,12));
	image.add(fast_cash);	
	
    mini_statement=new JButton("Rs.5000");
	mini_statement.setBounds(380, 440, 120, 20);
	mini_statement.addActionListener(this);
	mini_statement.setFont(new Font("System",Font.BOLD,12));
	image.add(mini_statement);	
	
	pin_change=new JButton("Rs.10000");
	pin_change.setBounds(380, 480, 120, 20);
	pin_change.addActionListener(this);
	pin_change.setFont(new Font("System",Font.BOLD,12));
	image.add(pin_change);	
	
	exit=new JButton("BACK");
	exit.setBounds(380, 520, 120, 20);
	exit.addActionListener(this);
	exit.setFont(new Font("System",Font.BOLD,12));
	image.add(exit);	
	
	
	setSize(900,900);
	setLocation(300,0);
	//setUndecorated(true);
	setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==exit) {
		setVisible(false);
		new Transaction("").setVisible(true);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Fast_cash("");
	}

}
