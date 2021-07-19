package testing_system_assignment_2;

import java.util.Scanner;

import testing_system_assignment_1.Account;
import testing_system_assignment_1.Department;
import testing_system_assignment_1.Position;

public class exercise_5 {
	public static void main(String[] args) {
		// ---------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("//Exercise5");
		Department department1 = new Department(1, "Marketing");
		Department department2 = new Department(2, "Nhân viên");
		Department department3 = new Department(2, "Bảo vệ");

		Position position1 = new Position(1, "Giám đốc");
		Position position2 = new Position(2, "Dev");
		Position position3 = new Position(1, "Bảo vệ");

		Position[] positions = { position1, position2, position3 };
		Department[] departments = { department1, department2, department3 };
		// ----
		System.out.println();
		System.out.println("//Question1");
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Nhap vao 3 so nguyen : ");
		for (int i = 0; i < 3; i++) {
			scanner1.nextInt();
		}
		scanner1.close();

		// ----
		System.out.println();
		System.out.println("//Question5");
		Account account4 = new Account();
		createAccount(account4, departments, positions);

		// ----
		System.out.println();
		System.out.println("//Question6");
		Department department4 = new Department();
		createDepartment(department4);

		// ----
		System.out.println();
		System.out.println("//Question7");
		Scanner scanner7 = new Scanner(System.in);
		System.out.println("Hay nhap so chan");
		while (scanner7.nextInt() % 2 == 1) {
			System.out.println("Ban phai nhap so chan!");
		}
		scanner7.close();

		// ----
		System.out.println();
		System.out.println("//Question8");
		System.out.println("Nhap chuc nang muon su dung");
		System.out.println("1. Tao 1 account moi.\n2. Tao 1 department moi.");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		Account a = new Account();
		Department d = new Department();
		if (option == 1) {
			System.out.println("Tao account...");
			createAccount(a, departments, positions);
		} else if (option == 2) {
			System.out.println("tao department...");
			createDepartment(d);
		}
	}

	// ham tao acccount
	public static void createAccount(Account a, Department[] departments, Position[] positions) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID :");
		System.out.println();
		int ID = sc.nextInt();
		System.out.print("Nhap Email :");
		System.out.println();
		String email = sc.next();
		System.out.print("Nhap UserName :");
		System.out.println();
		String userName = sc.next();
		System.out.print("Nhap FullName :");
		System.out.println();
		String fullName = sc.next();
		System.out.print("Nhap DepartmentID :");
		System.out.println();
		int deparmentID = sc.nextInt();
		System.out.print("Nhap PositionID :");
		System.out.println();
		int positionID = sc.nextInt();
//			System.out.println("Nhap CreateDate :");
//			String dateInput = sc.next();
//			String pattern = "yyyy-MM-dd";
//			SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);		
//			Date date = dateFormat.parse(dateInput);

		sc.close();

		a.setAccountID(ID);
		a.setEmail(email);
		a.setUserName(userName);
		a.setFullName(fullName);
		a.setDepartment(departments[deparmentID]);
		a.setPositions(positions[positionID]);
		a.setCreateDate(null);
		System.out.println(a.toString());
	}

	// ham tao department
	public static void createDepartment(Department d) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ID :");
		System.out.println();
		int ID = sc.nextInt();
		System.out.print("Nhap DepartmentName :");
		String Name = sc.next();
		sc.close();

		d.setDepartmentID(ID);
		d.setDepartmentName(Name);
		System.out.println(d.toString());
	}
}
