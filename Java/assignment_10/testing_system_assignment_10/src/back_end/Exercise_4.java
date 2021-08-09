package back_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.JDBCutils;

public class Exercise_4 {
	private static JDBCutils jdbc = new JDBCutils("database1");
	private static Scanner sc = new Scanner(System.in);

	private void deleteAccAndDepart(int departID, Connection c)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		String sql1 = "DELETE FROM Accountt WHERE DepartmentID = ? ;";
		String sql2 = "DELETE FROM Department WHERE DepartmentID = ? ;";
		// xoa account
		PreparedStatement st1 = c.prepareStatement(sql1);
		st1.setInt(1, departID);
		if (st1.executeUpdate() == 1) {
			System.out.println("Xoa accountt thanh cong");
		}
		// xoa department
		PreparedStatement st2 = c.prepareStatement(sql2);
		st2.setInt(1, departID);
		if (st2.executeUpdate() == 1) {
			System.out.println("Xoa department thanh cong");
		}
	}

	public void question1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection c = jdbc.openConnection();
		//turn off auto commit
		c.setAutoCommit(false);
		System.out.println("Nhap id cua department : ");
		int id = sc.nextInt();
		try {
			deleteAccAndDepart(id, c);
			//commit transaction
			c.commit();
			System.out.println("Connection commit!");
		} catch (Exception e) {
			e.printStackTrace();
			c.rollback();
			System.out.println("Transaction rollback");
		}
		// turn on auto commit
		c.setAutoCommit(true);
		
		c.close();
	}
}
