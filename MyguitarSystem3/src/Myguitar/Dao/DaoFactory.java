package Myguitar.Dao;

public class DaoFactory {
	
	  private static String db="sqlite";
	  //private static String db = "mysql";

		public static IGuitarDaoFactory createGuitarDao()
		{
			IGuitarDaoFactory test = null;
			switch (db)
			{
			case "sqlite":
				test = new SqliteGuitarDaoFactory();
				break;
			case "mysql":
				test = new MySqlGuitarDaoFactory();
				break;
			}
			return test;

		}
}
