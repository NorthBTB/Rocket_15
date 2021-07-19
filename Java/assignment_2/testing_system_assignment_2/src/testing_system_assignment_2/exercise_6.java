package testing_system_assignment_2;

import testing_system_assignment_1.Account;
import testing_system_assignment_1.Department;
import testing_system_assignment_1.Position;

public class exercise_6 {
	public static void main(String[] args) {
		// --------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("//Exercise6");
		Department department1 = new Department(1, "Marketing");
		Department department2 = new Department(2, "Nhân viên");
		Department department3 = new Department(2, "Bảo vệ");

		Position position1 = new Position(1, "Giám đốc");
		Position position2 = new Position(2, "Dev");
		Position position3 = new Position(1, "Bảo vệ");

		Account account1 = new Account(1, "bac@gmail.com", "North", "Bui Tien Bac", department2, position1, null);
		Account account2 = new Account(2, "an@gmail.com", "An", "Nguyen Van An", department2, position2, null);
		Account account3 = new Account(3, "canh@gmail.com", "Canh", "Do Xuan Canh", department3, position3, null);
		Account[] accounts = { account1, account2, account3 };
		// ----
		System.out.println();
		System.out.println("//Question1");
		in_so_chan();

		// ----
		System.out.println();
		System.out.println("//Question2");
		print_account_info(accounts);
		;

		// ----
		System.out.println();
		System.out.println("//Question3");
		in_so_nguyen_duong();
	}

	// ham in so chan nho hon 10
	public static void in_so_chan() {
		for (int i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
	}

	// ham in thong tin cac account
	public static void print_account_info(Account[] accounts) {
		for (Account a : accounts) {
			System.out.println(a.toString());
		}
	}

	// ham in so nguyen duong nho hon 10
	public static void in_so_nguyen_duong() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}
}
