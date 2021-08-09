package back_end;

import java.util.Scanner;

import entity.Account;
import entity.AccountDAO;
import entity.Department;
import entity.DepartmentDAO;

public class Exercise_2 {
	private static Scanner sc = new Scanner(System.in);
	DepartmentDAO departmentDAO = new DepartmentDAO();
	AccountDAO accountDAO = new AccountDAO();

	// demo Department
	public void DemoDepartment() throws Exception {
		while (true) {
			System.out.println("1.Xem danh sach Departments");
			System.out.println("2.Tim kiem Departments theo id");
			System.out.println("3.Kiem tra Department co ton tai khong bang id");
			System.out.println("4.Tao 1 Department");
			System.out.println("5.Sua Departments");
			System.out.println("6.Xoa Departments");
			System.out.println("7.Thoat");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Danh sach Departments : ");
				for (Department d : departmentDAO.getDepartmentList()) {
					System.out.println(d.toString());
				}
				break;

			case 2:
				System.out.println(departmentDAO.getDepartmentByIdInput().toString());
				break;

			case 3:
				System.out.println("Nhap id cua Department muon kiem tra : ");
				int id3 = sc.nextInt();
				System.out.println(departmentDAO.isDepartmentIdExists(id3));
				break;

			case 4:
				System.out.println("Nhap ten cua Department muon them moi : ");
				String name4 = sc.next();
				departmentDAO.createDepartment(name4);
				break;

			case 5:
				System.out.println("Nhap id cua Department can sua : ");
				int id5 = sc.nextInt();
				System.out.println("Nhap DepartmentName moi : ");
				String name5 = sc.next();
				departmentDAO.updateDepartment(id5, name5);
				break;

			case 6:
				System.out.println("Nhap id cua Department can xoa : ");
				int id6 = sc.nextInt();
				departmentDAO.deleteDepartment(id6);
				break;

			case 7:
				return;
			default:
				System.out.println("Hay chon dung chuc nang can thuc hien");
				break;
			}
		}
	}

	// demo Account
	public void DemoAccount() throws Exception {
		while (true) {
			System.out.println("1.Xem danh sach Account");
			System.out.println("2.Tim kiem Account theo id");
			System.out.println("3.Kiem tra UserName co ton tai khong");
			System.out.println("4.Tao 1 Account");
			System.out.println("5.Sua UserName");
			System.out.println("6.Xoa Account");
			System.out.println("7.Thoat");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Danh sach Account : ");
				for (Account a : accountDAO.getAccountList()) {
					System.out.println(a.toString());
				}
				break;

			case 2:
				if (accountDAO.getAccountByIdInput().toString() == null) {
					System.out.println("Khong tim thay Account yeu cau");
				} else {
					System.out.println(accountDAO.getAccountByIdInput().toString());
				}
				break;

			case 3:
				System.out.println("Nhap UserName muon kiem tra : ");
				String name3 = sc.next();
				System.out.println(accountDAO.isUserNameExists(name3));
				break;

			case 4:
				System.out.println("Nhap Email : ");
				String email4 = sc.next();
				System.out.println("Nhap UserName : ");
				String userName4=sc.next();
				System.out.println("Nhap Name : ");
				String name4=sc.next();
				System.out.println("Nhap Department : ");
				String department4 =sc.next();
				System.out.println("Nhap Position : ");
				String position4 =sc.next();
				accountDAO.createAccount(email4, userName4, name4, department4, position4);
				break;

			case 5:
				System.out.println("Nhap id cua Account can sua : ");
				int id5 = sc.nextInt();
				System.out.println("Nhap UserName moi : ");
				String name5 = sc.next();
				accountDAO.updateAccount(id5, name5);
				break;

			case 6:
				System.out.println("Nhap id cua Account can xoa : ");
				int id6 = sc.nextInt();
				accountDAO.deleteAccount(id6);
				break;

			case 7:
				return;
			default:
				System.out.println("Hay chon dung chuc nang can thuc hien");
				break;
			}
		}
	}
}
