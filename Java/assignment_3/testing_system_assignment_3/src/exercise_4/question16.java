package exercise_4;

import java.util.Scanner;

public class question16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap chuoi :");
		String s = sc.next();
		System.out.println("Nhap n : ");
		int n = sc.nextInt();
		sc.close();
		String r = "";
		if (s.length() % n == 0) {
			for (int i = 0; i < s.length() / n; i++) {
				r += s.substring(i * n, (i + 1) * n ) + " ";

			}
			System.out.println(r);
		} else {
			System.out.println("KO");
		}
	}
}
