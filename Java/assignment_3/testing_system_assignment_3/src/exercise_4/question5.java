package exercise_4;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho : ");
		String s1 = sc.next();
		System.out.println("Nhap ten : ");
		String s2 = sc.next();
		sc.close();
		System.out.println("Ho va Ten : " + s1 + " " + s2);
	}

}
