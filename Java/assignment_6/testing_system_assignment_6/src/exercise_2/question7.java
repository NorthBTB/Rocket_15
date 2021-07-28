package exercise_2;

import java.util.Scanner;

public class question7 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(inputInt());
	}

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Nhap lai:");
			}
		}
	}

}
