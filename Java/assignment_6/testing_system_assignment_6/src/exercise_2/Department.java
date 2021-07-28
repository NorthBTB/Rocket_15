package exercise_2;

public class Department {
	private static int COUNT = 0;
	private int departmentID;
	private String departmentName;

	public Department() {
		super();
		COUNT += 1;
		this.departmentID = COUNT;
		System.out.println("Nhap ten phong ban : ");
		this.departmentName = question8.inputString();
	}

	public Department(String departmentName) {
		super();
		COUNT += 1;
		this.departmentID = COUNT;
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
