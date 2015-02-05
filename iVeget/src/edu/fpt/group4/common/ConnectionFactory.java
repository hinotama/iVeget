package edu.fpt.group4.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class lấy connection từ database
 * 
 * @author LeDN
 *
 */
public class ConnectionFactory {

	/**
	 * Method lấy connection từ database
	 * 
	 * @return connection
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Lấy class driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Lấy thông tin đăng nhập
			String server = "localhost";
			String port = "1433";
			String databaseName = "iVeget";
			String username = "sa";
			String password = "password";
			String url = "jdbc:sqlserver://" + server + ":" + port
					+ ";databaseName=" + databaseName;
			connection = DriverManager.getConnection(url, username, password);

			// Trả về connection
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
