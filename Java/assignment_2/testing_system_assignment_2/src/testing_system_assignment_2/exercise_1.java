package testing_system_assignment_2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import sun.font.CreatedFontTracker;
import testing_system_assignment_1.Account;
import testing_system_assignment_1.Department;
import testing_system_assignment_1.Group;
import testing_system_assignment_1.GroupAccount;
import testing_system_assignment_1.Position;

public class exercise_1 {
	public static void main(String[] args) {
		Department department1 = new Department(1,"Marketing");
		Department department2 = new Department(2,"Nhân viên");
		Department department3 = new Department(2,"Bảo vệ");
		
		Position position1 =new Position(1,"Giám đốc");
		Position position2 =new Position(2,"Dev");
		Position position3 =new Position(1,"Bảo vệ");
		
		Account account1 = new Account(1,"bac@gmail.com","North","Bui Tien Bac",department2,position1,null);
		Account account2 = new Account(2,"an@gmail.com","An","Nguyen Van An",department2,position2,null);
		Account account3 = new Account(3,"canh@gmail.com","Canh","Do Xuan Canh",department3,position3,null);
		
		Group group1 = new Group(1,"Share with me",account1,null);
		Group group2 = new Group(2,"Abc",account2,null);
		Group group3 = new Group(3,"Xyz",account3,null);
		
		GroupAccount grp_account1 = new GroupAccount(group1, account1,null);
		GroupAccount grp_account2 = new GroupAccount(group1, account2,null);
		GroupAccount grp_account3 = new GroupAccount(group2, account1,null);
		
		Account[] accounts = {account1, account2, account3};
		Position[] positions = { position1, position2, position3 };
		Department[] departments = { department1, department2, department3 };
		GroupAccount[] grp_accounts = {grp_account1,grp_account2,grp_account3};
		
		//-----------------------------------------------------------------------------------
		System.out.println();
		System.out.println("//Exercise1");
		//----
		System.out.println("//Question1");
		if(account2.getDepartment().toString()==null) {
			System.out.println("Nhân viên nay chưa có phòng ban");
		}
		else {
			System.out.println("Phòng ban của nhân viên này là " + account2.getDepartment().getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question2");
		int count=0;
		for(GroupAccount group_account : grp_accounts) {
			if(group_account.getAccount().getAccountID()== account1.getAccountID()){
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Nhân viên này chưa có group");
		}
		else if(count == 1 || count == 2) {
			System.out.print("Group cua nhan vien nay la :" );
			for(GroupAccount group_account : grp_accounts) {
				if(group_account.getAccount().getAccountID() == account1.getAccountID()){
					System.out.print(" " + group_account.getGroup().getName());
				}
			}
		}
		else if(count == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}
		else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		
		//----
		System.out.println();
		System.out.println("//Question3");
		String q3 = (account2.getDepartment().toString() == null) ? "Nhân viên nay chưa có phòng ban":"Phòng ban của nhân viên này là " + account2.getDepartment().getDepartmentName();
		System.out.println(q3);
		
		//----
		System.out.println();
		System.out.println("//Question4");
		String q4 = (account1.getPosition().getPositionName() == "Dev") ? "Day la Dev" : "Nguoi nay khong phai la Dev";
		System.out.println(q4);
		
		//----
		System.out.println();
		System.out.println("//Question5");
		count = 0;
		for(GroupAccount group_account : grp_accounts) {
			if(group_account.getGroup().getGroupID()==group1.getGroupID()){
				count+=1;
			}
		}
		switch(count) {
			case 1:
					System.out.println("Nhom 1 thanh vien");
					break;
			case 2:
					System.out.println("Nhom 2 thanh vien");
					break;
			case 3:
					System.out.println("Nhom 3 thanh vien");		
					break;
		}	
		
		//----
		System.out.println();
		System.out.println("//Question6");	
		count=0;
		for(GroupAccount group_account : grp_accounts) {
			if(group_account.getAccount().getAccountID()== account1.getAccountID()){
				count++;
			}
		}
		switch(count) {
			case 0:
				System.out.println("Nhân viên này chưa có group");
				break;
			case 1:
			case 2:
				System.out.print("Group cua nhan vien nay la :" );
				for(GroupAccount group_account : grp_accounts) {
					if(group_account.getAccount().getAccountID() == account1.getAccountID()){
						System.out.print(" " + group_account.getGroup().getName());
					}
				}
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			case 4:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;		
		}
			
		//----
		System.out.println();
		System.out.println("//Question7");
		switch(account1.getPosition().getPositionName()) {
			case "Dev":
				System.out.println("Day la Dev");
				break;
			default:
				System.out.println("Nguoi nay khong phai la Dev");
		}
		
		//----
		System.out.println();
		System.out.println("//Question8");
		for(Account a : accounts) {
			System.out.println(a.getEmail() + ", " + a.getFullName() + ", " + a.getDepartment().getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question9");
		for(Department d : departments) {
			System.out.println(d.getDepartmentID() + ", " + d.getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question10");
		for(int i=0;i<accounts.length;i++) {
			System.out.println("Thong tin Account thu " + (i+1) + " la :");
			System.out.println("Email : " + accounts[i].getEmail());
			System.out.println("Full Name : " + accounts[i].getFullName());
			System.out.println("Phong ban : " + accounts[i].getDepartment().getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question11");
		for(int i=0;i<departments.length;i++) {
			System.out.println("Thong tin Department thu " + (i+1) + " la :");
			System.out.println("ID : " + departments[i].getDepartmentID());
			System.out.println("Name : " + departments[i].getDepartmentName());	
		}
		
		//----
		System.out.println();
		System.out.println("//Question12");
		for(int i=0;i<2;i++) {
			System.out.println("Thong tin Department thu " + (i+1) + " la :");
			System.out.println("ID : " + departments[i].getDepartmentID());
			System.out.println("Name : " + departments[i].getDepartmentName());	
		}
		
		//----
		System.out.println();
		System.out.println("//Question13");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getAccountID()==2) continue;
			System.out.println("Thong tin Account thu " + (i+1) + " la :");
			System.out.println("Email : " + accounts[i].getEmail());
			System.out.println("Full Name : " + accounts[i].getFullName());
			System.out.println("Phong ban : " + accounts[i].getDepartment().getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question14");
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getAccountID()==4) break;
			System.out.println("Thong tin Account thu " + (i+1) + " la :");
			System.out.println("Email : " + accounts[i].getEmail());
			System.out.println("Full Name : " + accounts[i].getFullName());
			System.out.println("Phong ban : " + accounts[i].getDepartment().getDepartmentName());
		}
		
		//----
		System.out.println();
		System.out.println("//Question15");
		System.out.println("Cac so chan nho hon hoac bang 20 la : ");
		for(int i=2;i<21;i+=2) {
			System.out.print(i+" ");
		}
		
		//----
		System.out.println();
		System.out.println("//Question16");
		int j=0;
		while(j<accounts.length) {
			//if(accounts[i].getAccountID()==2) continue;
			System.out.println("Thong tin Account thu " + (j+1) + " la :");
			System.out.println("Email : " + accounts[j].getEmail());
			System.out.println("Full Name : " + accounts[j].getFullName());
			System.out.println("Phong ban : " + accounts[j].getDepartment().getDepartmentName());
			j++;
		}		
	}
}
