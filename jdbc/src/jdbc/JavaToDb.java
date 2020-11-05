package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JavaToDb {
	 public static void main(String a[]) 
	    { 
	        //Creating the connection 
	        String url = "jdbc:mysql://localhost:3306/test"; 
	        String user = "root"; 
	        String pass = "root"; 
	  
	        //Entering the data 
	        Scanner k = new Scanner(System.in); 
	        System.out.println("enter Sno"); 
	        int Sno = k.nextInt(); 
	        System.out.println("enter name"); 
	        String Name = k.next(); 
	        System.out.println("enter Email"); 
	        String Email = k.next(); 
	        System.out.println("enter PhoneNumber"); 
	        int PhoneNumber =  k.nextInt(); 
	  
	        //Inserting data using SQL query 
	        String sql = "insert into testtable values('"+Sno+"','"+Name+"',"+Email+",'"+PhoneNumber+"')"; 
	        Connection con=null; 
	        try
	        { 
	          //  DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
	            Class.forName("com.mysql.jdbc.Driver");
	            //Reference to connection interface 
	            con = DriverManager.getConnection(url,user,pass); 
	  
	            Statement st = con.createStatement(); 
	            st.executeUpdate(sql); 
	            
	            con.close(); 
	        } 
	        catch(Exception ex) 
	        { 
	            System.err.println(ex); 
	        } 
	        k.close();
	    } 
	 
}
