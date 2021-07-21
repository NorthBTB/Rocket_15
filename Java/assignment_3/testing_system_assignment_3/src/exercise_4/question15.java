package exercise_4;

import java.util.Scanner;

public class question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap chuoi :");
		String s = sc.nextLine();
		String s1 = s.trim();
		sc.close();
		String[] s2 = s1.split(" ");
		String r = "";
		for (int i = s2.length - 1; i >= 0; i--) {
			r += s2[i] + " ";
		}
		System.out.println(r);
	}
}
