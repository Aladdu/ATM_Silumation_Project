package bankingSystem.ATM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Signup2 extends JFrame implements ActionListener{
	
	JLabel religion,category,income,education,occupation, pancard,aadher,phoneno,seniorCitizen,existingAccount;
	JTextField religiontext,pancardtext,aadhertext,phonenotext;
	JRadioButton exesting_yes,exesting_No,senior_yes,senior_No;
	JButton next;
	JComboBox Categorytext,incometext,educationtext,occupationtext,seniorCitizentext,existingAccounttext;
	String formno;
	Signup2(String formno){

		this.formno=formno;
		setTitle("PAGE 2");
		setLayout(null);
		
		JLabel additionaldetails=new JLabel("PAGE 2:Additional Details");
		additionaldetails.setFont(new Font("Releway",Font.BOLD,22));
		additionaldetails.setBounds(290, 60, 400, 40);
		add(additionaldetails);
		
		religion=new JLabel("Religion:");
		religion.setFont(new Font("Releway",Font.BOLD,20));
		religion.setBounds(100, 120,150, 30);
		add(religion);
		
		religiontext=new JTextField();
		religiontext.setFont(new Font("Releway",Font.BOLD,14));
		religiontext.setBounds(300, 120, 400, 30);
		add(religiontext);
		
		category=new JLabel("Category:");
		category.setFont(new Font("Releway",Font.BOLD,20));
		category.setBounds(100, 170,150, 30);
		add( category);
		
		String Category_val[]= {"Not selected","BC","SC","ST","OC","Others"};
		Categorytext = new JComboBox(Category_val);
		Categorytext.setFont(new Font("Releway",Font.BOLD,14));
		Categorytext.setBounds(300, 170, 400, 30);
		Categorytext.setBackground(Color.white);
		add(Categorytext);
		
		
		income=new JLabel("Income:");
		income.setFont(new Font("Releway",Font.BOLD,20));
		income.setBounds(100, 220,150, 30);
		add( income);
		
		String income_val[]= {"Not selected","less then 1,00,000","1-2,00,000","2,00,00 above"};
		incometext = new JComboBox(income_val);
		incometext.setBackground(Color.white);
		incometext.setBounds(300, 220,400, 30);
		add( incometext);
		
		
		
		education=new JLabel("Education:");
		education.setFont(new Font("Releway",Font.BOLD,20));
		education.setBounds(100, 270, 150, 30);
		add(education);
		
		String education_val[]= {"Not Selected","SSC","INTER","DIPLOMA","UNDER DEGREE","POST GRADUATE","OTHERS"};
		educationtext = new JComboBox(education_val);
		educationtext.setBounds(300, 270, 400, 30);
		educationtext.setBackground(Color.white);
		add(educationtext);
		
		
		
		occupation=new JLabel("Occupation:");
		occupation.setFont(new Font("Releway",Font.BOLD,20));
		occupation.setBounds(100,320,150,30);
		add(occupation);
		
		String occupation_val[]= {"Not Selected","Salaried","Self Employe","Bussiness Man","Student","Others"};
		occupationtext = new JComboBox(occupation_val);
		 occupationtext.setBounds(300, 320, 400, 30);
		 occupationtext.setBackground(Color.WHITE);
		add(occupationtext);
		
		
		
		 pancard=new JLabel("PAN NUMBER:");
		 pancard.setFont(new Font("Releway",Font.BOLD,20));
		 pancard.setBounds(100, 370, 150, 30);
		add(pancard);
		

		pancardtext=new JTextField();
		pancardtext.setFont(new Font("Releway",Font.BOLD,14));
		pancardtext.setBounds(300, 370, 400, 30);
		add( pancardtext);
		
		aadher=new JLabel("Aadhar number:");
		aadher.setFont(new Font("Releway",Font.BOLD,20));
		aadher.setBounds(100, 430, 150, 30);
		add(aadher);
		
		aadhertext=new JTextField();
		aadhertext.setFont(new Font("Releway",Font.BOLD,14));
		aadhertext.setBounds(300, 430, 400, 30);
		add( aadhertext);
		
		phoneno=new JLabel("Phone number:");
		phoneno.setFont(new Font("Releway",Font.BOLD,20));
		phoneno.setBounds(100,480, 150, 30);
		add(phoneno);
		
		phonenotext=new JTextField();
		phonenotext.setFont(new Font("Releway",Font.BOLD,14));
		phonenotext.setBounds(300, 480, 400, 30);
		add( phonenotext);
		
		
		seniorCitizen=new JLabel("Senior Citizen:");
		seniorCitizen.setFont(new Font("Releway",Font.BOLD,20));
		seniorCitizen.setBounds(100,540,150, 30);
		add(seniorCitizen);
		
	    senior_yes=new JRadioButton("YES");
		senior_yes.setFont(new Font("Releway",Font.BOLD,14));
		senior_yes.setBackground(Color.white);
		senior_yes.setBounds(300,540, 80, 30);
		add(senior_yes);
		
	    senior_No=new JRadioButton("NO");
		senior_No.setFont(new Font("Releway",Font.BOLD,14));
		senior_No.setBackground(Color.white);
		senior_No.setBounds(400,540, 80, 30);
		add(senior_No);
		
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(senior_yes);
		gendergroup.add(senior_No);
		
		

		existingAccount=new JLabel("Existing Account:");
		existingAccount.setFont(new Font("Releway",Font.BOLD,20));
		existingAccount.setBounds(100,600,150, 30);
		add(existingAccount);
		
		exesting_yes=new JRadioButton("YES");
		exesting_yes.setFont(new Font("Releway",Font.BOLD,14));
		exesting_yes.setBounds(300,600, 80, 30);
		exesting_yes.setBackground(Color.white);
		add(exesting_yes);
		
		exesting_No=new JRadioButton("NO");
		exesting_No.setFont(new Font("Releway",Font.BOLD,14));
		exesting_No.setBackground(Color.white);
		exesting_No.setBounds(400,600, 80, 30);
		add(exesting_No);
		
		ButtonGroup gendergroup1=new ButtonGroup();
		gendergroup1.add(exesting_yes);
		gendergroup1.add(exesting_No);
		

		
		next=new JButton("Next");
		next.setFont(new Font("Releway",Font.BOLD,14));
		next.setForeground(Color.white);
		next.setBackground(Color.black);
		next.setBounds(620,660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);	
	}
   public void actionPerformed(ActionEvent ae) {
	  
	
	String religion=religiontext.getText();
	String category=(String) Categorytext.getSelectedItem();	
	String income=(String) incometext.getSelectedItem();
	String education=(String) educationtext.getSelectedItem();
	String occupation=(String) occupationtext.getSelectedItem();
	String pancard=pancardtext.getText();
	String aadher=aadhertext.getText();
	String phoneno=phonenotext.getText();

	 
	String seniorCitizen=null;
	if(exesting_yes.isSelected()) {
		seniorCitizen="YES";
	}else if(exesting_No.isSelected()) {
		seniorCitizen="NO";
	}
	 
	String existingAccount=null;
	if(exesting_yes.isSelected()) {
		existingAccount="YES";	
	}
	else if(exesting_No.isSelected()) {
		existingAccount="NO";
	}
	
	 
	 
	   try {
		   if(religion.equals("")) {
			   JOptionPane.showMessageDialog(null, "All feilds are requied");
		   }else {
			   Conn c=new Conn();
			   String query = "INSERT INTO Signup2 VALUES ('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pancard+"','"+aadher+"','"+phoneno+"','"+seniorCitizen+"','"+existingAccount+"')";
		      c.s.executeUpdate(query);
		      setVisible(false);
		      new Signup3(formno).setVisible(true);
		       } 		
		   
	   }catch(Exception e) {
		   System.out.println(e);
	   }
    }
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup2("");
	}
	
}

