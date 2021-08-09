package entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import utils.JDBCutils;

public class DepartmentDAO {
	private static Scanner sc = new Scanner(System.in);
	private static String TABLE = "Department";
	private static JDBCutils jdbc = new JDBCutils("database1");

	// question1 lay ra tat ca Department
	public ArrayList<Department> getDepartmentList()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		ArrayList<Department> d = new ArrayList<Department>();
		String sql = "SELECT * FROM " + TABLE + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			d.add(new Department(result.getInt("DepartmentID"), result.getString("DepartmentName")));
		}
		c.close();
		return d;
	}

	// question2 lay Department theo id
	public Department getDepartmentById(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE DepartmentID = " + id + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			Department d = new Department(result.getInt("DepartmentID"), result.getString("DepartmentName"));
			c.close();
			return d;
		}
		c.close();
		return null;

	}

	// question3 nguoi dung nhap vao id de tim kiem Department
	public Department getDepartmentByIdInput()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("Nhap id cua " + TABLE + " muon tim kiem");
		int id = sc.nextInt();
		return getDepartmentById(id);
	}

	// question4 check xem DepartmentName co ton tai khong?
	public Boolean isDepartmentNameExists(String departName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE DepartmentName = '" + departName + "';";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question5 tao department
	public void createDepartment(String departName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (isDepartmentNameExists(departName)) {
			throw new Exception("DepartmentName = " + departName + " da ton tai");
		}
		String sql = "INSERT INTO Department(DepartmentName)" + " VALUES " + "(		?		);";

		Connection c = jdbc.openConnection();
		PreparedStatement preStatement = c.prepareStatement(sql);
		preStatement.setString(1, departName);
		if (preStatement.executeUpdate() == 1) {
			System.out.println("Them Department thanh cong");
		}
		c.close();
	}

	// check Department co ton tai khong bang id
	public Boolean isDepartmentIdExists(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE DepartmentID = " + id + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question6 update Department

	public void updateDepartment(int id, String departName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isDepartmentIdExists(id)) {
			throw new Exception("Khong tim thay Department co id = " + id);
		}
		if (isDepartmentNameExists(departName)) {
			throw new Exception("DepartmentName = " + departName + " da ton tai");
		}
		Connection c = jdbc.openConnection();
		String sql = "UPDATE " + TABLE + " SET DepartmentName = ? WHERE DepartmentID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setString(1, departName);
		preparedStatement.setInt(2, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Cap nhat Department thanh cong");
		}
		c.close();
	}

	// question7 delete Department by id
	public void deleteDepartment(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isDepartmentIdExists(id)) {
			throw new Exception("Khong tim thay Department co id = " + id);
		}
		Connection c = jdbc.openConnection();
		String sql = "DELETE FROM " + TABLE + " WHERE DepartmentID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Xoa Department thanh cong");
		}
		c.close();
	}

	// call proceduce de xoa Department
	public void deleteDepartmentByProcedure(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isDepartmentIdExists(id)) {
			throw new Exception("Khong tim thay Department co id = " + id);
		}
		Connection c = jdbc.openConnection();
		String sql = "CALL Store_Delete_Department( ? )";
		CallableStatement statement = c.prepareCall(sql);
		statement.setInt(1, id);
		if (statement.executeUpdate() == 1) {
			System.out.println("Xoa department thanh cong");
		}
		c.close();
	}
}
