package exercise_4;

import java.util.Scanner;

public class question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String s = sc.nextLine();
		System.out.println("Nhap ki tu muon an : ");
		String c = sc.next();
		sc.close();
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(c)) {
				r += "*";
			} else {
				r += s.substring(i, i + 1);
			}
		}
		System.out.println("Ket qua : " + r);
	}
}
