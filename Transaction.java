package bankingSystem.ATM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {
	JButton deposit,withdrow,balance_check,fast_cash,mini_statement,exit,pin_change;
	String pin_number;
Transaction(String pin_number){
	this.pin_number=pin_number;
	
	setLayout(null);
	setTitle("");
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
	Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(0, 0, 900, 900);
	add(image);
	
	JLabel text=new JLabel("PLEASE SELECT THE TRANSACTION");
	text.setBounds(200, 300, 400, 45);
	text.setForeground(Color.white);
	text.setFont(new Font("System",Font.BOLD,16));
	image.add(text);
	
	deposit=new JButton("DEPOSIT");
	deposit.setBounds(180, 400, 120, 20);
	deposit.addActionListener(this);
	deposit.setFont(new Font("System",Font.BOLD,10));
	image.add(deposit);	
	
	
	withdrow=new JButton("WITHDROW");
	withdrow.setBounds(180, 440, 120, 20);
	withdrow.addActionListener(this);
	withdrow.setFont(new Font("System",Font.BOLD,10));
	image.add(withdrow);	
	
	balance_check=new JButton("BALANCE CHECK");
	balance_check.setBounds(180, 480, 120, 20);
	balance_check.addActionListener(this);
	balance_check.setFont(new Font("System",Font.BOLD,10));
	image.add(balance_check);	
	

	fast_cash=new JButton("FAST CASH");
	fast_cash.setBounds(380, 400, 120, 20);
	fast_cash.addActionListener(this);
	fast_cash.setFont(new Font("System",Font.BOLD,10));
	image.add(fast_cash);	
	
    mini_statement=new JButton("MINI STATEMENT");
	mini_statement.setBounds(380, 440, 120, 20);
	mini_statement.addActionListener(this);
	mini_statement.setFont(new Font("System",Font.BOLD,10));
	image.add(mini_statement);	
	
	pin_change=new JButton("PIN CHANGE");
	pin_change.setBounds(380, 480, 120, 20);
	pin_change.addActionListener(this);
	pin_change.setFont(new Font("System",Font.BOLD,10));
	image.add(pin_change);	
	
	exit=new JButton("EXIT");
	exit.setBounds(380, 520, 120, 20);
	exit.addActionListener(this);
	exit.setFont(new Font("System",Font.BOLD,10));
	image.add(exit);	
	
	
	setSize(900,900);
	setLocation(300,0);
	setUndecorated(true);
	setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==exit) {
		System.exit(0);
	}else if(ae.getSource()==deposit) {
		setVisible(false);
		new Deposit(pin_number).setVisible(true);
	}else if(ae.getSource()==withdrow) {
		setVisible(false);
		new Withdrow(pin_number).setVisible(true);
	}else if(ae.getSource()==fast_cash) {
		setVisible(false);
		new Fast_cash("").setVisible(true);
	}else if(ae.getSource()==mini_statement) {
		setVisible(false);
		new MiniStatement("").setVisible(true);
		}
	else if(ae.getSource()==pin_change) {
		setVisible(false);
		new Pin("").setVisible(true);
		}
	else if(ae.getSource()==balance_check) {
		setVisible(false);
		new BalanceEnquiry("").setVisible(true);
		}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Transaction("");
	}

}
