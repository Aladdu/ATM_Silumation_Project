package bankingSystem.ATM;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener{
	
	JLabel FullName,Formno,FName,dob,gender,email,marital,address,city,state,pincode;
	JTextField FirstNametext, FNametext, emailtext,addresstext,citytext,statetext,pincodetext;
	JRadioButton male,female,others,single,married,other;
	JButton next;
	JDateChooser datechooser;
	
	
	Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
	Signup( ){

		setTitle("PAGE1");
		setLayout(null);
		
	    Formno=new JLabel(" NEW APPLICATION FORM NO."+first);
		Formno.setFont(new Font("Releway",Font.BOLD,35));
		Formno.setBounds(140, 20, 650, 40);
		add(Formno);
		
		JLabel personaldetails=new JLabel("PAGE 1:PERSONAL DETAILS");
		personaldetails.setFont(new Font("Releway",Font.BOLD,22));
		personaldetails.setBounds(290, 80, 400, 40);
		add(personaldetails);
		
		FullName=new JLabel("Full Name:");
		FullName.setFont(new Font("Releway",Font.BOLD,20));
		FullName.setBounds(100, 140,150, 30);
		add(FullName);
		
	    FirstNametext=new JTextField();
		FirstNametext.setFont(new Font("Releway",Font.BOLD,14));
		FirstNametext.setBounds(300, 140, 400, 30);
		add(FirstNametext);
		
		 FName=new JLabel("Father Name:");
		FName.setFont(new Font("Releway",Font.BOLD,20));
		FName.setBounds(100, 190,150, 30);
		add( FName);
		
		FNametext=new JTextField();
		FNametext.setFont(new Font("Releway",Font.BOLD,14));
		FNametext.setBounds(300, 190, 400, 30);
		add(FNametext);
		
		
		 dob=new JLabel("D.O.B:");
		dob.setFont(new Font("Releway",Font.BOLD,20));
		dob.setBounds(100, 240,150, 30);
		add( dob);
		
		 datechooser=new JDateChooser();
		datechooser.setBounds(300, 240, 400, 30);
		add(datechooser);
		
		
		 gender=new JLabel("GENDER:");
		gender.setFont(new Font("Releway",Font.BOLD,20));
		gender.setBounds(100, 290, 150, 30);
		add(gender);
		
		 male=new JRadioButton("Male");
		male.setBounds(300, 290, 80, 30);
		male.setBackground(Color.WHITE);
		add(male);
		

		 female=new JRadioButton("Female");
		female.setBounds(400, 290, 80, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		 others=new JRadioButton("Others");
		others.setBounds(500, 290, 80, 30);
		others.setBackground(Color.WHITE);
		add(others);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(others);
		
		 email=new JLabel("Email Address:");
		email.setFont(new Font("Releway",Font.BOLD,20));
		email.setBounds(100,340,150,30);
		add(email);
		
		 emailtext=new JTextField();
		 emailtext.setFont(new Font("Releway",Font.BOLD,14));
		 emailtext.setBounds(300, 340, 400, 30);
		add( emailtext);
		
		 marital=new JLabel("Marital Status:");
		marital.setFont(new Font("Releway",Font.BOLD,20));
		marital.setBounds(100, 390, 150, 30);
		add(marital);
		
		 single=new JRadioButton("Single");
		single.setBounds(300, 390, 80, 30);
		single.setBackground(Color.WHITE);
		add(single);
		
		 married=new JRadioButton("Married");
		married.setBounds(400,390, 80, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		 other=new JRadioButton("Others");
		other.setBounds(500, 390, 80, 30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(single);
		maritalgroup.add(married);
		
		
		
		 address=new JLabel("Address:");
		address.setFont(new Font("Releway",Font.BOLD,20));
		address.setBounds(100, 440, 150, 30);
		add(address);
		

		addresstext=new JTextField();
		addresstext.setFont(new Font("Releway",Font.BOLD,14));
		addresstext.setBounds(300, 440, 400, 30);
		add( addresstext);
		
		 city=new JLabel("City:");
		city.setFont(new Font("Releway",Font.BOLD,20));
		city.setBounds(100, 490, 150, 30);
		add(city);
		
		 citytext=new JTextField();
		citytext.setFont(new Font("Releway",Font.BOLD,14));
		citytext.setBounds(300, 490, 400, 30);
		add( citytext);
		
		 state=new JLabel("State:");
		state.setFont(new Font("Releway",Font.BOLD,20));
		state.setBounds(100,540, 150, 30);
		add(state);
		
		statetext=new JTextField();
		statetext.setFont(new Font("Releway",Font.BOLD,14));
		statetext.setBounds(300, 540, 400, 30);
		add( statetext);
		
		
		 pincode=new JLabel("PINCODE:");
		pincode.setFont(new Font("Releway",Font.BOLD,20));
		pincode.setBounds(100,590,150, 30);
		add(pincode);
		

		pincodetext=new JTextField();
		pincodetext.setFont(new Font("Releway",Font.BOLD,14));
		pincodetext.setBounds(300, 590, 400, 30);
		add(pincodetext);
		
		next=new JButton("Next");
		next.setFont(new Font("Releway",Font.BOLD,14));
		next.setForeground(Color.white);
		next.setBackground(Color.black);
		next.setBounds(620,680, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);	
	}
   public void actionPerformed(ActionEvent ae) {
	  
	String formno = first;
	String name=FirstNametext.getText()	;
	String Fname=FNametext.getText();
	String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
	String gender=null;
	if(male.isSelected()) {
		gender="Male";
	}else if(female.isSelected()) {
		gender="Female";
	}else {
		gender="others";
	}
	String email=emailtext.getText();
	String marital=null;
	if(single.isSelected()) {
		marital="Single";	
	}
	else if(married.isSelected()) {
		marital="Married";
	}
	else{
		marital="Others";
	}
	 String address=addresstext.getText();
	 String city=citytext.getText();
	 String state=statetext.getText();
	 String pin=pincodetext.getText();
	 
	   try {
		   if(name.equals("")) {
			   JOptionPane.showMessageDialog(null, "All feilds are requied");
		   }else {
			   Conn c=new Conn();
			   String query = "INSERT INTO Signup VALUES ('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
		       c.s.executeUpdate(query);
		       
		       setVisible(false);
		       new Signup2(formno).setVisible(true);
		       } 		
		   
	   }catch(Exception e) {
		   System.out.println(e);
	   }
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup( );
	}
	
}

