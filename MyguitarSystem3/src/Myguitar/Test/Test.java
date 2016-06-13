package Myguitar.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Myguitar.Dao.DaoFactory;
import Myguitar.Dao.IGuitarDaoFactory;
import Myguitar.Util.MySqlDBUtil;
import Myguitar.Util.SqliteDBUtil;


public class Test {

	public static void main(String[] args)
	{
		Connection conn = SqliteDBUtil.open();
		System.out.println(conn);

		Connection conn2 = MySqlDBUtil.open();
		System.out.println(conn2);

		IGuitarDaoFactory test = DaoFactory.createGuitarDao();
		PreparedStatement pstmt = null;
		String sql1 = "insert into Guitar(serialNumber,price,builder,type,backWood,topWood) VALUES (?,?,?,?,?,?)";
		try
		{
			pstmt = conn2.prepareStatement(sql1);
			pstmt.setString(1, "006");
			pstmt.setString(2, "800");
			pstmt.setString(3, "b2");
			pstmt.setString(4, "t3");
			pstmt.setString(5, "mg");
			pstmt.setString(6, "ys");
			if (pstmt.executeUpdate() > 0)
			{
				System.out.print("sql1 success");
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
