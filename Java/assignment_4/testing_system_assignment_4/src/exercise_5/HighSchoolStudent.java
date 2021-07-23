package exercise_5;

public class HighSchoolStudent extends Student{
	private String clazz;
	private String desired_University;
	
	public HighSchoolStudent(int id, String name, String clazz, String desired_University) {
		super(id, name);
		this.clazz = clazz;
		this.desired_University = desired_University;
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesired_University() {
		return desired_University;
	}

	public void setDesired_University(String desired_University) {
		this.desired_University = desired_University;
	}
	
	public HighSchoolStudent question_3() {
		return new HighSchoolStudent(1, "Nam", "Chuyen Van", "Dai hoc cong nghe");
	}
}
