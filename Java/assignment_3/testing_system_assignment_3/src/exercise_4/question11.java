package exercise_4;

import java.util.Scanner;

public class question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		String s = sc.next();
		System.out.println("Nhap ki tu can tim");
		String c = sc.next();
		sc.close();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals(c)) {
				count++;
			}
		}
		System.out.println("So lan xuat hien ki tu " + c + " : " + count);
	}
}
