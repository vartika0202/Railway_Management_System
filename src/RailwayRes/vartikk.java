package RailwayRes;
import java.sql.DriverManager;
import java.sql.*;
import java.io.*;

public class vartikk {
	

	public static void main(String[] args)throws IOException {
	
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/akk","root","root");
		
			System.out.println("connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

		
		
	}

}

