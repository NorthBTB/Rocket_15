package back_end;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Exercise_1 {
	// question1 tao ket noi
	private static String DATABASE = "database1";
	private static Scanner sc = new Scanner(System.in);

	public static Connection openConnection(String database)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/database/database.properties"));
		String url = properties.getProperty("url") + database;
		String user = properties.getProperty("user");
		String pass = properties.getProperty("pass");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, pass);
		return connection;
	}

	public void question1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = openConnection(DATABASE);
		System.out.println("Ket noi thanh cong");
		c.close();
	}

	// question2 in ra id, name cua position
	private static void printPositionInfo() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		Connection c = openConnection(DATABASE);
		Statement statement = c.createStatement();
		String sql = "SELECT PositionID,PositionName FROM Positionn ORDER BY PositionID ASC;";
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.println(resultSet.getString("PositionID") + " | " + resultSet.getString("PositionName"));
		}
		
		c.close();
	}
	
	public void question2() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		printPositionInfo();
	}

	//question3 insert position
	private static void createPostion(String name)
			throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		Connection c = openConnection(DATABASE);
		String sql = "INSERT INTO Positionn(PositionName) " + "VALUES" + "(    ?    )";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
		c.close();
	}

	public void question3() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
		String name = sc.nextLine();
		createPostion(name);
	}
	
	//question4 update position co id = 4
	private static void updatePosition(int id,String name) throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		Connection c = openConnection(DATABASE);
		String sql="UPDATE Positionn SET PositionName = ? WHERE PositionID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.executeUpdate();
		c.close();
	}
	
	public void question4() throws FileNotFoundException, ClassNotFoundException, SQLException, IOException {
//		System.out.println("Nhap ten Position moi : ");
//		String name = sc.nextLine();
		String name = "Sale";
		updatePosition(4, name);
	}
	
	//question5 delete theo id nhap vao
	private static void deletePosition(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = openConnection(DATABASE);
		String sql = "DELETE FROM Positionn WHERE PositionID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		c.close();
	}
	
	public void question5() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("Nhap id muon xoa : ");
		int id =sc.nextInt();
		deletePosition(id);
	}
}
