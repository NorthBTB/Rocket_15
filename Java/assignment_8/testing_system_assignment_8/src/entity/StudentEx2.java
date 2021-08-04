package entity;

public class StudentEx2 implements Comparable<StudentEx2> {
	private static int COUNT = 0;
	private int id;
	private String name;
	private String dob;
	private double mark;

	public StudentEx2(String name, String dob, double mark) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.dob = dob;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentEx2 [id=" + id + ", name=" + name + ", dob=" + dob + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(StudentEx2 student) {
		if (student.name.compareTo(name) == -1) {
			return 1;
		} else if (student.name.compareTo(name) == 1) {
			return -1;
		} else {
			if (student.dob.compareTo(dob) == -1) {
				return 1;
			} else if (student.dob.compareTo(dob) == 1) {
				return -1;
			} else {
				if (student.mark > mark) {
					return 1;
				} else if (student.mark < mark) {
					return -1;
				}
				return 0;
			}
		}
	}

}
