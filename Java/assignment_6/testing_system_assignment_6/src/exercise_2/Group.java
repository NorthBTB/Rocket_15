package exercise_2;

import java.util.ArrayList;

public class Group {
	private static int COUNT = 0;
	private int groupID;
	private String name;
	private Account creator;
	private ArrayList<Account> accounts;

	public Group() {
		super();
		COUNT++;
		this.groupID = COUNT;
		System.out.println("Nhap ten group : ");
		this.name = question8.inputString();
		System.out.println("Nhap thong tin nguoi tao : ");
		this.creator = new Account();
		this.accounts = new ArrayList<Account>();
		System.out.println("Ban co muon them thanh vien vao group k?\n1, Co\n2, Khong");
		int option = question8.inputOption(2);
		switch (option) {
		case 1:
			System.out.println("Nhap so luong thanh vien muon them : ");
			int sl = question7.inputInt();
			for (int i = 0; i < sl; i++) {
				System.out.println("Nhap thong tin Account thu " + (i + 1));
				accounts.add(new Account());
			}
			break;
		case 2:
			break;
		default:
			break;
		}
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}
	
	public void groupInfo() {
		System.out.println("GroupName : "+name);
		System.out.println("Creator : "+ this.creator.toString());
		System.out.println("So luong thanh vien : "+this.accounts.size());
		System.out.println("Danh sach thanh vien : ");
		for(Account a : this.accounts) {
			System.out.println("--------------------");
			System.out.println(a.toString());
		}
	}

}
