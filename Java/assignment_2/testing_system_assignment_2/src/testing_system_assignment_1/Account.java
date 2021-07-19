package testing_system_assignment_1;

import java.util.Date;

public class Account {
	private int accountID;
	private String Email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;
	
	
	public Account() {
		super();
	}

	public Account(int accountID, String email, String userName, String fullName, Department department,
			Position position, Date createDate) {
		super();
		this.accountID = accountID;
		Email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPositions(Position position) {
		this.position = position;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", Email=" + Email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department.getDepartmentName() + ", position=" + position.getPositionName() + ", createDate=" + createDate
				+ "]";
	}
}
