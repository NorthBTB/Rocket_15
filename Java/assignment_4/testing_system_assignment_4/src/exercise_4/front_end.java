package exercise_4;

public class front_end {
	public static void main(String[] args) {
		Student st = new Student(1, "Bac", "Hai Duong");
		System.out.println(st.toString());
		//chuc nang set diem
		st.setMark(7);
		System.out.println(st.toString());
		//chuc nang cap nhat diem
		st.plus_mark(4);
		System.out.println(st.toString());
		st.plus_mark(-8);
		System.out.println(st.toString());
		st.plus_mark(3);
		System.out.println(st.toString());
		//toString la chuc nang in ra hoc luc
		
	}
}
