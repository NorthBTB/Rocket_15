package exercise_4;

import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap Ho va Ten :");
		String s = sc.nextLine();
		String s1 = s.trim();
		sc.close();
		String[] s2 = s1.split(" ");
		String r = "";
		for (int i = 0; i < s2.length; i++) {
			r += s2[i].substring(0, 1).toUpperCase();
			r += s2[i].substring(1).toLowerCase();
			r += " ";
		}

		System.out.println(r);
	}
}
