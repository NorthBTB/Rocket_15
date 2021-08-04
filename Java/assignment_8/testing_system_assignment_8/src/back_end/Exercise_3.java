package back_end;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;
import entity.MyMap;
import entity.Phone;
import entity.StudentEx3;

public class Exercise_3 {

	private static Scanner sc = new Scanner(System.in);

	// question1
	public static void question1() {
		StudentEx3 st1 = new StudentEx3(1, "Bui Tien Bac");
		StudentEx3 st2 = new StudentEx3(2f, "Bui Tien Bac");
		StudentEx3 st3 = new StudentEx3(3d, "Bui Tien Bac");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}

	// question2
	public static void question2() {
		// in kieu int
		print(4);
		// in kieu float
		print(4f);
		// in kieu String
		print("Nguyen Van An");
		// in kieu StudentEx3
		print(new StudentEx3<Number>(1, "Nguyen Van An"));
	}

	private static <T> void print(T a) {
		System.out.println(a);
	}

	// question3
	public static void question3() {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(4);
		ArrayList<Float> a2 = new ArrayList<Float>();
		a2.add(1.2f);
		a2.add(3.1f);
		a2.add(4f);
		ArrayList<Long> a3 = new ArrayList<Long>();
		a3.add(10000l);
		a3.add(30000l);
		a3.add(4000l);
		ArrayList<Double> a4 = new ArrayList<Double>();
		a4.add(1.1d);
		a4.add(3.2d);
		a4.add(4.5d);
		System.out.println("Kieu Int : ");
		printArray(a1);
		System.out.println("\nKieu Float : ");
		printArray(a2);
		System.out.println("\nKieu Long : ");
		printArray(a3);
		System.out.println("\nKieu Double : ");
		printArray(a4);
	}

	private static <E> void printArray(ArrayList<E> a) {
		for (E e : a) {
			System.out.printf(e + " ");
		}
	}

	// question5
	public static void question5() {
		while (true) {
			System.out.println("1.Demo Int");
			System.out.println("2.Demo Float");
			System.out.println("3.Demo Double");
			System.out.println("4.Thoat");
			System.out.println("Chon demo : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				ArrayList<Integer> a1 = new ArrayList<Integer>();
				a1.add(1000);
				a1.add(1200);
				a1.add(1100);
				Employee<Integer> e1 = new Employee<Integer>(1, "Nguyen Van A", a1);
				System.out.println(e1.toString());
				break;

			case 2:
				ArrayList<Float> a2 = new ArrayList<Float>();
				a2.add(1000.1f);
				a2.add(1200.4f);
				a2.add(1100.67f);
				Employee<Float> e2 = new Employee<Float>(1, "Nguyen Van A", a2);
				System.out.println(e2.toString());
				break;

			case 3:
				ArrayList<Double> a3 = new ArrayList<Double>();
				a3.add(1000.67d);
				a3.add(1200.213d);
				a3.add(1100.00d);
				Employee<Double> e3 = new Employee<Double>(1, "Nguyen Van A", a3);
				System.out.println(e3.toString());
				break;

			case 4:
				return;

			default:
				System.out.println("Chon dung chuc nang");
				break;
			}
		}
	}

	public static void question6() {
		MyMap<Integer, String> m1 = new MyMap<Integer, String>(21313, "Nguyen Van A");
		MyMap<Float, String> m2 = new MyMap<Float, String>(21313.32f, "Nguyen Van A");
		MyMap<String, String> m3 = new MyMap<String, String>("0k2faf1313", "Nguyen Van A");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
	
	public static void question7() {
		Phone<String, String> m1= new Phone<String, String>("bac@gmail.com", "0967123456");
		Phone<Integer, String> m2= new Phone<Integer, String>(1, "0967123456");
		Phone<String, String> m3= new Phone<String, String>("Bui Tien Bac", "0967123456");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
