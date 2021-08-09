package back_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import entity.DepartmentDAO;

public class Exercise_3 {
	private static Scanner sc = new Scanner(System.in);
	DepartmentDAO departmentDAO = new DepartmentDAO();

	public void deleteDepartmentByProcedure()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		System.out.println("Nhap id cua Department muon xoa : ");
		int id = sc.nextInt();
		departmentDAO.deleteDepartmentByProcedure(id);
	}
}
