package exercise_2;

import java.util.Date;

public class Account {
	private static int COUNT = 0;
	private int accountID;
	private String Email;
	private String userName;
	private String fullName;

	public Account() {
		super();
		COUNT++;
		this.accountID = COUNT;
		System.out.println("Nhap email : ");
		this.Email = question8.inputEmail();
		System.out.println("Nhap username : ");
		this.userName = question8.inputString();
		System.out.println("Nhap fullname : ");
		this.fullName = question8.inputString();

	}

	public Account(String name) {
		super();
		COUNT++;
		this.accountID = COUNT;
		this.userName = name;
	}

	public Account(int accountID, String email, String userName, String fullName, Department department,
			Position position, Date createDate) {
		super();
		this.accountID = accountID;
		Email = email;
		this.userName = userName;
		this.fullName = fullName;

	}

	public int inputAge() throws InvalidAgeInputingException {
		System.out.println("Nhap tuoi : ");
		while (true) {
			int age = question7.inputInt();
			if (age <= 0) {
				throw new InvalidAgeInputingException("The age must be greater than 0");
			} else {
				if (age < 18) {
					throw new InvalidAgeInputingException("Your age must be greater than 18");
				} else {
					return age;
				}
			}
		}

	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", Email=" + Email + ", userName=" + userName + ", fullName="
				+ fullName + "]";
	}

}
