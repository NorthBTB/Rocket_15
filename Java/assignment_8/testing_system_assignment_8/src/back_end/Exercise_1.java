package back_end;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import entity.StudentEx1;

public class Exercise_1 {
	private static Scanner sc = new Scanner(System.in);

	// question1
	public static void Question1() {
		ArrayList<StudentEx1> students = new ArrayList<StudentEx1>();
		students.add(new StudentEx1("Nguyen Van An"));
		students.add(new StudentEx1("Nguyen Van An"));
		students.add(new StudentEx1("Nguyen Van An"));
		students.add(new StudentEx1("Tran Duc Bo"));
		students.add(new StudentEx1("Tran Duc Bo"));
		int option;
		while (true) {
			System.out.println("---------chuc nang---------------------------");
			System.out.println("1. Xem danh sach students");
			System.out.println("2. In ra tong so phan tu cua students");
			System.out.println("3. In ra phan tu theo vi tri");
			System.out.println("4. In ra phan tu dau va phan tu cuoi cua students");
			System.out.println("5. Them 1 phan tu vao vi tri dau cua students");
			System.out.println("6. Them 1 phan tu vao vi tri cuoi cua students");
			System.out.println("7. Dao nguoc vi tri studetns");
			System.out.println("8. Tim kiem student theo id");
			System.out.println("9. Tim kiem student theo name");
			System.out.println("10. In ra cac student trung ten");
			System.out.println("11. Xoa name cua student theo id");
			System.out.println("12. Xoa Student theo id");
			System.out.println("13. Copy danh sach students");
			System.out.println("14. Thoat");
			System.out.println("Chon 1 chuc nang : ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Danh sach students : ");
				for (StudentEx1 st1 : students) {
					System.out.println(st1.toString());
				}
				break;

			case 2:
				System.out.println("Tong so phan tu cua students : " + students.size());
				break;

			case 3:
				System.out.println("Nhap vi tri : ");
				int vt = sc.nextInt();
				if (vt > students.size() || vt < 0) {
					System.out.println("Khong tim thay ket qua");
					break;
				}
				System.out.println(students.get(vt).toString());
				break;

			case 4:
				System.out.println("Phan tu dau tien cua students la : " + students.get(0).toString());
				System.out
						.println("Phan tu cuoi cung cua students la : " + students.get(students.size() - 1).toString());
				break;

			case 5:
				System.out.println("Nhap ten Student : ");
				String name5 = sc.nextLine();
				students.add(0, new StudentEx1(name5));
				System.out.println("Them thanh cong");
				break;

			case 6:
				System.out.println("Nhap ten Student : ");
				String name6 = sc.nextLine();
				students.add(students.size(), new StudentEx1(name6));
				System.out.println("Them thanh cong");
				break;

			case 7:
				Collections.reverse(students);
				System.out.println("Dao nguoc thanh cong");
				break;

			case 8:
				System.out.println("Nhap id : ");
				int id8 = sc.nextInt();
				System.out.println(searchStudentbyId(id8, students).toString());
				break;

			case 9:
				System.out.println("Nhap ten : ");
				String name9 = sc.nextLine();
				searchStudentbyName(name9, students);
				break;

			case 10:
				System.out.println("Danh sach cac Student trung ten : ");
				searchStudentDuplicateName(students);
				break;

			case 11:
				System.out.println("Nhap id : ");
				int id11 = sc.nextInt();
				deleteNamebyId(id11, students);
				break;

			case 12:
				System.out.println("Nhap id : ");
				int id12 = sc.nextInt();
				deleteStudentbyId(id12, students);
				break;

			case 13:
				ArrayList<StudentEx1> studentsCopie = new ArrayList<StudentEx1>();
				copyListStudents(students, studentsCopie);
				System.out.println("Danh sach copy : ");
				for (StudentEx1 st13 : studentsCopie) {
					System.out.println(st13.toString());
				}
				break;

			default:
				System.out.println("Hay chon dung chuc nang muon thuc hien");
				break;
			}

		}
	}

	public static void Question2() {
		ArrayList<StudentEx1> students = new ArrayList<StudentEx1>();
		students.add(new StudentEx1("Nguyen Van Nam"));
		students.add(new StudentEx1("Nguyen Van Huyen"));
		students.add(new StudentEx1("Tran Van Nam"));
		students.add(new StudentEx1("Nguyen Van A"));
		System.out.println("DS Students den phong van tu muon nhat den som nhat");
		printStudentStack(students);
		System.out.println("DS Students den phong van tu som nhat den muon nhat");
		printStudentQueue(students);
	}

	public static void Question4() {
		Set<String> stName = new HashSet<String>();
		stName.add("Nguyen Van An");
		stName.add("Nguyen Van Trang");
		stName.add("Tran Van An");
		stName.add("Nguyen Van An");
		stName.add("Bui Tien Bac");
		stName.add("Nguyen Van Trang");
		stName.add("Bui Tien Bac");
		for (String name : stName) {
			System.out.println(name);
		}
	}

	public static void Question6() {
		Map<Integer, String> students = new HashMap<Integer, String>();
		while (true) {
			System.out.println("1.Them student");
			System.out.println("2.In ra key students");
			System.out.println("3.In ra value students");
			System.out.println("4.In ra danh sach students duoc sap xep theo ten");
			System.out.println("5.Chuyen doi map students sang set");
			System.out.println("6.Thoat");
			System.out.println("Chon 1 chuc nang : ");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Nhap id : ");
				int id1 = sc.nextInt();
				System.out.println("Nhap ten : ");
				String name1 = sc.next();
				students.put(id1, name1);
				break;

			case 2:
				for (Map.Entry<Integer, String> st : students.entrySet()) {
					System.out.println(st.getKey());
				}
				break;

			case 3:
				for (Map.Entry<Integer, String> st : students.entrySet()) {
					System.out.println(st.getValue());
				}
				break;

			case 4:
				for (Map.Entry<Integer, String> st : students.entrySet()) {
					System.out.println("id = " + st.getKey() + ", name = " + st.getValue());
				}
				break;
			
			case 5:
				
		
				break;
				
			case 6:
				return;

			default:
				System.out.println("Hay chon dung chuc nang");
				break;
			}
		}
	}

	// Tim kiem student theo id
	private static StudentEx1 searchStudentbyId(int id, ArrayList<StudentEx1> students) {
		for (StudentEx1 st : students) {
			if (st.getId() == id) {
				return st;
			}
		}
		return null;
	}

	// Tim kiem student theo name
	private static void searchStudentbyName(String name, ArrayList<StudentEx1> students) {
		for (StudentEx1 st : students) {
			if (st.getName().equals(name)) {
				System.out.println(st.toString());
			}
		}
	}

	// Tim kiem cac student trung ten
	private static void searchStudentDuplicateName(ArrayList<StudentEx1> students) {
		for (StudentEx1 st1 : students) {
			for (StudentEx1 st2 : students) {
				if (st1.getName().equals(st2.getName())) {
					System.out.println(st1.toString());
				}
			}
		}
	}

	// Xoa ten cua student theo id
	private static void deleteNamebyId(int id, ArrayList<StudentEx1> students) {
		for (StudentEx1 st : students) {
			if (st.getId() == id) {
				st.setName(null);
				break;
			}
		}
	}

	// Xoa student theo id
	private static void deleteStudentbyId(int id, ArrayList<StudentEx1> students) {
		for (StudentEx1 st : students) {
			if (st.getId() == id) {
				students.remove(st);
				break;
			}
		}
	}

	// Copy Student
	private static void copyListStudents(ArrayList<StudentEx1> students, ArrayList<StudentEx1> studentsCopie) {
		for (StudentEx1 st : students) {
			studentsCopie.add(st);
		}
	}

	// in ra Students theo thu tu muon nhat den som nhat
	private static void printStudentStack(ArrayList<StudentEx1> students) {
		Stack<StudentEx1> st_students = new Stack<StudentEx1>();
		for (StudentEx1 st : students) {
			st_students.push(st);
		}
		while (!st_students.isEmpty()) {
			System.out.println(st_students.pop().toString());
		}

	}

	// in ra Students theo thu tu som nhat den muon nhat
	private static void printStudentQueue(ArrayList<StudentEx1> students) {
		Queue<StudentEx1> q_students = new LinkedList<StudentEx1>();
		for (StudentEx1 st : students) {
			q_students.add(st);
		}
		while (!q_students.isEmpty()) {
			System.out.println(q_students.poll().toString());
		}
	}
}
