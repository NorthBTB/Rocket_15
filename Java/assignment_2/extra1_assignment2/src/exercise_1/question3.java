package exercise_1;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			if (a < min)
				min = a;
			if (a > max)
				max = a;
		}
		sc.close();
		System.out.println("min = " + min);
		System.out.println("max = " + max);

	}
}
