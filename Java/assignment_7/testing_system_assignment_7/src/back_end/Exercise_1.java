package back_end;

import entity.Studentex1;

public class Exercise_1 {
	
	//chuyen cac Student sang Dai hoc cong nghe;
	public static void question1(Studentex1[] students) {

		for (int i = 0; i < 3; i++) {
			System.out.println(students[i].toString() + "\ncollege : " + Studentex1.getCollege());
		}

		Studentex1.changeCollege("Dai hoc cong nghe");
		for (int i = 0; i < 3; i++) {
			System.out.println(students[i].toString() + "\ncollege : " + Studentex1.getCollege());
		}
	}
	
	//tien quy lop
	public static void question2(Studentex1[] students) {
		System.out.println("Tong tien quy : " + Studentex1.getMoney_Group());
		// student thu nhat lay 50k di mua bim bim, banh keo
		students[0].setMoney_Group(students[0].getMoney_Group() - 50);
		System.out.println("Tong tien quy : " + Studentex1.getMoney_Group());
		// student 2 lay 20k mua banh my
		students[1].setMoney_Group(students[1].getMoney_Group() - 20);
		System.out.println("Tong tien quy : " + Studentex1.getMoney_Group());
		// student thu 3 mua do dung hoc tap cho nhom
		students[2].setMoney_Group(students[2].getMoney_Group() - 150);
		System.out.println("Tong tien quy : " + Studentex1.getMoney_Group());
		// ca lop dong quy 50k
		for (int i = 0; i < 3; i++) {
			students[i].setMoney_Group(Studentex1.getMoney_Group() + 50);
		}
		System.out.println("Tong tien quy : " + Studentex1.getMoney_Group());
	}
}
