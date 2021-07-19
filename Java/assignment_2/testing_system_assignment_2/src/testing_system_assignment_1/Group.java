package testing_system_assignment_1;

import java.util.Date;

public class Group {
	private int groupID;
	private String name;
	private Account creator;
	private Date createDate;
	
	public Group(int groupID, String name, Account creator, Date createDate) {
		super();
		this.groupID = groupID;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
