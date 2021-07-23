package exercise_1;

import object.Department;

public class question1 {
	public static void main(String[] args) {
		Department d1= new Department();
		Department d2 = new Department(1,"Marketing");
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}
