package exercise_2;

import java.util.Scanner;

public class question8 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(inputDouble());
		System.out.println(inputFloat());
		System.out.println(inputString());
	}

	public static double inputDouble() {
		while (true) {
			try {
				return Double.valueOf(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Nhap lai:");
			}
		}
	}

	public static float inputFloat() {
		while (true) {
			try {
				return Float.valueOf(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Nhap lai:");
			}
		}
	}

	public static String inputString() {
		while (true) {
			String s = sc.nextLine();
			if (!s.isEmpty()) {
				return s;
			} else {
				System.out.println("Nhap lai:");
			}
		}
	}

	public static String inputEmail() {
		while (true) {
			String s = sc.nextLine();
			if (!s.isEmpty() && s.contains("@gmail.com")) {
				return s;
			} else {
				System.out.println("Email khong xac thuc!");
			}
		}
	}

	public static int inputOption(int a) {
		while (true) {
			try {
				int x = Integer.valueOf(sc.nextLine());
				if (x <= 0 || x > a) {
					System.out.println("Nhap lai:");
				} else {
					return Integer.valueOf(sc.nextLine());
				}
			} catch (Exception e) {
				System.out.println("Nhap lai:");
			}
		}
	}
}
