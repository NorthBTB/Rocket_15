package exercise_4;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] a = s.split(" ");
		String r = "";
		for (int i = 0; i < a.length; i++) {
			String s1 = a[i].substring(0, 1).toUpperCase();
			String s2 = a[i].substring(1);
			r += s1 + s2 + " ";
		}

		System.out.println(r);
	}
}
