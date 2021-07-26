package exercise_2;

public class demo_Student_q1 {
	public static void main(String[] args) {
		Student_q1 st1 = new Student_q1(1, "Bui Tien Bac", 1);
		Student_q1 st2 = new Student_q1(2, "Nguyen Van An", 2);
		Student_q1 st3 = new Student_q1(3, "Nguyen Duc Phu", 3);
		Student_q1 st4 = new Student_q1(4, "Vu Thanh Nhan", 1);
		Student_q1 st5 = new Student_q1(5, "Nguyen Thi Hong Nhung", 2);
		Student_q1 st6 = new Student_q1(6, "Do Xuan Canh", 3);
		Student_q1 st7 = new Student_q1(6, "Nguyen Vu Long", 1);
		Student_q1 st8 = new Student_q1(7, "Ta Quang Huy", 2);
		Student_q1 st9 = new Student_q1(8, "Le Quang Duy", 3);
		Student_q1 st10 = new Student_q1(10, "Luong Van Loc", 1);

		Student_q1[] sts = { st1, st2, st3, st4, st5, st6, st7, st8, st9, st10 };

		// goi ca lop di diem danh
		System.out.println("----goi ca lop di diem danh--------------------");
		for (Student_q1 s : sts) {
			s.diem_danh();
		}

		// goi nhom 1 di hoc bai
		System.out.println("----goi nhom 1 di hoc bai--------------------");
		for (Student_q1 s : sts) {
			if (s.getGroup() == 1) {
				s.hoc_bai();
			}
		}

		// goi nhom 2 di don ve sinh
		System.out.println("----goi nhom 1 di don ve sinh--------------------");
		for (Student_q1 s : sts) {
			if (s.getGroup() == 2) {
				s.don_ve_dinh();
			}
		}
	}
}
