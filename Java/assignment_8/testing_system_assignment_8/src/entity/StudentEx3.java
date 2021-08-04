package entity;

public class StudentEx3<T extends Number>{
	private T id;
	private String name;
	
	public StudentEx3(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentEx3 [id=" + id + ", name=" + name + "]";
	}
	
}
