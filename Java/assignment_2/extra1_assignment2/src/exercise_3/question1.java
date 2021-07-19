package exercise_3;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen n :");
		int n= sc.nextInt();
		System.out.println("a/");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("b/");
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("c/");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("d/");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - i - 1)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
