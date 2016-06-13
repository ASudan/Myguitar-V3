package Myguitar.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SqliteDBUtil {
	private static String driverName;
	private static String dbURL;
	static{
		driverName = "org.sqlite.JDBC";
		dbURL="jdbc:sqlite:\\C:/Users/lst/Desktop/MyGuitar.db";
		//dbURL="jdbc:sqlite:db/MyGuitar.db";
	}
	public static Connection open(){
		try {
				Class.forName(driverName);
			try {
				return DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.open();
		// tester.add();
		System.out.println(conn);
	}
	
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


