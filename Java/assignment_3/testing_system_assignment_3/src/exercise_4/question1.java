package exercise_4;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String[] a = s.split(" ");
		
		System.out.println("So luong cac tu trong xau vua nhap la : " + a.length);
	}
}
