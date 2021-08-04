package back_end;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entity.StudentEx2;

public class Exercise_2 {
	// question1
	public static void question1() {
		List<StudentEx2> students = new ArrayList<StudentEx2>();
		students.add(new StudentEx2("Nguyen Van B", "25/03/2000", 10d));
		students.add(new StudentEx2("Nguyen Van A", "12/02/2000", 8.9d));
		students.add(new StudentEx2("Nguyen Van C", "14/07/2000", 4.1d));
		for (StudentEx2 st : students) {
			System.out.println(st.toString());
		}
		Collections.sort(students);
		System.out.println("Sau khi sap xep:");
		for (StudentEx2 st : students) {
			System.out.println(st.toString());
		}
	}

	// question2
	public static void question2() {
		List<StudentEx2> students = new ArrayList<StudentEx2>();
		students.add(new StudentEx2("Nguyen Van B", "25/03/2000", 10d));
		students.add(new StudentEx2("Nguyen Van B", "18/07/2000", 9d));
		students.add(new StudentEx2("Nguyen Van B", "18/07/2000", 10d));
		students.add(new StudentEx2("Nguyen Van A", "12/02/2000", 8.9d));
		students.add(new StudentEx2("Nguyen Van C", "14/07/2000", 4.1d));
		for (StudentEx2 st : students) {
			System.out.println(st.toString());
		}
		Collections.sort(students);
		System.out.println("Sau khi sap xep:");
		for (StudentEx2 st : students) {
			System.out.println(st.toString());
		}
	}
}
