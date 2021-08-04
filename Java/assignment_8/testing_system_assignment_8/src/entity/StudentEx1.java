package entity;

public class StudentEx1 {
	private static int COUNT = 0;
	private int id;
	private String name;

	public StudentEx1(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	public StudentEx1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
