package entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import utils.JDBCutils;

public class AccountDAO {
	private static Scanner sc = new Scanner(System.in);
	private static String TABLE = "Accountt";
	private static JDBCutils jdbc = new JDBCutils("database1");

	// question1 lay ra tat ca Account
	public ArrayList<Account> getAccountList() throws Exception {
		Connection c = jdbc.openConnection();
		ArrayList<Account> a = new ArrayList<Account>();
		String sql = "SELECT * FROM " + TABLE + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			// lay ra ten cua department bang departmentid
			String departName = getDepartNamebyId(c, result.getInt("DepartmentID"));

			// lay ra ten cua position bang positionid
			String posName = getPosNamebyId(c, result.getInt("PositionID"));

			a.add(new Account(result.getInt("AccountID"), result.getString("Email"), result.getString("userName"),
					result.getString("fullName"), new Department(result.getInt("DepartmentID"), departName),
					new Position(result.getInt("PositionID"), posName), result.getDate("CreateDate")));
		}
		c.close();
		return a;
	}

	// question2 lay Account theo id
	public Account getAccountById(int id) throws Exception {
		if (isAccountIdExists(id)) {
			Connection c = jdbc.openConnection();
			String sql = "SELECT * FROM " + TABLE + " WHERE AccountID = '" + id + "';";
			Statement statement = c.createStatement();

			ResultSet result = statement.executeQuery(sql);
			if (result.next()) {
				// lay ra ten cua department bang departmentid
				String departName = getDepartNamebyId(c, result.getInt("DepartmentID"));

				// lay ra ten cua position bang positionid
				String posName = getPosNamebyId(c, result.getInt("PositionID"));

				Account a = new Account(result.getInt("AccountID"), result.getString("Email"),
						result.getString("userName"), result.getString("fullName"),
						new Department(result.getInt("DepartmentID"), departName),
						new Position(result.getInt("PositionID"), posName), result.getDate("CreateDate"));
				c.close();
				return a;
			}
			c.close();
			return null;
		} else {
			throw new Exception("Account co id = " + id + " khong ton tai");
		}
	}

	// question3 nguoi dung nhap vao id de tim kiem Account
	public Account getAccountByIdInput() throws Exception {
		System.out.println("Nhap id cua " + TABLE + " muon tim kiem");
		int id = sc.nextInt();
		return getAccountById(id);
	}

	// question4 check xem UserName co ton tai khong?
	public Boolean isUserNameExists(String userName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE UserName = '" + userName + "';";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question5 tao Account
	public void createAccount(String email, String userName, String fullName, String departName, String posName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (isUserNameExists(departName)) {
			throw new Exception("UserName : " + userName + " da ton tai");
		}
		String sql = "INSERT INTO Accountt(Email,UserName,FullName,DepartmentID,PositionID,CreateDate)" + " VALUES"
				+ "(	?	,	?	,	?	,	?	,	?	,	?		);";

		Connection c = jdbc.openConnection();
		PreparedStatement preStatement = c.prepareStatement(sql);
		// lay id cua department
		int departID = getDepartIDbyName(c, departName);
		// lay id cua position
		int posID = getPostIDbyName(c, posName);
		preStatement.setString(1, email);
		preStatement.setString(2, userName);
		preStatement.setString(3, fullName);
		preStatement.setInt(4, departID);
		preStatement.setInt(5, posID);
		preStatement.setDate(6, new Date(System.currentTimeMillis()));
		if (preStatement.executeUpdate() == 1) {
			System.out.println("Them Account thanh cong");
		}
		c.close();
	}

	// check Account co ton tai khong bang id
	public Boolean isAccountIdExists(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE AccountID = " + id + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question6 update Account - userName

	public void updateAccount(int id, String userName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isAccountIdExists(id)) {
			throw new Exception("Khong tim thay Account co id = " + id);
		}
		if (isUserNameExists(userName)) {
			throw new Exception("UserName = " + userName + " da ton tai");
		}
		Connection c = jdbc.openConnection();
		String sql = "UPDATE " + TABLE + " SET UserName = ? WHERE AccountID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setString(1, userName);
		preparedStatement.setInt(2, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Cap nhat Account thanh cong");
		}
		c.close();
	}

	// question7 delete Account by id
	public void deleteAccount(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isAccountIdExists(id)) {
			throw new Exception("Khong tim thay Account co id = " + id);
		}
		Connection c = jdbc.openConnection();
		String sql = "DELETE FROM " + TABLE + " WHERE AccountID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Xoa Account thanh cong");
		}
		c.close();
	}

	// ----------------------------------------------------------------------------
	private static String getDepartNamebyId(Connection c, int id) throws Exception {
		String sql = "SELECT DepartmentName FROM Department WHERE DepartmentID = '" + id + "';";
		// lay ra ten cua department bang departmentid
		Statement statement = c.createStatement();
		ResultSet result = statement.executeQuery(sql);
		if (!result.next()) {
			throw new Exception("Khong tim thay DeparmentName co id = " + id);
		}
		String departName = result.getString("DepartmentName");
		return departName;
	}

	private static String getPosNamebyId(Connection c, int id) throws Exception {
		String sql = "SELECT PositionName FROM Positionn WHERE PositionID = '" + id + "';";
		// lay ra ten cua department bang departmentid
		Statement statement = c.createStatement();
		ResultSet result = statement.executeQuery(sql);
		if (!result.next()) {
			throw new Exception("Khong tim thay PositionName co id = " + id);
		}
		String posName = result.getString("PositionName");
		return posName;
	}

	private static int getDepartIDbyName(Connection c, String departName) throws Exception {
		String sql = "SELECT DepartmentID FROM Department WHERE DepartmentName = '" + departName + "';";
		// lay ra ten cua department bang departmentid
		Statement statement = c.createStatement();
		ResultSet result = statement.executeQuery(sql);
		if (!result.next()) {
			throw new Exception("Khong tim thay DepartmentId co DepartmentName = " + departName);
		}
		int id = result.getInt("DepartmentID");
		return id;
	}

	private static int getPostIDbyName(Connection c, String posName) throws Exception {
		String sql = "SELECT PositionID FROM Positionn WHERE PositionName = '" + posName + "';";
		// lay ra ten cua department bang departmentid
		Statement statement = c.createStatement();
		ResultSet result = statement.executeQuery(sql);
		if (!result.next()) {
			throw new Exception("Khong tim thay PositionId co PositionName = " + posName);
		}
		int id = result.getInt("PositionID");
		return id;
	}
}
