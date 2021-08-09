package entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import utils.JDBCutils;

public class PostionDAO {
	private static Scanner sc = new Scanner(System.in);
	private static String TABLE = "Positionn";
	private static JDBCutils jdbc = new JDBCutils("database1");

	// question1 lay ra tat ca Position
	public ArrayList<Position> getPositionList()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		ArrayList<Position> p = new ArrayList<Position>();
		String sql = "SELECT * FROM " + TABLE + ";";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		while (result.next()) {
			p.add(new Position(result.getInt("PositionID"), result.getString("PositionName")));
		}
		c.close();
		return p;
	}

	// question2 lay Position theo id
	public Position getPositionById(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE PositionID = '" + id + "';";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			Position p = new Position(result.getInt("PositionID"), result.getString("PositionName"));
			c.close();
			return p;
		}
		c.close();
		return null;

	}

	// question3 nguoi dung nhap vao id de tim kiem Position
	public Position getPositionByIdInput()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("Nhap id cua " + TABLE + " muon tim kiem");
		int id = sc.nextInt();
		return getPositionById(id);
	}

	// question4 check xem PositionName co ton tai khong?
	public Boolean isPositionNameExists(String posName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE PositionName = '" + posName + "';";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question5 tao Position
	public void createPosition(String posName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (isPositionNameExists(posName)) {
			throw new Exception("PositionName = " + posName + " da ton tai");
		}
		String sql = "INSERT INTO Position(PositionName)" + " VALUES" + "(		?		);";

		Connection c = jdbc.openConnection();
		PreparedStatement preStatement = c.prepareStatement(sql);
		preStatement.setString(1, posName);
		if (preStatement.executeUpdate() == 1) {
			System.out.println("Them Position thanh cong");
		}
		c.close();
	}

	// check Position co ton tai khong bang id
	public Boolean isPositionIdExists(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		String sql = "SELECT * FROM " + TABLE + " WHERE PositionID = '" + id + "';";
		Statement statement = c.createStatement();

		ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			c.close();
			return true;
		}
		c.close();
		return false;
	}

	// question6 update Position

	public void updatePosition(int id, String posName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isPositionIdExists(id)) {
			throw new Exception("Khong tim thay Position co id = " + id);
		}
		if (isPositionNameExists(posName)) {
			throw new Exception("PositionName = " + posName + " da ton tai");
		}
		Connection c = jdbc.openConnection();
		String sql = "UPDATE " + TABLE + " SET PositionName = ? WHERE PositionID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setString(1, posName);
		preparedStatement.setInt(2, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Cap nhat Position thanh cong");
		}
		c.close();
	}

	// question7 delete Position by id
	public void deletePosition(int id)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		if (!isPositionIdExists(id)) {
			throw new Exception("Khong tim thay Position co id = " + id);
		}
		Connection c = jdbc.openConnection();
		String sql = "DELETE FROM " + TABLE + " WHERE PositionID = ?;";
		PreparedStatement preparedStatement = c.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		if (preparedStatement.executeUpdate() == 1) {
			System.out.println("Xoa Position thanh cong");
		}
		c.close();
	}
}
