package back_end;

import java.util.Date;

import entity.Student;

public class Exercise_2 {
	@SuppressWarnings("deprecation")
	public static void question1() {		
		Date date= new Date(18,05,2020);
		System.out.println(date);
	}
	
	@SuppressWarnings("deprecation")
	public static void question2() {
		Student st= new Student("Nguyen Van A");
		System.out.println(st.getName());	
		System.out.println(st.getId());
		System.out.println(st.getIdv2());
	}
}
