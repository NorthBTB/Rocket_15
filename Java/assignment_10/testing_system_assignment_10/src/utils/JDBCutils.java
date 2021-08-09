package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCutils {
	private static String DATABASE = "";
	private String databaseName;
	
	public JDBCutils(String databaseName) {
		super();
		this.databaseName = databaseName;
		DATABASE = databaseName;
	}

	public String getDatabaseName() {
		return databaseName;
	}
	
	public Connection openConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/database/database.properties"));
		String url = properties.getProperty("url") + DATABASE;
		String user = properties.getProperty("user");
		String pass = properties.getProperty("pass");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, pass);
		return connection;
	}
	
}
