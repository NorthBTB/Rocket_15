package entity;

public class Student {
	private static int COUNT = 0;
	private int id;
	private String name;

	public Student(String name) {
		super();
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}

	/**
	 * @deprecated replaced by {@link #getIdv2()}}
	 */
	public int getId() {
		return id;
	}

	public String getIdv2() {
		return "MSV : " + id;
	}

	public String getName() {
		return name;
	}

}
