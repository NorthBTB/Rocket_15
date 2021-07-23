package object;

import java.util.Date;

public class Group {
	private String name;
	private Account creator;
	private Account[] accounts;
	private Date createDate;

	public Group() {
		super();
	}

	public Group(String name, Account creator, Account[] accounts, Date createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	public Group(String name, Account creator, String[] userNames, Date createDate) {
		super();
		this.name = name;
		this.creator = creator;
		Account[] accounts = {};
		for (int i = 0; i < userNames.length; i++) {
			accounts[i] = new Account(userNames[i]);
		}
		this.accounts = accounts;
		this.createDate = createDate;
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

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
