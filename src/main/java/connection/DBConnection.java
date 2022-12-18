package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connection==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://be5af17610dcfe:65ce0b58@eu-cdbr-west-03.cleardb.net/heroku_2529b0d8fbb6ed1?reconnect=true", "be5af17610dcfe", "65ce0b58");
			System.out.print("connected");
		}else {
			System.out.print("Not Connected");
		}
		return connection;
	}
}
