package testing_system_assignment_1;

public class Department {
	private int departmentID;	
	private String departmentName;
	
	
	public Department() {
		super();
	}

	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}
	
	
}
