package Myguitar.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDBUtil {
	public static final String url = "jdbc:mysql://localhost:3306/Guitarsale?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "123456";

	public static Connection conn = null;
	
	public static Connection open(){
		try
		{
			Class.forName(name);
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e)
		{
			e.printStackTrace();
	}

		return conn;
	}
	
	public static void main(String[] args)
	{
		Connection conn = MySqlDBUtil.open();
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
