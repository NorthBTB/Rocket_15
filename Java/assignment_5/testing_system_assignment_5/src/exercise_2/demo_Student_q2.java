package exercise_2;

public class demo_Student_q2 {
	public static void main(String[] args) {
		Student_q2 st = new Student_q2();

		// nhap thong tin student
		st.input_Infor();
		// xem thong tin student
		st.show_Infor();
		// xet hoc bong
		System.out.println(st.isHoc_Bong() ? "Duoc hoc bong" : "Khong duoc hoc bong");
	}
}
