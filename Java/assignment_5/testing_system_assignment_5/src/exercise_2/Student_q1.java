package exercise_2;

public class Student_q1 implements IStudent{
	private int id;
	private String name;
	private int group;
	
	public Student_q1(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
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

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public void diem_danh() {
		System.out.println(this.name + " dang diem danh");
		
	}

	@Override
	public void hoc_bai() {
		System.out.println(this.name + " dang hoc bai");
		
	}

	@Override
	public void don_ve_dinh() {
		System.out.println(this.name + " dang don ve sinh");
		
	}
	
	
}
