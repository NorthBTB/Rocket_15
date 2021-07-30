package entity;

public class StudentEx2 {
	private final int id;
	private String name;
	
	public StudentEx2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "StudentEx2 [id=" + id + ", name=" + name + "]";
	}
	
	public final void study() {
		System.out.println("Dang hoc bai");
	}
}
