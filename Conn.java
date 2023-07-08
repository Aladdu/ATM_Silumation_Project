package bankingSystem.ATM;

 import java.sql.*;
public class Conn {

	//Register toDriver
	//Create Connection
	//Create statement
	//Execute query
	//closing the connection
	
	Connection c;
	Statement s;
	
	public Conn() {
		try {
			
			c=DriverManager.getConnection("jdbc:mysql:///bankingSystem","root", "123143");
			s=c.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	

}
