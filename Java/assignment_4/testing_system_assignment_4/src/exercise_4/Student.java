package exercise_4;

public class Student {
	private int id;
	private String name;
	private String home_Town;
	private double mark;

	public Student(int id, String name, String home_Town) {
		super();
		this.id = id;
		this.name = name;
		this.home_Town = home_Town;
		this.mark = 0;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public void plus_mark(double plus) {
		if (this.mark + plus > 10) {
			System.out.println("Diem sau khi cong la " + (this.mark + plus) + " lon hon 10!");
		} else if (this.mark + plus < 0) {
			System.out.println("Diem sau khi tru la " + (this.mark + plus) + " nho hon 0!");
		} else {
			this.mark += plus;
			System.out.println("Diem sau khi cap nhat la : " + (this.mark));
		}
	}

	@Override
	public String toString() {
		String hl = "";
		if (this.mark < 4)
			hl = "Yeu";
		else if (this.mark >= 4 && this.mark < 6)
			hl = "Trung Binh";
		else if (this.mark >= 6 && this.mark < 8)
			hl = "Kha";
		else
			hl = "Gioi";
		return this.name + " - Hoc luc : " + hl;
	}

}
