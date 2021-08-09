package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import back_end.Exercise_3;

public class Program_3 {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		Exercise_3 exercise_3 = new Exercise_3();
		exercise_3.deleteDepartmentByProcedure();
	}
}
