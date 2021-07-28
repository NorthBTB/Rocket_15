package exercise_2;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		inputAge();
	}

	public static void inputAge() {
		Scanner sc = new Scanner(System.in);
		try {
			String age = sc.nextLine();
			int a = Integer.valueOf(age);
			if (a <= 0)
				System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
		} catch (Exception e) {
			System.out.println("wrong inputing! Please input an age as int, input again.");
		} finally {
			sc.close();
		}
	}
}
